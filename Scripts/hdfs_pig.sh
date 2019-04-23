table_id=$1


sed -n '/'$1'/,/###/p' "/home/gopalkrishna/workspace/retail/Params/mysql_tables.params">/home/gopalkrishna/workspace/retail/Params/$table_id.params


. /home/gopalkrishna/workspace/retail/Params/$table_id.params

target_dir_hdfs=$(echo "$target_dir/hdfs/$table_name")
target_dir_schema=$(echo "$target_dir/schema/$table_name")

echo "$target_dir_schema"
echo "$target_dir_hdfs"


schema=$(hdfs dfs -cat $target_dir_schema/part-m-00000|cut -d "," -f 4,8|sed 's/,/ /g'|sed 's/datetime/timestamp/g'|sed 's/varchar/varchar(50)/g'|tr '\n' ','|sed 's/.$//')

