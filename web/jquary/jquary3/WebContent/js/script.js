$.fn.openPopup=function(msg,func){
	this.click(function(){
		$('.popup').find('.message').text(msg);
		$('.popup').find('button').click(function(){
			if(func){
				func();
			}
			$(this).closest('.popup').css('display','none');
			$(this).off('click')
		});
		$('.popup').css('display','block');
	})
}
$(document).ready(function(){
	$('.openPopup').openPopup("데이터를 전송하시겠습니까?",function(){
		alert('팝업을 닫기전에 작업을 수행합니다.')
	});
});


