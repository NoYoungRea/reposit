const port=80;
var exp=require('express')
var server=exp();

server.listen(port,function(){
	console.log(port+'from port we start server')
})

server.use(exp.static('public'));
//정적 파일 route


server.get('/board',function(request,response){
	console.log('게시글 목록보기 요청이 접수되었습니다.');
	response.send('게시글 목록보기 요청이 접수됨');
})
server.post('/board',function(request,response){
	console.log('게시글 등록 요청이 접수되었습니다.');
	response.send('게시글 등록 요청이 접수됨');
})
server.delete('/board',function(request,response){
	console.log('게시글 삭제 요청이 접수되었습니다.');
	response.send('게시글 삭제 요청이 접수됨');
})
server.patch('/board',function(request,response){
	console.log('게시글 편집 요청이 접수되었습니다.');
	response.send('게시글 편집 요청이 접수됨');
})
server.all('/board',function(request,response){
	console.log('전부');
	response.send('전부');
})

