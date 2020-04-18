const port=80;
var express =require("express");
var mysql=require('mysql');
var bodyParser=require('body-parser');

var app=express();
app.use(bodyParser.urlencoded({extended:false}))
app.use(express.static('.'));
app.listen(port,function(){
	console.log('from'+port)
})