$(document).ready(function() {
	alert('jqeury 실행 테스트');
	$('#checkEmail').click(function () {
		if($(this).siblings('input[name=email]').val().trim()=='') {
			alert('메일주소를 입력해주세요.');
			$(this).siblings('input[name=email]').val('').focus();
			return;
		}
		$.ajax({
			url: '/servelet3/checkEmail',//request pattern url
			type: 'post',
			data: {email: $(this).siblings('input[name=email]').val()},
			success: function(data) {
				let obj = eval('('+data+')');
				alert(obj.message);
				if(obj.errno != 0) {
					$('input[type=email]').val('').focus();
				}
			}
		});
	});
});