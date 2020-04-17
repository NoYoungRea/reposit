const port = 80;
var app = require('http').createServer(handler);
var io = require('socket.io')(app);
var fs = require('fs');
app.listen(port, function(){
	console.log(port+'포트로 서버구동하였습니다.');
});

function handler(request, response) {
	fs.readFile(__dirname+'/index.html', function(error, data){
		if(error){
			response.writeHead(500);
			return response.end('지정한 파일을 찾을수없습니다.');
			
		}
		response.writeHead(200);
		return response.end(data);
	});
}