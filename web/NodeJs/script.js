const port=80;
var exp=require('express')
var server=exp();

server.listen(port,function(){
	console.log(port+'from port we start server')
})
//서버를 열고 외부에서 연결을 기다리는 상태(80번 포트에 소켓을 만들어 바인딩을 해 놓은 상태)

//request객체(요청정보를 가지고 있음,클라이언트에서 서버로 데이터를 보낼때) response객체(응답에 대한 정보를 가지고 있음, 서버측에서 서버로 데이터를 전송할때)
//inputstream과 outputstream과 비슷함.
server.use(function(req,res){
	console.log('we recive client request');
	res.send('<h1>hello</h1>');
})
//클라이언트가 들어오면 자동으로 use를 호출해 준며 등록된 함수를 실행한다. 이 함수의 인수로는 request객체와 resqponse객체가 들어온다.





//use에 함수는 queue로 등록이 된다. user를 호출시 맨 먼저 등록한 것 하나만 실행 할 수 있는데, next를 이용해서 연쇄적으로 다음 함수들을 호출할 수 있다.
//단, send(응답)은 딱 한번만 해야 한다.
인수로 함수를 보냈다고 해서 다 콜백함수는 아니지만 node.js 내부의 함수에서는 대부분이 콜벡이다. use도 콜백함수이다. 