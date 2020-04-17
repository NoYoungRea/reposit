const port=80;
var exp=require('express')
var server=exp();

server.listen(port,function(){
	console.log(port+'from port we start server')
})
//서버를 열고 외부에서 연결을 기다리는 상태(80번 포트에 소켓을 만들어 바인딩을 해 놓은 상태)