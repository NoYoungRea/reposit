const port=80;
var express=require('express');
var app=express();

app.listen(port,function(){
	console.log('from port'+port);
})
app.use(express.static('.'))
//1.jpg 실험

//http://localhost/board/1000
app.get('/board/:number',function(request,response){
	console.log(request.params.number);
	response.send(request.params.number);
})