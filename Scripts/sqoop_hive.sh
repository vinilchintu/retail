table_id=$1

mapcolumn=""

sed -n '/'$1'/,/###/p' "/home/gopalkrishna/workspace/retail/Params/mysql_tables.params">/home/gopalkrishna/workspace/retail/Params/$table_id.params

. /home/gopalkrishna/workspace/retail/Params/$table_id.params

target_dir_count=$(echo "$target_dir/count/$table_name")
target_dir_hive=$(echo "$target_dir/hive/$table_name")

echo "$target_dir_count"
echo "$target_dir_hive"


echo "####### sqoop to get count from Source database  ########"

sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --query "select count(*) from $table_name where \$CONDITIONS" --delete-target-dir --target-dir $target_dir_count --num-mappers 1 --password root

echo "##### capturing count from hdfs #######"

count_before=$(hdfs dfs -cat $target_dir_count/part-m-00000)


echo "######## sqoop import to hive table #######"

import_query="sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --table $table_name --hive-import --hive-overwrite --hive-table $table_name --delete-target-dir --target-dir $target_dir_hive --num-mappers 1 --password root"


if [[ -n $mapcolumn ]]; then

import_query="sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --table $table_name --hive-import --hive-overwrite --hive-table $table_name --delete-target-dir --target-dir $target_dir_hive --num-mappers 1 --password root --map-column-hive rowguid=string"

fi

echo "$import_query"


eval $import_query


echo "####### hive query to count the data imported ########"

count_query="hive -e \" select count(*) from $table_name \" "

count_after=$(eval $count_query)


echo "######## checking whether record count matching or not ########"

if(($count_before==$count_after))
then
   echo "Import Success"
else
   echo "Import failed"
fi


rm -r /home/gopalkrishna/workspace/retail/Params/$table_id.params

