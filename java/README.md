# 자바문법
--------------------
## api를 볼때 
1. field summary 가 없다고 해서 필드가 없다고 생각하면 안 됨. 정보 은닉 한거.
2. objects는 final 클레스. 즉, 있는 그대로 사용해야 한다. 생성자가 없음 new를 못함->자기자신을 반환하는 static 메소드가 있는지 보기-> 없음->객체를 만들지 못함. 즉, 인스턴스 멤버를 가지고있지 않은 static member만을 가지고 있음.
3. calander를 보면 생성자가 protected즉, 밖에서 사용 못함. 자식(골게릭달력) 클레스를 봐야 함.
4. Doc에서 final로 된거을 구별하는 법은 다 대문자로 되어 있음
5. deprccated
## main의 스테틱
때버릴 순 없다. java Appstart 하면 클레스 이름을 통하여 main을 찾아들어가기 때문이다.static method에서 다른 메서드를 호출하려면 그 method도 static이 되어야 한다.
## 생성자 오버로딩
생성자가 없으면 객체 생성을 하지 못한다. 그러므로 생성자가 하나도 없으면 인수가 없는 디폴트 생성자가 호출된다.(컴파일러에 의해 자동 생성) 만약 하나라도 생성자가 있다면 디폴트 생성자는 생성되지 않는다. C++ 언어와는 달리 자바에서 디폴트 생성자는 생성자에 매개 변수가 "하나도 없는" 생성자를 의미한다.
## 인터페이스
1. 인터페이스의 멤버는 기본이 public abstract
2. 추상클레스와 인터페이스에 추상메소드가 없는 경우 의미가 있나-> 대표타입만 제공한다. 타입캐스팅을 통해 기능의 실행 여부를 검사하는 역활
3. 인터페이스는 멤버로 필드, 생성자를 가질 수 없다.
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
## 입출력 : 키보드 모니터 노노 키보드 콘솔
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
