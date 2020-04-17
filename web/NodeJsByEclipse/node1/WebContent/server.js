const port=80;
var express=require('express');
var app=express();
var parser=require('body-parser');

app.listen(port,function(){
	console.log('from port'+port);
})

app.use(parser.urlencoded({extended:false}));
app.use(express.static('.'))
//1.jpg 실험

//http://localhost/board/1000
app.post('/board',function(request,response){
	let name=request.body.name;
	let age=request.body.age;
	console.log(name+':'+age);
	if(name!='hgd'){
		response.send({result:false,message:'이름이 일치하지 않습니다.'});
	}
	else if(age!=20){
		response.send({result:false,message:'연령이 일치하지 않습니다.'});	
	}
	else{
		response.send({result:false,message:'정상적으로 로그인'});	
			
	}
})