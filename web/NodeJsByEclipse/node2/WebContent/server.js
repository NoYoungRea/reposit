const port=80;
var express= require('express');
var app=express();
var io=require('socket.io')(8080)

app.listen(port,function(){
	console.log('by'+port)
})

app.use(express.static('.'));

io.on('connection',function(socket){
	let id=socket.id
	console.log('client :'+id)
	
	socket.on('message',function(data){
		io.emit('message','from server : '+data);
	})
})//like java's accpte