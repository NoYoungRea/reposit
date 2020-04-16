var popupHtml = ''
+	'<div class="popup">'
+ '<ul>'
+	'<li class="message">'
+	'</li>'
+	'<li class="action">'
+		'<button class="btn btn-blue" type="button">닫기</button>'
+	'</li>'
+ '</ul>'
+ '</div>';


$(document).ready(function(){
	$('.openPopup').click(function(){
		let popup = $(popupHtml);
		popup.find('.message').text('팝업창 메세지를 입력합니다.');
		popup.find('button').click(function(){
			$(this).closest('.popup').remove();  
			//this는 윗줄 button //closest는 버튼을 감싸고있는것들중 popup인것
		});
		popup.appendTo($('body'));
	});
});


