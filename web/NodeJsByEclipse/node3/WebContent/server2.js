const PORT = 80;
var express = require('express');
var mysql = require('mysql');
var bodyParser = require('body-parser');

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
