var jumsu=[90,30,40,10,50,70,30,40];

jumsu.sort(function(a,b){
	return (a-b);
});
jumsu.forEach(function(item,index){
	console.log(jumsu[index]);
})