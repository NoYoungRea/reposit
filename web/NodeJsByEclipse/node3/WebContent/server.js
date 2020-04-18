var mysql =require('mysql');

var conn=mysql.createConnection({
	host:'localhost',
	user:'nodejs',
	password:'1234',
	database:'nodejs'
})

conn.query('SELECT*FROM members',function(error,result,fields){
	if(error){
		console.log('error')
	}else{
	
		result.forEach(function(row,index){
			console.log('메일	:'+row[fields[0].name]);
			console.log('닉네임:'+row[fields[1].name])
			console.log('가입일자:'+row[fields[2].name])
			if(row[fields[3].name!=null])
				console.log('탈퇴일자:'+row[fields[3].name])
			else
				console.log('탈퇴일자: 가입중')
					
			console.log('---------------------------------')
			
		})
	}
	
})