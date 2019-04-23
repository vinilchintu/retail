
table_id=$1


sed -n '/'$1'/,/###/p' "/home/gopalkrishna/workspace/retail/Params/mysql_tables.params">/home/gopalkrishna/workspace/retail/Params/$table_id.params


. /home/gopalkrishna/workspace/retail/Params/$table_id.params

target_dir_hdfs=$(echo "$target_dir/hdfs/$table_name")
target_dir_schema=$(echo "$target_dir/schema/$table_name")

echo "$target_dir_schema"
echo "$target_dir_hdfs"

echo "                                         "
echo "################### sqoop to get data into hdfs ##################"
echo "                                                "


sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --table $table_name --delete-target-dir --target-dir $target_dir_hdfs --num-mappers 1 --password root

echo "                                                "
echo "####### sqoop to get schema from source ##########"
echo "                                                "

sqoop import --connect jdbc:mysql://localhost/adventureworks --username root --query "select * from INFORMATION_SCHEMA.COLUMNS where table_name='$table_name' AND \$CONDITIONS" --delete-target-dir --target-dir $target_dir_schema --num-mappers 1 --password root

echo "                                                "
echo "######## getting columns and data types #########"
echo "                                                "

schema=$(hdfs dfs -cat $target_dir_schema/part-m-00000|cut -d "," -f 4,8|sed  's/,/ /g'|sed 's/datetime/timestamp/g'|sed 's/varchar/varchar(50)/g'|tr '\n' ','|sed 's/.$//')

echo "$schema"

hdfs_table_name=$(echo "${table_name}_hdfs")

hive -e "create Table IF NOT EXISTS $hdfs_table_name ($schema) ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' Location \"$target_dir_hdfs\" "

###############removing params temp file#########

rm -r /home/gopalkrishna/workspace/retail/Params/$table_id.params
