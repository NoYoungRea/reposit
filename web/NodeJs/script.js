const port=80;
var exp=require('express')
var server=exp();

server.listen(port,function(){
	console.log(port+'from port we start server')

})

server.use(exp.static('public'));
//정적 파일 route


//http://localhost/board?name=%22hgd%22&age=%2220
//이건 get 방식으로 하는 것!!!
server.get('/board',function(request,response){
	let jobj=Array();
	for(let key in request.query){
		let obj=new Object;
		obj[key]=request.query[key];
		jobj.push(obj);
	}
	response.send(jobj);
})


