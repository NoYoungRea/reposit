# javascript
- undefined
- 배열의 경우 Array()생성자에 매개변수에 따라 다른 양상을 띄운다. 없을경우에는 빈 배열, 하나는 배열의 크기, 두개 이상은 배열 값들을 저장한다.
- 배열 또한 객체의 일종이며, 모든 함수는 argument라는 배열을 가지고 있다. 이 argument는 받은 매개변수의 정보를 가지고 있다. 이를 이용해서 파라미터가 2개인 함수에서 4개 5개의 매개변수를 처리할 수도 있다.
- 다른 함수들과 이름 혼용을 방지하기 위해 내부 함수를 사용하기도 한다.
-setTimeout(f,1000 ), clearTime(id)
- eval
- 객체를 하나 만들면 프로토타입이 만들어 진 후 인스턴스가 만들어진다
- 맴버가 개별적으로 가져야 할 것들은 this으로, 공통적으로는 prototype으로.
- this 가 아니라 var로 함으로서 (접근제한자 역활을 대신)
- 이벤트를 처리하는 두가지 방법 (바디에서, 아니면 script에서)
- getid를 이용하여 특정 객체를 찾을 수도 있지만, 그냥 이미지에서 함수 호출시 this를 같이 보내면,

#### new
- new를 통해 함수를 호출하면 그 함수는 생성자 함수가 된다. 객체를 생성하기 위한 함수. 대문자로 시작하도록 한다. 그냥 함수호출을 통해선 this 사용 못해? 사용할 수 있으나 그 this는 window객체를 의미함
- 생성자 인수 없으면 가로 생략 가능
- 생성자를 통해서 객체를 생성하면 프로토타입이 하나 만들어진다.

#### script 내용 넣는 방법
- html문서에 넣는 방법
- 외부파일로 작성하고 불러오는 방법

#### 변수의 종류와 선언방법
- var를 이용한 선언
- let을 이용한 선언

var의 경우 스코프 안에서 선언하더라도 어디서든 사용가능하고 재정의가 가능한 전역 변수이다.
let의 경우 해당 스코프 안에서만 사용가능한 재정의가 불가능한 변수이다.

#### 함수를 생성하는 방법
- 선언적 함수 정의
- 익명 함수를 이용
- 함수를 함수의 인수로 전달하는 방법(콜백함수란?)
- 함수의 반환값으로 함수를 반환하는 방법(클로저란?)

function( ){  }-> 익명, function A( ){ }-> 선언
1. 두 함수의 큰 차이는 선언적 함수의 경우 미리 선언적 함수 부터 읽기때문에 선언부가 호출부 보다 나중에 오더라도 전혀 상관이 없는 반면 익명은 그렇지 않다. 실행 순서를 잘 기억하길 바란다. 
2. 익명의 경우 변수에 담아 사용이 가능하다. 

a라는 함수에서 b라는 함수를 호출하면 b에서 리턴할때까지 기다려야 함.
콜벡함수는 이게 아니라 a는 호출해놓고 a 갈길 가고 b는 b갈길 가는 것. b가 반환 하는 것은 의미가 없다. 그러기 때문에 b에게 그 반환값을 처리할 함수도 같이 줌.
이런 개념으로 함수를 넘기는 것이 콜 백임...


#### 배열과 객체를 생성하는 방법(정적 객체)
- 배열과 객체의 차이점
#### 생성자 함수를 작성하는 방법
- 생성자 함수 작성법과 객체와 객체의 프로토타입
- 객체의 상속(포함->상위 프로토 타입을 하위 프로토 타입에게 물려줌->프로토 타입에서 생성자 지정
- 캡슐화 하는 방법
#### 윈도우 객체는 크게 중요하지 않음 bom(browser object model) 크게 중요하지 않음
window
- open()
- alert()
screen
- availwidth
- availHeight
wndow.location
- href
- reload()
window.history
- go()
- back()
window.navigator
- appName
- appVerwsion
window.document->dom 참조

#### dom(document object model)
- document  로부터 element 객체를 참조하는 방법
	document.getElementById()
	document.getElementByName()
	document.getElementByClass()
- elements 객체로 부터 속성을 참조하는 방법
	객체.속성명	<- 참조
	객체.속성명=값 	<-값 지정


#### jason
- 자바스크립트 오브젝트를 문자열화 한것이 제이슨.
- 자바스크립트가 서버쪽에 데이터를 보낼때 오브젝트를 그냥보내거나, xml로 만들어서 보낼 수도 있지만 한계점이 있음(파싱해주여야 하고-객체를,  xml은 너무 큼) 그래서 문자열로 바꾸어주는 제이슨을 사용.
- ex)'{"name":"hgd"   ,   "age":20  ,  "iscollage" : true  ,  "students" :  [ ] , "student" : { } 	}'


# jquary
- 제이커리를 쓰게 되면 이런 브라우저에 따라 신경써야 할 것이 줄어듬	

#### vs 고전
- 고전
1. 테그상에 이벤트 추가하는 방법
2. 스크립트에서 찾기(by id, tag, class등) 그리고 함수를 지정해주기(고전적인 방법)
- jquary
1. jquary는 jquary 객체로 변환하여 다양한 메소드를 사용할 수 있다.(다체롭게 찾고 생성하고 넣을 수 있다.) 이벤트 처리하는 양상은 비슷한다.
2. jquary의 ready는 브라우저 상관없이 어떤 곳에서도 된다. document.ready가 여러곳에 있어도 다 분산되어도 실행 가능하다.(cf.고전)

- javascript는 이벤트에대해 고전적인 방법 이나 태그를 이용하는 방법이나 결국 document에 있는 요소들을 대상으로 했다.
jquary에서는 $를 이용하는데
1. 이미 만들어진 객체를 대상으로는 jquary객체로 변환시키고 ex)$(document)
2. body같이 어떠한 요소를 대상으로도 jquary 객체로 변환시키고 ex) $('body')
3. 없는 요소 또한 만들어 jquary 객체로 만들어 버린다. ex) $('<body>')

#### jquary 모듈 불러오기
#### selector 
- 태그 셀렉터
- 아이디 셀렉터(#)
- 클레스 셀렉터(.)
- 속성 셀렉터([type=button]
- 필터 셀렉터(:)->위의 것들과는 달리 가장 첫번째 오는 것을 select한다.(다른 것들은 해당되는 것을 다 가져온다.)
1. 타입 필터(input:button) 
2. 상태(input:checked, input:selected)
3. 필터 셀렉터와 필터 메서드는 다르다.(.frist().last().eq(n))
#### 자식에 자유자제로
- $(document)
- $('div')
- $('<div>shdudfo</div>')or 	$('<div>' , { text:'여기에 내용을 ...' , id : 'attachedId' } ).appendTo($('body'))
- appendTo, prependTo, append, prepend, insertAfter,insertBefore 
- 주의해야 할 것은 clone을 통해 복제해서 추가해야 할때도 있다. 하나를 만들어 놓고 계속 추가하는 것을 의미가 없다.	

#### 삭제
- empty와 remove가 있다 empty 는 내용을 싹다 지운다고 생각하면 되고, remove는 요소 자체를 없애버린다. 

#### find 메소드
이미 body에 있는 태그라면 찾을 필요 없다. 하지만, 그게 아니라 참조해 들어가야 한다면, jquary의find메소드를 사용하면 된다.
#### 속성 제어 attr은 tag내의 모든 속성에 대해 변형이 가능하다.  반면 css는 스타일에 대해서만 변형이 가능하다.
- img.attr('src');//src 속성값을 참조한다.
- img.attr('src','value')//src속성값을 value로 해라
- img.setAttr('src','value');//속성을 추가한다. attr로 수행가능하다.
- img.removeAttr('src');//속성을 제거한다.
- 객체.css(속성,value).css(속성,value) or 객체.css({속성:value;속성:vlaue})
- img.attr('style', 'width:100px;border:2px solid blue')
- 두개 모두 연쇄적으로 사용 가능

#### 객체.text("<span>ksdjfd</span>")와 객체.html("<span>ksdjfd</span>")의 차이 
#### 이벤트 관련 메소드
- 이벤트 핸들러 추가하는 법 (on('handlerName',func) or hadlerName(func))
- 주의 해야 할것은 이벤트 핸들러에게 날라오는 주체 객체 this는 jquary객체로 감싸져 있다해도 dom이 들어온다. 그러므로 이것을 
가공하여 사용할거면 다시 jquary객체로 만들어 주어야 한다.
- 관계 끊기
1. off로는 사용자가 지정한 이벤트와 이벤트 핸들러와의 관계를 끊을 수는 있지만, 이미 연결 되어 있는 것들은(submit)연결을 해제 할 수 없다 .
2. preventDefault( )를 사용하면 이 것을 해결 할 수 있다. 사용자 지정의 것에는 영향을 주는 것 같지 않다.

