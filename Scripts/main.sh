table_id=$1

. /home/gopalkrishna/workspace/retail/Params/$table_id.params

target_dir_count=$(echo "$target_dir/count/$table_name")
target_dir_hive=$(echo "$target_dir/hive/$table_name")
target_dir_schema=$(echo "$target_dir/schema/$table_name")

echo "$target_dir_count"
echo "$target_dir_hive"


echo "####### sqoop to get count from Source database  ########"

#sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --query "select count(*) from $table_name where \$CONDITIONS" --delete-target-dir --target-dir $target_dir_count --num-mappers 1 --password root

echo "##### capturing count from hdfs #######"

#count_before=$(hdfs dfs -cat $target_dir_count/part-m-00000)





echo "####### sqoop to get schema from source ##########"

sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --query "select * from INFORMATION_SCHEMA.COLUMNS where table_name='culture' AND \$CONDITIONS" --delete-target-dir --target-dir $target_dir_count --num-mappers 1 --password root

echo "######## getting columns and data types #########"

schema=$(hdfs dfs -cat $target_dir_count/part-m-00000|cut -d "," -f 4,8)





echo "######## sqoop import to hive table #######"

import_query="sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --table $table_name --delete-target-dir --map-column-hive "Name=int" --hive-import --hive-overwrite --hive-table $table_name --target-dir $target_dir_hive --num-mappers 1 --password root"

eval $import_query


echo "####### hive query to count the data imported ########"

count_query="hive -e \" select count(*) from $table_name \" "

#count_after=$(eval $count_query)


echo "######## checking whether record count matching or not ########"

if(($count_before==$count_after))
then
   echo "Import Success"
else
   echo "Import failed"
fi

