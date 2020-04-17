var req=require('request');
req('http://www.naver.com',function(err,res,body){
	if(err){
		console.log('error is occured')
	}
	else{
		console.log(body)
	}
});