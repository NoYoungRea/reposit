const port=80;
var exp=require('express')
var server=exp();

server.listen(port,function(){
	console.log(port+'from port we start server')
})

server.use(exp.static('public'));
//정적 파일 route

http://localhost or http://localhost/주소 get 방식 요청->이게 default이다.
server.get('/',function(request,response){
	console.log('요청주소 : http://localhost, method: get');
	response.send('get방식 요청에 대한 응답');
})
server.post('/',function(request,response){
	console.log('요청주소 : http://localhost, method: post');
	response.send('post방식 요청에 대한 응답');
})

