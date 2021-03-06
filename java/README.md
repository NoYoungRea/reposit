# 자바문법
--------------------
## api를 볼때 
1. field summary 가 없다고 해서 필드가 없다고 생각하면 안 됨. 정보 은닉 한거.
2. objects는 final 클레스. 즉, 있는 그대로 사용해야 한다. 생성자가 없음 new를 못함->자기자신을 반환하는 static 메소드가 있는지 보기-> 없음->객체를 만들지 못함. 즉, 인스턴스 멤버를 가지고있지 않은 static member만을 가지고 있음.
3. calander를 보면 생성자가 protected즉, 밖에서 사용 못함. 자식(골게릭달력) 클레스를 봐야 함.
4. Doc에서 final로 된거을 구별하는 법은 다 대문자로 되어 있음
5. deprccated
6. 런타임 익셉션은 런타임 강제를 안하기 때문에 doc에서 메소드 throw 옆에 명시되어 있는 것이 아니라 하단 부에 컴파일 익셉션과 종합적으로 나와 있다.

## multichat
조심해야 하는 것이 close socket하면  이 command를 친 쪽에서 in out stream이 닫히는 것이다.
즉 반대편에서는 leadline으로 데이터를 가져와도 참조를 못하는 것이 아니라 상대방 output이 닫혔으므로 null을 반환 하는 것이다. close soket을 친 쪽에서는 상황이 다르다. input output이 닫혔기 때문에 관련 stream을 참조하면 바로 ioexception이 떠버린다. 
또 만약 상대방 cmd를 강제 종료할 경우(즉, close socket으로 stream을 닫지 않은 경우) 이쪽에서도 stream을 참조하면 ioexception 이 떠버린다.
반복문을 떠나기 위한 것이
1. 상대방쪽에서 문을 닫아서 null이 반환되는 것을 검사할 것인지
2. 내것을 닫았기 때문에 내것을 참조하면 뜨는 예외를(주로 자신의 것에서 여러 쓰레드를 닫을때)이용할 것인지 (그런데 상대방 것이 
3. 아니면 그냥 interrupt를 이용하던지
4. 아니면 message를 사용할 것인지

결론: ioexception은 비정상 종료를 위해 반드시 필요. 1,3,4는 선택

## input output
- 4개의 커다란 추상클래스가 있다 .inputStream/outputStream<->reader/writer
- 주로 데이터를 쓰고 읽는 sinkstream이 있고 처리 역활을 하는 processing stream이 있다.(버퍼, 브릿지, 출력포맷지등)
- System.out의 형이 printStream, System.in의 형이 inputStream 형이다. 구현체는 뭔지 잘 모르겠지만, 콘솔을 매체로 한 객체일 것이다.
printStream은 그런 객체를 한번 더 감싼 꼴이다. 방금 콘솔에 System.out.write를 이용하여 데이터를 출력해 봤는데 바이트 단위로 괴상하게 출력되는 것을 볼 수 있었다. System.out.print시리즈 들을 이용하면 인수로 주는 데이터 형을 잘 묶어주어 출력할 것이다.
- reader와 writer의 경우 조금 어려운데. 이것의 구현클레스들은 여러개가 있지만 sink 역활을 하는 stream은 딱 두개다 바로 filewriter와 filereader다 근데 두개 모두 inputStreamReader OutputSreamWriter 즉 브릿지 클레스를 상속받고 있다. 이 데이터 싱크 stream들은 바로 매체에 접근하는 것이 아니라 super의 생성자를 통해 바이트단위로 읽고 쓸 수 있는 sink를 하나 만들어서 그것을 받아 처리한 데이터를 가지고 놀게 된다.
- inputStream/reader  -> inputStream을 reader로 변환해주는 역활을 한다.
- OutputSream/Writer -> writer로 받은 것을 outputStram으로변환해주는 역활을 한다.
- 아무리 문자단위로 입출력을 하더라도 실제 파일에 기록을 할때는 바이트 단위로 기록을 해야한다.
- Writer하위에 구현되어 있는 클레스 중에 싱크 클레스 말고 printWriter클레스가 있는데 이게 생성자에서 인수로 outputstream 타입을 받는 것도 있다. 여기 이렇게 설명 되어 있다.This convenience constructor creates the necessary intermediate OutputStreamWriter, which will convert characters into bytes using the default character encoding.

## Number
Person<Number>p=new Person<Number>(10); 이건 Integer 반환 number.valueof를 호출함 
Person<Number>p=new Person<Number>(new Number(10));이건 안됨 이건 넘버 객체 반환
  
## instanceof
다른 거 볼거 없고 어떤 인스턴스인지 구분하기 위해 다음과 같은 키워드를 쓴다.
주의 할 것은 다음과 같이 상속관계에 놓이지 않은 서로 다른 클레스의 객체에 대해서 사용할때는 자명하나 예를 들어
A<-B<-C 가 상속관계 일때
A a =new B()와 같이 A가 B를 객체 수집 했을 경우
a instanceof A true
a instanceof B true
a instanceof C false
왜냐 하면 인스턴스 a 안에는 A의 인스턴스와 B의 인스턴스가 있기 때문에 true
C의 경우는 가지고 있지 않은 것도 있으므로 false

이 키워드가 중요한 점은 이 키워드를 이용해 다운캐스팅이 가능한지 여부를 판단할 수 있다는 것이다. 이것들은 컴파일 타임엔 괜찮아도 실행시 오류가 난다.
A a=new A()
a instanceof B 가 false이므로
B b=(B)a 이렇게 하면 런타임 오류가 난다.

이 경우는 downcasting 하면 안 된다.  
## 오버라이딩 접근제한자 java vs c++
c++은 점점 제한이 좁아지는데 java는 같거나 더 넓어진다. 
c++은 물려받아서 자신만 사용하겠다는 느낌
자바는 나만쓰도록 받아도 다른사람에게 공유할 수 있음
## super 생성자와 this 생성자
두개 모두 공통적인 특성을 가진다. 무엇보다 먼저 호출되어야 한다. 그리고 이 특성때문에 두번 이상 쓰일 수 없다.
## 패키지
1. protected는 default보다 더 넓은 범위 이다.
2. 패키지 구문과 임포트 구문이 동시에 나올때는 패키지 구문이 먼저 나와야 한다. 그리고 임포트 다음에 클레스 선언문이 와야 한다.
3. 다른 패키지 안에 있으면 임포트를 하던가 풀네임을 명시해 주어야 하고. 같은 패키지 않에있으면 임포트 할 필요 없다.
동일한 패키지 내에서는 default 접근 제한을 가진 맴버를 공유할 수 있지만 다른 패키지에서는 public으로 해야만 직접 사용
할 수 있다. 하지만 private로 해 놓는다면 같은 패키지 안이라도 자기 자신 클래스만 사용 가능 멤버 메소드 변수, 클레스에 다 같은 방식에 적용되고
클래스도 접근제한자를 가질 수 있는데 딱 두가지 사용한다. public 이냐 default냐. defualt면 같은 패키지에서 사용 가능
private<<defualt<<protected<<public
## main의 스테틱
때버릴 순 없다. java Appstart 하면 클레스 이름을 통하여 main을 찾아들어가기 때문이다.static method에서 다른 메서드를 호출하려면 그 method도 static이 되어야 한다.
## 생성자 오버로딩
생성자가 없으면 객체 생성을 하지 못한다. 그러므로 생성자가 하나도 없으면 인수가 없는 디폴트 생성자가 호출된다.(컴파일러에 의해 자동 생성) 만약 하나라도 생성자가 있다면 디폴트 생성자는 생성되지 않는다. C++ 언어와는 달리 자바에서 디폴트 생성자는 생성자에 매개 변수가 "하나도 없는" 생성자를 의미한다.
## 인터페이스
1. 인터페이스의 멤버는 기본이 public abstract
2. 추상클레스와 인터페이스에 추상메소드가 없는 경우 의미가 있나-> 대표타입만 제공한다. instanceof를 통해 기능의 실행 여부를 검사하는 역활
3. 인터페이스는 멤버로 필드, 생성자를 가질 수 없다.
4. 인터페이스에서 인터페이스를 구현하는 것이 아니라 상속하는 것이다.
5. 추상메소드가 아닌 디폴트 메소드를 만들어주기 위해서는 defualt를 붙여야 한다.
## final
private int managerName=0; 이렇게 해 놓으면, 생성자가 먼저 호출 되기 때문에 사전에 초기화 시켜 놓은 값은 없어져 버림 즉, 의미 없음
private final int managerName; 여기서 초기화 해도 되고 생성자에서 초기화 할 수 있음 하지만 생성자에서 바꿀 수 있는 여지가 있기때문에 객체마다 다른
상수를 가지지 않을 수도 있음 위험 상수취급 안 하기 때문에 소문자로
public static final int DEFAULT_COUNT =0;으로 해놓는 방식 private로 해놓을 필요가 없음 어차피 못 바꿈
선언과 동시에 초기화 하거나 static field에서 초기화 해주면 됨
static 초기화 영역은 단순 static 초기화뿐만 아니라 여기서 함수를 호출하는 역활도 함
static final이건 final static이든 상관 없지만 public 뒤에 와야 한다.
final은 지역변수에도 맴버변수에도 static이든 아니든 public private든 다 붙을 수 있음 단 차이는 존재함

final class 더 이상 상속할 수 없는 class
final method 더 이상 오버라이딩 할 수 없는 메소드
접근제한자가 만약 protected final void show() 이면 자식 인스턴스에서만 접근하여 사용할 수 있다. 
final 클레스면 final 메소드가 의미가 없다.
## 인스턴스는 실행타임에 만들어짐,so 만들어지는 인스턴스를 컴파일타임에는 알지 못한다. 
## java.lang 자동 임포트
## objects 자동 상속. 가장 상위. 그 무엇도 위에 두지 않음
## class 클레스
특정 클레스로부터 특정 클레스의 정보를 가져올때 
## 스트링버퍼와 스프링 빌더
다똑같은 이름만다름.내부에 메로리를 가지고 있어서 문자열을 조작할때 사용 차이는 동기화를 지원하거나 안 하거나
## primative의 객체형이 필요한 이유
generic에서는 오직 객체형만 사용 가능하다!

## 파일
파일이나 디렉토리나 파일임 (즉, POSIX 시스템에서는 파일, 디렉토리, 입출력 장치 모두를 파일로 취급한다)
다른 파일들의 정보를 가지는 파일을 디렉토리라고 함, 즉, 패키지라고 함
실제 데이터를 가지고 있는 파일을 파일이라고 함. 여기서는 클레스에 해당함.
윈도우는 드라이브가 있지만, 포식스 이런거는 가장 상위 디렉토리가 있음
파일 명은 비단 그 파일명만 말하는 것이 아니 아니라 경로를 다 포함한 것을 말한다
경로 문자 \는 escape처리를 하려들기때문에 두개 써야한다. 
/ect/ 이렇게 하면 etc는 디렉토리임 /ect는 파일이고
압축파일 중 아카이브는 그냥 모아 놓기만 하는 것 압축 해놓으면 풀고 실행해야 하기 때문에 시간 오래 걸림 .jar
rt.jar을 압축 풀어보면 또 이 안에 여러가지 패키지가 있는데 그중 java도 있다.
rt.jar 과 jsse.jar 두곳 모두 com이라는 패키지를 가지고 있는데 이것은 물리적인 계념이 아니라 논리적인 개념으로 봐야한다.
즉, 두 패키지는 다른 곳에 있지만 하나의 패키지로 본다. domain즉 영역으로 본다. 단 이거는 jar가 디렉토리가 아니라 파일이고 예외적인 경우고
서로 다른 디렉토리 안에 같은 이름의 파일이나 디렉토리가 있으면 다른 곳이다.
java.util.Scanner sc 이런식 으로 사용한다. FQDN(full quaility domain name) 
import java.util.Scanner;이런식으로 초반에만 한번 써 놓으면 domain명시 안 해도 된다.
import java.util.* ;이런식이면 util안에 모두 다(사용하지 말기)
경로가 어디에 있는지 모를때 컨트롤 쉬프트 O

- 프로그램을 기준으로 데이터가 들어오면 input 나가며 output  매체를 통해 데티어가 나간다. 매체는 콘솔이 될 수도 있고 소켓을 통한 다른 데스크탑이 될 수 있다.
- 데이터의 흐름을 스트림이라고 한다. 즉, 데이터가 지나가는 통로를 말한다. 프로그램과 매체간에 데이터를 주고받기 위해 반드시 필요하다. 프로그램으로 부터 매체로 나가는 스트림을 출력 스트림, 반대를 입력 스트림이라고 한다. 스트림은 일종의 메모리라고 볼 수 있다.(데이터가 계속 쌓이기 때문에) 그래서 스트림 버퍼라고 부르기도 한다.(버퍼는 메모리를 일정 저장하는 것을 말한다. 디스크를 말하면 캐시라고 한다.)
- 스트림을 두고 매체만 바꾸면 저장하거나 읽어들이는 매체를 바꿀 수 있다. 스트림이 할 수 있는 것은 연결 통로만이다. 
- 출발지와 도착지가 다를 수도 같을 수도 있음
- a에서 출력을 만들던가 b에서 입력 스트림을 만들면 된다.
- 스트림은 q이다. 먼저 들어온 것이 먼저 다간다. 데크가 아니다. (양방햐) 하나의 스트림으로 입력도 하고 출력도 하는 것은 불가능 하다.
- 자바는 하나의 문자를 처리할때 아스키코드가 아니라 유니코드를 사용한다. 즉, 문자 하나에 2바이트 할당한다.
-  inputstream/outputstream<->reader/writer 다 스트림임. 전자는 바이트스트림이고 후자는 캐릭터스트림이다. 전자는 바이너리를 처리할때 후자는 문자를 처리할때
- 위의 스트림들은 최상위 클레스 이고 이걸로 부터 접미사를 붙여서 하위클레스들이 이미 만들어져 있다 이 하위클레스들은 상위클레스가 될 수 있다.
- 파일이란 storage에 저장되어 있는 것을 말한다. 이것에 대한 정보를 정한 것이 File class이다.
- delete 삭제 예약한 후 종료되면 삭제 되도록(사용중이면 삭제하지 못한다.)
- mkdirs 경로까지 디렉터생성
- file class compaleabe interface 구현되어 있음, 즉 , 파일비교 가능
- 파일 스트림은 반드시 사용 후 닫아주도록 하자
- 파일을 한 파일에 동시에 instream과 outstream을 놓으면 안 된다. System.안에 printStream과 inputStream이 같이 있는 것을 보고 가능하다고 생각이 들었는데 inputStream은 키보드파일로부터 printStream은 콘솔창으로 즉, 다른 곳에서 입력받고 다른 곳에 출력하는 것이다. 다른 경우이다.
- 파일을 둘이 같이 열면 안된다. 동기화를 시켜서 한명씩 접근하게 하자. 그리고 열닫을 반복하는 것이 아니라 처음 한 번 열어 놓고 잠깐잠깐 쓰는 형식으로 해야 한다. 
## cpu의 사용
사용할때 각 프로그램이 우선순위를 뽑고 기다림. 즉, 스레드 풀에 들어가서 작업대기를 하고 있다가. cpu를 사용할수 있는 권한을 받게 된다. 일정시간이 지나면 중지되고 다시 스레드 풀에 대기. 시간내에 끝나면 다시 스레드 풀에 갈 필요 없이 끝남. 
jvm자체도 프로그램. 어플리케이션임. 가비지 컬렉터는 우선순위가 낮다. 즉, 우선순위가 낮다. cpu가 여유있을때 함. 자원반납이 빨리 일어나지 않을 수 있다.
## 생성자가 private 인 클레스들	
싱클톤패턴, enum
## 모든것은 유일해야 하지만 범위가 있음
클레스 : domain내에서 즉, 패키지 않에서 유일하면 됨
멤버 :  클래스 내에서만 유일하면 됨
## java.lang패키에 소속된 클레스
Object(최상위클레스),System(입출력),Class(클레스 클레스),String,StringBuilder/Buffer,Math,Wrapper class
## java.util패키지에 소속된 클레스(대부분이 컬렉션 클레스들이다.)
Arrays,Calendar,Date,Objects(객체비교,null 여부조사 등),StringTokenizer(문자열 뽑아낼때),Random
## equals()
주로 Objects의 것을 그대로 사용하기보다는(주소비교용) 오버라이딩하여 논리적비교를 할때 사용
string의 equals는 객체의 값을 비교하도록 오버라이딩 되어 있다.
## hashCode()
equals() 리턴값은 true false인 반면 hasCode()는 객체를 식별할 값을 가지게 된다. 이것을 다른 곳. map이나 이런 곳에서 이용한다. 메소드를 재정의 하지 않으면 논리적인 관점보다는 물리적인 관점으로 데이터가 같더라도 다른 객체로 본다.
+해쉬란 무엇인가 : #. hash. 암호화 알고리즘에서 쓰인다. 암호화 알고리즘은 크게 두가지가 있는데 양방향 암호(복호화가 가능 : 원상태로 되돌리는 것이 가능) 단방향 암호가 있다.(복호화가 불가능). 양방향 암호는 풀 수 있는 우려가 있다. 그래서 주로 단방향 암호를 이용한다. 일반적으로 데이터를 알고리즘을 이용하여 암호화를 하면 암호화된 데이터와 암호화 결과가 나온다. 이 암호화된 결과를 hash라고 한다. key String 이라고도 한다. 암호화된 데이터는 의미가 없음(풀수가 없으니까). 데이터와 암호화 결과를 보내는데 이 데이터를 암호화 했을때 나오는 해쉬와 암호화 결과가 다르면 연결을 끊어버린다.(SSl)
즉, 데이터가 같으면 암호화 결과가 같게 나온다.
10개짜리 데이터를 저장 할 수 있는 map이 있으면 key를 이용하여 쉽게 넣고 뺄 수 있다. 이 키를 무엇을 정하냐면 객체에서 hashCode를 구현한 값으로 한다. 이 map에서 객체만 받을 수 있다고 하면 데이터가 들어갈때 hashCode를 실행 시켜 나오는 key에 해당 데이터를 넣는다. key를 사용자 지정으로 따로 따로 저장해 놓는 것이아니라 데이터에 종속적이게 만들면 편하다.
## 객체비교 : reference 타입만 가능.
cf) referene type : 클래스, 인터페이스, 배열, 열거형
## collection
get은 그냥 막 넣는거 나올때 다 꺼내기
map은 key와 함께 들어가서 특정 데이터를 꺼내는 거
list는 순서가 있음 첫번째 들어간 놈이 나중에라든지.
## class class 
그냥 class.forname을 주로 사용(getClass 보다) : 누군가가 만들어놓은 드라이버를 사용하고자 함. 이 드라이버의 설치 유무를 파악할때
## 통신
System에서는 자바 센서에서는 c를 사용할때 서로 통신을 해야 할 수가 있다. 이 때 이 통신 규격을 프로토콜이라고 한다.
크기를 고정해놓는 방법이 있고(고정크기), 가변크기일때는 구분자가 필요함. stx    fs     fs      etx 
센서측에서 캐릭터 배열로 보내면 String으로 받는다. String에서 보낼때는 char배열로 보내면 안 됨(서로 캐릭터 형의 크기가 다름 ; 자바에서 char형 2Byte, C/C++에서 char형 1Byte)
서로 자바 시스템일 경우 바이트 배열로 변환이 불필요할 수 있으나. 다른 언어로 프로그래밍된 시스템이랑 통신할 때에는 변환이 불가피할 수도 있다.
즉, 바이트배열로 보내야 한다. packet.getBytes : string 을 byte 배열로 만든다.

## 동기화
hashtable에서 동기화를 걷어낸 것이 hashmap
StringBuffer에서 동기화를 걷어낸 것이 StringBuilder
## 지역 변수
해당 함수의 스텍프레임 내에 할당 되고 함수가 종료되면 없어진다. 이것은 소유주가 없기 때문에 public static private 등(접근 제한자)을 쓸 수 없다.
## parse 와 valueof의 차이
static double	parseDouble(String s)
Returns a string representation of the double argument.
static Double	valueOf(double d)
Returns a Double instance representing the specified double value.
static Double	valueOf(String s)
Returns a Double object holding the double value represented by the argument string s.

parse는 unwrap이고 valueof 은 특정 인수를 통한 객체 생성이다.
## append에서 객체를 집어넣으면
appenc(객체) tostring으로 출력되는 듯?
## 배열 랜덤 저장
rand 채워서 바꾸기 best
## format
메세지 포맷 잘 안씀 스트링 포맷을 주로씀(타입 자릿수 등 지정 못하는 이유 때문에)
## primitive vs wrapper class
primitive타입을 객체 타입으로 만들면 objects를 상속받을 수 있게 된다. 즉 다양한 기능을 사용할 수 있게 됨.
(primitive 타입은 단순히 값만을 저장하고 있음.)
객체로 만드는 것->박싱 객체로 부터 값을 꺼내는 것->언박싱

## 스레드 용어 정리
1. 프로세스 : 연속적으로 실행되는 프로그램
2. 멀티 태스킹 : 두 가지 이상의 작업을 동시에 처리하는 것으로 CPU 및 메모리와 같은 리소스를 적절하게 할당해주고
병렬로 실행함
3. 스레드(Thread) : 프로그램의 시작점과 종료점을 가지는 일련의 작업
4. 멀티 스레드 : *한 프로그램 내*에서 여러가지 작업을 수행하는 것

## 멀티 프로세스와 멀티 스레드의 차이점
- 멀티 프로세스 : 자신의 메모리를 가지고 작업을 수행 -> 서로 독립적(하나의 프로세스가 다른 프로세스에 영향을 미치지 않음)
- 멀티 스레드 : 하나의 프로세스 내부에서 생성함 -> 서로 의존적(하나의 스레드에서 예외가 발생하면 프로세스 자체가 종료될 수 있음)
