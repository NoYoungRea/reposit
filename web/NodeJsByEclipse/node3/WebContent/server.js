var mysql =require('mysql');

var conn=mysql.createConnection({
	host:'localhost',
	user:'nodejs',
	password:'1234',
	database:'nodejs'
})

conn.query('SELECT*FROM members',function(error,result,fields){
	if(error){
		console.log('error')
	}else{
		console.log(result);
		console.log(fields);
	}
	
})