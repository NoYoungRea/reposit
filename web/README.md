# javascript
- 태그 속성 앞 뒤로 공백 잇으면 안 됨.
- script에서 절대경로가 아닌 상대경로를 써야 하는 경우가 있다.
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
#### history.back or go

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
- 선택자를 이용한 전역메서드를 만들어 놓으면, 주체를 이용해서 호출하게 되는데 호출하면 this가 넘어가서 이것을 이용할 수 있다.
- 데이터를 끌고다니는 방법
1. 요소에 데이터를 넣는 것
2. 연쇄적으로 전달해 주는 법.
- 이벤트 핸들러의 함수의 첫번째에 e가 들어오는거지 모든 함수에 e가 들어오는 것이 아니다.
- xml http request 대신 아작스를 쓰자!
- async(true or false) 동기로 하면 응답 올때까지 계속 기다려야 함
- 아작스는 전역 플러그인 로드은 셀렉터 플러그인 알아서 사용하자 두개다 jquary 비동기 식인 듯.
#### done 대신
success:function(data){
}
데이터로는 거진 모든 것이 갈 수 있다. (객체(eval로 바꿔주어야 한다. 만약 데이터 타입을 jason으로 바꿔준다면, text에 제이슨 형식으로 저장하면 가져올땐 후처리 없이 객체로 가져올 수 있다. 만약 이런 바꿔주는 과정이 없다면, 그냥 string으로 가져오게 된다. 함수도 가능)
#### doc 볼때

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
- 이벤트 핸들러 추가하는 법 on('handlerName',func) or hadlerName(func) or $('button').on({ mousedown:function(){console.log('event!')}})
- 주의 해야 할것은 이벤트 핸들러에게 날라오는 주체 객체 this는 jquary객체로 감싸져 있다해도 dom이 들어온다. 그러므로 이것을 
가공하여 사용할거면 다시 jquary객체로 만들어 주어야 한다.
- 관계 끊기
1. off로는 사용자가 지정한 이벤트와 이벤트 핸들러와의 관계를 끊을 수는 있지만, 이미 연결 되어 있는 것들은(submit)연결을 해제 할 수 없다 .
2. preventDefault( )를 사용하면 이 것을 해결 할 수 있다. 사용자 지정의 것에는 영향을 주는 것 같지 않다.

#### doc에서
- jQuary.method()는 $.method()로 사용되는 전역 메서드이다
- .method()로 표기되는 것은 앞에 객체를 통해 호출 할 수 있는 메서드를 말한다. this를 활용할 수 있다.
- 이 전역 메서드들과 셀렉터 메서드들은 간단히 만들어 사용할 수 있다.

#### data
data()로 값을 넣고 뺄 수 있다. 만약 값이 여러개라면 값을 참조하는데 어려움이 있을 수 있으니 키와 함께 집어넣자.관련 메서드 : removedata() ,hasdata()

#### 팝업 창
- 팝업같이 누르면 뜨는 창을 제어하는 방법은 다양하다. 
1. 특정 버튼을 클릭하면 만들기 시작한다. (전체 다 만들던지, 아니면 태그 로 계속 붙이던지). 그리고 버튼을 클릭하면 뜨게 한다.(background 색은 미리 흰색으로 바꿔놓아야 한다.)
2. 미리 만들어 놓고 가려 놓은다음 특정 반응이 있을때 보여주게 한다.(보여줄때 보열줄 태그 안의 display는 block, 뒤 의 백그라운드를 가릴려면 none으로 한다.
#### slide 관련
slideup slidedown하는 도중엔 다른 거 못함. 화면 전체가 멈추어 있는 형태, 그래서 쓰지 말라하는 것. 하려면 비동기식으로 시켜놓고 내가 할거 해야 함.

# nodeJs
- nodejs는 웹에서 돌리려는게 아니다. 특정 언어를 지칭하는 것이 아니라 javascript 런타임 중 하나일 뿐이다. 그러므로 순수하게 javascript만써야 한다. dom, jquary 다 못 쓴다.
- 자바스크립트는 제이슨팔스 못쓴다. 아발 써야 함.
- 클라이언트에서 서버로 데이터를 전송할때도 request객체에 정보가 담긴다.(get방식 전송방법)
#### http
- http : hper text transfer protocal : 자동으로 80번 포트로 연결
- http를 사용하는 것이 아닌 별도의 포트 번호로 바인딩 해야 하는 경우 by io를 이용해
#### bady_parse
바디파서를 이용해야 포스트를 이용할 수 있음.
#### 일반적인 웹서버의 작동방식
클라이언트 요청 서버 응답 연결 끊 -> 반복. 이런방식이라면 서버가 클라이언트에게 원할때 무언가를 보낼 수 없음 so 클라이언트가 주기적으로 요청함으로서 해결->long polling방식->문제는 요청 간격이 5초라면 2.5초에 무언가가 일어날 수 있음->interval가 생김 so 서버가 push 를 해 줄수 있어야 함.원래라면 요청을 하고 기다리는데, 아작스는 요청을 해 놓고 갈길 감. 서버쪽에서 응답시 정해둔 함수로 처리를 함. 데이터를 받으려 기다려서 처리할 필요가 없음. ->비동기 방식이라 함. 주의할 점은 작업이 완료된 데이터를 실시간으로 접근할 수 없다.

# servlet
- 톰캣은 컨테이너를 제공함. 이 컨테이너에는 어플리케이션이 실리게 된다.(servelet context) 톰켓에게 즉, 컨테이너에게 요청을 하면 컨테이너에서는 해당되는 요청을 처리할 앱과 그 안의 servlet을 찾는다. 만약 여러 사람이 같은 서블릿을 요청하면 쓰레드로 돌아감.
- reload true false : 컴파일을 미리 할 것인지, 요청하면 할 것인지.
- 결과를 웹문서의 형태로 전송하기 위해 writer를 사용했지만, 음원 같은 것들 보내려면 outputsteam 같은 것을 사용하면 된다.
- 응답 여러곳에서 하면 안 된다.
#### 작동원리
웹 서버에는 웹 어플리케이션을 등록해 놓고,  클라이언트가 서버에 요청할때 urㅣ을 통해 요청하게 된다. webserver는 무작전 컨테이너를 뒤지는것이 아니라, 어떤 컨테이너로 부터 이 요청을 처리를 할지, 컨테이너를 뒤짐. context를 찾아서 처리를 위임을 함. 이 context 내에는 servlet 을 찾음. 해당하는 것이 있으면 servelet 객체를 생성하고 servelet를 스레드로 실행한다.
#### get,post
get방식 : url에 정보가 다 노출됨. 데이터의 한계(255자를 넘을 수 없음)
poset 방식 : 데이터를 html header에 첨부하여 전송하는 방식. 노출되지 않음(보안상 유리), 크기도 제한이 없음
post로 할때는 charasetencodding방식 get이랑 좀 다르다.

#### init
servlet 최초 호출 시에 init 메서드 먼저 실행 됨. 그 다음부터는 servlet을 호출해도 init호출 안 됨. 생성자도 한번 호출 되지만, 인수를 받지 못하기에, 저것을 쓰자. 생성자는 destroy메서드를 통해서 없어진다. 서버가 죽을때 호출 되어진다.

#### service
단순히 모든 요청에 대한 서비스 요청이라고 생각하면 안 됨. httpseverlet(부모)에 요청이 들어오면, 부모의 servelet()이 호출되고 이 안에서 해당하는 (get이나, post 같은 것들이 호출 된다.(내용 없음 )) 만약 doget같은 것들이 오버라이딩 되어 있다면 오버라이딩 되어 있는 것이 호출되어진다. serverlet을 오버라이딩 하면 그것이 호출 됨.

### 다른 곳으로 자원 이동
- 다른 곳의 자원으로 이동하는 방법이 두가지가 있다. 
1. response로부터  sendRedirect를 이용하는 것(외부의 자원으로도 요청 재지정이 가능하다.)
2. dispather 을 이용하는 방법(내부만 가능)
- request dispatcher객체를 얻는 두가지 방법 
1. servlet Context객체로부터
2. servlet request 객체로 부터
- 1번은 상대 절대 경로 다 가능, 2번은 절대 경로만.

- foward와 include 방식이 있는데, foward는 딴 곳에서 처리하게 한 후, 응답하게 하는 것이고(나도 응답 친구도 응답 하면 안 됨), include는 말 그대로 문자 그대로 포함시키는 역활을 한다. 그렇게 하면 내가 out 1을 하고 친구가 out2를 해도 다 추력이 된다.(foward는 1이 씹힘)
request의 getattribute는 object 반환하므로 항상 인지하고 캐스팅 해 주어야 함.

### session (여기서 부터 데이터 저장 삼총사)
- 웹 어플리케이션=서블릿 컨텍스트
- 이 서블릿 컨텍스트 안에는 서블릿들이 있다. 그리고 session pool이 있다.
- 처음 연결되는 것은 session이고 그 정보를 담고 있는 것이 session객체이다.
- 세션은 서버가 가지나 세션 아이디는 클라이언트에서 가짐. 세션 아이디는 클라이언트 쿠키에 저장됨. 이후 요청할때마다 세션 아이디를 제출함.
세션 객채는 필요없으면(참조가 안되거나) 사라짐(by 가비지), 세션은 살아 있음. 단, 브라우저를 전부 닫으면 세션이 종료되면서 클라이언트가 가지고 있던 쿠기(세션아이디를 가지고 있는)도 수명을 다하게 됨, so 다시 웹을 열어 요청을 하게 되면, 이전 세션은 기억 하지 못한다.
- getssesion(false) 발급 되었다면 세션반환 없으면 null, 하지만 이걸로 로그인 했느지 안 했는지 안했는지 판단하는 것은 부족(장바구니 하느라 세션 연결 했을 수도 잇잖아. getsession(true)는 있는거 가져오고 없으면 만듬.

![image](https://user-images.githubusercontent.com/49268465/79889656-50b0fc80-8439-11ea-8112-d2555f525f5d.png)

### 쿠키
- 쿠키는 서버에서 만들어 주어 사용자에게 보낸다. (속서으로 이 쿠키가 어떤 경로에 들어갈때 request의 헤더에 넣어가지고 올지, 얼마나 살아 있을지 등을 결정한다. 유효시간을 따로 설정하지 않으면 브라우저와 생명주기를 같이 한다. 설정하면 그것보다 오래 살아남을 수 있다.) 사용자는 서버에 접속할때 쿠키를 들고 들어오는데(제한이 없다면) 서버에서는 이것을 추출할 수 있다.
- 추출시에 getcookies(전부) getName(), getValue()등이 있다.
- 속성 만들때 기존에 있는 이름의 쿠키면 덮어쓴다.


#### servelet context
- 앱단위(servelet context객체는 앱이 시작 될때 끝날때 생명주기를 같이 한다. 앱 안에 있는 모든 페이지는 이 객체를 공유한다.)
1. servlet을 실행하면 최초에 servletconfig객체가 생성되어 init()메서드의 인자값으로 전달된 다음 init이 실행 된다. 여기서 servletconfig객체의 메서드를 이용하여 앱 단위로 정보를 저장할 수 있게 해주는 sevletcontext()객체를 추출할 수 있다.
2. servlet은 httpservlet을 상속받는데 그렇게 위쪽에서 이미 정의 해놓은 함수가 있다. 가저다 쓰면 된다. getservletContext()
- 저 객체에 변수 설정
![image](https://user-images.githubusercontent.com/49268465/79889784-79d18d00-8439-11ea-8709-0729ecef9133.png)

- 추출
getinitParameter메서드를 통해 추출한다. 반환값은 string이므로 정수사용하려면 알아서 바꿔라

- 사용처
web의 환경 설정이 되어 있는 web.xml에 다른 페이지들의 환경 값도 저장하여(시작과 동시에 가지고 있어야 해서) 사용한다.

시작과 동시에 사용할 필요가 없다면, void setAttribute(String name,Object value)와Object getattribute(string name)을 사용하여 할 수 있다. 단지, 추출시에는 나오는게 object형이므로 형변환 해서 사용해 주길 바란다. 여담으로 삭제는 void removeAttribute(String name)
### filter
- 어노테이션과 web.xml 차이 없음
- 어노테이션의 경우 필터 채인은 알아서 구성됨.xml의 경우 순서대로
- init dofilter distroy 반드시 구현
- init의 경우에 config객체가 만들어져서 들어오게 되는데, 이걸 이용하여 전처리가 가능
- parma의 경우 init-parm(servlet, filter) context-param이 있는데 전자의 경우 해당 클래스 내부에서 사용가능하고 후자의 경우는 프로젝트 안, 즉, sevelet context내부에서 전부 사용가능하다.
- servelet이 끝나면 자동으로 filter로 돌아온다.
- urlpattern에서 /*는 모든 servelet을 말한다.
- 상대경로와 절대경로
1. /는 root directory를 뜻한다. 주로 webcontent를 뜻하는 것 같다.
2. ./는 혀재 위치를 뜻한다. 상대경로로 지정할때 사용한다.

#### init
- init은 필터 객체가 생성될때 단 한번 실행 된다.(필터 객체는 web.xml을 읽을때 생기므로, 서버 시작시 생긴다고 봐도 무방하다. anotation으로 하는 경우도 xml과 똑같은 효과를 내므로 마찬가지 이다. 서버 시작시 init이 한번 호출 된다.) destory 는 필터객체가 삭제될때 호출 된다. dofilter은 필터링을 설정한 서블릿이 호출될때마다 호출된다.
- 서블릿은 필터와 달리 web.xml을 읽는 다고 해서 객체가 생성되지 않는다. 요청이 있어야 그에 해당하는 servlet 객체가 생성되고 config객체가 생성되며 servlet init 메서드의 인수로 던저주게 된다. 처음 web.xml을 읽을때 생성된, 필터 객체들로 전처리를 한 후, service 메서드를 실행하게 된다.  그리고 끝났다고 해서 내려가지 않고 요청시 계속 사용될 수 있도록 메모리에 올려져 있다.

### jdbc 파일 tip(with release ver
- jdbc 배포시 ext에 있으면 가져가기 힘들다. 거기서 빼내서 web_inf 안에 lib 안에 처 넣은 다음 build path에서 추가해주면 된다. 나중에 배포할때 얘도 포함해서 배포가 된다.
- 프로젝트 컨피규어 들어가서 메이븐을 누르고 확인 눌러주면, pom.xml이 생긴다. 클릭해서 들어가면 dependency에 들어갈 수 있고 add를 누른후 maven repository에 들어가 mariadb를 타고 들어가 나오는 정보를 그대로 입력해주면 된다. 그럼 자동으로 pome에 추가를 해 준다. 그렇게 되면 library->maven dependency아래 jar파일이 하나 생긴 것을 볼 수 있다. 잘 안되면 maven->update 눌러가며 해봐라. 그냥 pome 안에 직접적으로 넣어 주어도 된다.


