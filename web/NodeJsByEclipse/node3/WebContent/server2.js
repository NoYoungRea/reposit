const PORT = 80;
var express = require('express');
var mysql = require('mysql');
var bodyParser = require('body-parser');
var io=require('socket.io')(8080);

io.on('connection',function(socket){
	console.log(socket.id);
})

var app = express();
var conn = mysql.createConnection({
   host: 'localhost',
   user: 'nodejs',
   password: '1234',
   database: 'nodejs'
});

app.use(bodyParser.urlencoded({extended: false }));
app.use(express.static('.')); //현재파일로부터 요청파일을 찾게끔

app.listen(PORT, function(){
   console.log(PORT+'포트로 서버를 구동하였습니다.');
});

app.get('/members', function(request, response){ //라우터 사용 //url은 members 사용(이 주소로 호출)
   conn.query('SELECT * FROM members', function(error, result, fields){
      //field는 꼭 받을 필요는없긴함. forEach로도 가능함. 쓸일없으면 안써도가능
      response.send(result);
      
   });
});

app.post('/members',function(request,response){
	let email=request.body.email;
	let nick=request.body.nick;
	let password=request.body.password;
	
	if(email.isEmpty()){
		response.send({errno:1,message:'전자메일주소가 입력되지 않았습니다.'})
	}
	else if(nick.isEmpty()){
		response.send({errno:2,message:'별명을 입력하지 않았습니다.'})
	}
	else if(password.isEmpty()){
		response.send({errno:3,message:'비밀번호가 입력되지 않았습니다.'})
	}
	else{
		let sql='insert into members(email,nick,keyString) values(?,?,password(?))'
		conn.query(sql,[email,nick,password],function(error){
			if(error){
				response.send({errno:9,message:'sql오류가 발생하였습니다.'})
				return;
			}
			io.emit('refresh','회원목록갱신요망');//msg부분에서 선택적으로 할수도 잇음
			response.send({errno:0,message:'회원가입이 정상적으로 처리되었습니다.'})
		})
	}
})
String.prototype.isEmpty=function(){
	return (this.trim()=='');
}
