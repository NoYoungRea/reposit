const port=80;
var express =require("express");
var mysql=require('mysql');
var bodyParser=require('body-parser');

var app=express();
var conn=mysql.createConnection({
	host:'localhost',
	user:'nodejs',
	password:'1234',
	database:'nodejs'
})
app.use(bodyParser.urlencoded({extended:false}))
app.use(express.static('.'));
app.listen(port,function(){
	console.log('from'+port)
})
app.get('/members',function(request,response){
	conn.query('select*from members',function(error,result,fields){
		response,send(result);
	})
})