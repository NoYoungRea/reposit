var students=[
	{name:'hgd',kor:90,eng:83,math:93},
	{name:'hgd',kor:93,eng:87,math:93},
	{name:'hgd',kor:96,eng:89,math:93},
	{name:'hgd',kor:95,eng:82,math:93},
	{name:'hgd',kor:92,eng:83,math:93},
	{name:'hgd',kor:98,eng:85,math:93},
	{name:'hgd',kor:100,eng:87,math:93},
	{name:'hgd',kor:93,eng:83,math:93},
	{name:'hgd',kor:99,eng:82,math:93},
	{name:'hgd',kor:92,eng:81,math:93},
	
]
students.sort(function(a,b){
	
	return a.kor+a.eng+a.math-b.kor+b.eng+b.math
})

students.forEach(function(item,index){
	console.log(students[index])
})
