var mysql =require('mysql');

var conn=mysql.createConnection({
	host:'localhost',
	user:'nodejs',
	password:'1234',
	database:'nodejs'
})

conn.connect(function(error){
	if(error){
		console.log("error");
		console.log(error);
		return
	}
	else{
		console.log("complete")
	}
})