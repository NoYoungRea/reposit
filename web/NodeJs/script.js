const port=80;
var exp=require('express')
var server=exp();

server.listen(port,function(){
	console.log(port+'from port we start server')

})

server.use(exp.static('public'));
//정적 파일 route


//http://localhost/board?name="hgd"
server.get('/board',function(request,response){
	console.log(request.query.name);
})


