const port=80;
var exp=require('express')
var server=exp();

server.listen(port,function(){
	console.log(port+'from port we start server')
})
//서버를 열고 외부에서 연결을 기다리는 상태(80번 포트에 소켓을 만들어 바인딩을 해 놓은 상태)

server.use(exp.static('public'));
//여기를 먼저 뒤지라는 것이다. 응답을 못하면 다음으로 넘어감
server.use(function(req,res){
	res.send('안녕!')
})

// localhost 입력해보고 localhost/1.jpg 입력해보기 무언가 입력했을때 무조건 public 안 부터 뒤짐