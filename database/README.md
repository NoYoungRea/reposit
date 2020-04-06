## sql command
- mysql -uroot -p mysql<create_user_exam.txt
- mysql -uroot -p mysql<show.txt
- mysql -uroot -p mysql<show.txt>result.txt
- mysql -uroot -p mysql<show.txt>result.txt 2>error.txt	 	(< system.in 1>system.out 2>system.err)
- mysql -uroot -p mysql<show.txt>result.txt 2>result.txt		(윈도우 불가 포식스 가능)
- mysql -uroot -p mysql<show.txt>result.txt 2>&1			(에러도 같은 곳에 같이 출력))
- 첫번째 줄에서 오류면 담것은 실행 안함(만약 3째줄이 오류이면 2째 줄까지는 정상 처리가 됨.

- show tables(현재 db)
- show tables in mysql
- show columns in grades

- rename user project to worker;

- show grants
- show grants for worker

- drop user if exists project;
- create user project identified by '1234';
- !=
- create user if not exists project identified by '1234';
1. 있으면 지우고 없으면 만듬
2. 있으면 안만들고 없으면 만듬

- revoke all privileges on project.*from worker;

- mysqladmin --user=root -p drop project

- show create user root@'localhost';	
- set password for worker = password('1234')

- mysql -u -p -h shdudfo<tabe.sql(현재 있는 곳에 있는 파일을 해당 계정에 해당 데이터베이스에 넣기 (입력 리다이렉션으로 파일을 넣어주고 있음)
  
  < : 표준 입력
  1> 또는 > : 표준 출력
  2> : 에러

## utf8
utf8을 기본으로 지정해줬다고 해서 클라이언트도 utf8을 기본으로 해주는 것이 아니다. 그것을 위해서 자신의 것으로 맞추라고 강제하는 것이 handshake라고 한다.
메모장에 추가해주면 된다.
collation-server=utf8_unicode_ci
skip-character-set-client-handshake

콘솔의 인코딩 또한 설정을 해줘야 할 수도 있다. 관련 코드는 다음과 같다.
chcp 65001  -> UNT8로 설정해줌
chcp 949

## index
인덱스 column은 데이터를 더 빨리 찾도록 도와준다.
폴린키가 설정되면 인덱스키도 자동으로 해당 칼럼에 매겨진다. (유니크 프라이머리 포린 모두 인덱스 걸림)삭제할때는 별도로 해주어야 한다.
인덱스는 많이 사용하지 않는 것이 좋다. 검색이 많이 사용되는 컬럼에 인덱스를 추가하는 것이 좋다.  varchar는 가변형이기 때문에 index를 걸지 않는 것이 좋다. (효율이 안 좋다.)

## INNODB
ISAM,MYISAM 이런것과 달리 우리가 사용하는 것은 삭제하고 넣어도 increment 갱신이 되지를 않는다. 즉, 4를 삭제하고 추가하면 4가 아니라 5에 추가 된다.사이사이 비어 있는 값을 사용하려면 직접 지정해야 한다. 대신 transectiono을 사용가능하다. (아직 안 배움) 

## mysql maradb를 둘다 깔때는 포트 번호를 다르게 해주어야 한다.
## 왜 웍벤치를 설치햇냐? heildsql로 못하는게 뭐냐? 모델을 통해 스키마를 만들어내기 위해

## 일대 다 다대다
일대 다는 부모와 자식관계라고 생각하면 될 것 같고,
comics 은 카테고리와 퍼블리셔 가 부모임 일대 다의 관계 두개 그럼 다대다가 됨. 이것을 피벗테이블이라고 함. 물리 스키마보다는 걔념적인 스키마다.

## mysql
- 그룹에 대해서 조건을 쓸때는 where을 안 쓴다.(having 사용)-> 무조건 group 키워드가 있다고 having이 아니라 select에서 사용할 것이 개별인가 그룹인가 에 따라 다름
- 데이터가 저장되어 있다면 프라이머리를 후에 바꾸기 힘들 수도 있다
- 정수정수 연산이여도 답이 실수면 실수가 나온다.
- zerofill은 빈공간을 다 0으로 채우는 거 인듯
- 알리오스 이중 따움표 노노 따움표 or 그냥 사용. 작은 따움표로 감싸는 것은 예약어로 안 본다는 것이다.
- inner join 에서 inner를 안 쓰면 default로 inner로 됨
- 자식을 기준으로 부모를 outer로 join하는 것은 outer join 의 의미가 없을지도
- CURRENT_TIMESTAMP 인수가 없는 프로시져는 가로 생략가능
- 개별적으로 가져와서 연산에 사용.
- 그룹에 사용되는 이름은 묶은 단위를 써주는 것이 좋다. 다른 것은 의미가 없다.
- from절에는 함수를 사용할 수 없다. where절에는 사용 가능. 하지만 그룹은 불가능 이것을 가능하게 하는 것이 subquary
- insert에는 조인이 없음.

## join
- 세타 네추럴 이너 다 이너임
- 세타는 이너를 안쓰고 where을 쓴다는 것
- 네추럴은 동일한 이름의 칼럼만 이용한다는 것
- 이너는 using과 on이용
    * using : 동일한 이름의 칼럼을 가지는 경우(이 때는 naturarl join을 사용할 수도 있다)
    * on : 동일한 이름의 칼럼을 가지지 않는 경우
- 얘네들은 매칭이 안 되는 것은 안 나옴
- 테이블 순서를 바꿔도 마찬가지.
- 즉, 자식이 기준일때 부모에서 자식 참조하지 않은 것들은 출력이 안됨
- 이것을 가능하게 하는 것이 left right임
## 식별 비식별
외래키가 주키로 쓰이면 식별관계
외래키가 주키로 쓰이지 않으면 비식별관계
폴린키가 복합키의 일부가 되는 것을 식별관계이다.아니면 비 식별관계
## trigger
- 자식은 삭제시에 제한을 받지 않음 부모는 제한을 받음.
- delete는 casecade  사용하지 말길. 부모삭제시 순차적으로 다 삭제 a b c를 착착 지우려면 모두 cascade로 되어 있어야 함. 중간에 default나 restrict가 있으면 처음부터 오류 뜸.
- 리스트릭트로 하게 되면  자식부터 자울 수 뿐이 없음. 할아버지까지 다 지우려면 join써서 지우면 됨
- update는 cascade 권장

## TRANSECTION
- transection 일련의 연속된 잡업처리를 컨트롤 할 수 있는 것. 우리가 지금 설정자체가 명령 할때마다 테이블에 반영이 됨.(auto commit) auto commit 을 해제하면 log를 남기는 영역(innob를 사용하는 한)에 시작점으로 돌아갈 위치를 표기해 놓게 된다. 명령을 할때 마다 log에 계속 쌓이게 되고(실제 테이블에 적용 되는 것이 아니라) commit을 하면 begin으로 부터 지금까지 쌓인 것을 실제 적용하고 rollback은 begin(on->off,rolllback, commit)으로 돌아가게 된다. on 일때 또한 log가 있지만 그것은 바로바로 명령이 들어오는대로 적용시킨다. 시작점이 없다.
- 한 사람이 트렌젝션을 했다해서 다 적용 되는 것이 아님. 기본은 자동으로 적용이 되게 끔 되어 있음 한사람이 오토를 끄면 그 기능만 꺼지는거 다른 사람은 오토 커밋이 유지가 
## sql 구문
- DDL (Data Definition Language) 는 데이터 베이스 스키마를 정의 하거나 조작하기 위해 사용한다. SCHEMA, DOMAIN, TABLE, VIEW, INDEX 를 다음 명령어로 정의, 변경, 삭제한다.
1. CREATE : 정의 
2. ALTER: 수정
3. DROP : 삭제
4. TRUNCATE : DROP 후 CREATE
5. Oracle 11g 이전 버전과 MySQL은 DDL에 대해서 트랜잭션을 지원하지 않는다.
(Rollback 할 수 없고 Commit할 필요도 없다.)

- DML (Data Manipulation Language) 는 데이터를 조작 (조회, 추가, 변경, 삭제) 하기 위해 사용한다. 사용자가 응용 프로그램과 데이터 베이스 사이에 실질적인 데이터 처리를 위해서 주로 사용한다.
1. SELECT : 조회
2. INSERT : 추가
3. DELETE : 삭제
4. UPDATE : 변경
5. 기본적인 위의 명령어 외에 LOCK, EXPLAIN, CALL 등도 DML에 포함 된다. 이건 transaction 잘된다.

## erdiagram
- 업무분석을 바탕으로 실체를 만들어 냄 
실체=entitiy=사각형=업무=개체
- 실체는 속성을 가지고 있음 
속성=원=업무에 필요한 데이터
- 속성들이 모여서 실체가 됨. 이 속성들의 값을 모은 것을 튜플이라 하고 이 튜플을 모은 것이 실체
- 식별능력을 가진 후보키를 뽑고 이중 식별자를 뽑는다.(언더바로 표기)
- 후보키가 존재하지 않을 경우 설계 속성을 추가하여 이를 주 키(Primary Key)로 만들어준다.
- 태그를 바탕으로 게시글을 찾는다고 했을때  태그와 게시물로 부터 나오는 과계에 해당하는 실체,개체에 대해서 회원이 무언가를 하는 것이 아니고(그건 논리적에서)
회원은 그져 게시글과의 관계에서 찾는다 라는 행위관계만 있으면 된다.
반드시 엔티티사이에 관계를 집어넣으려고 하지 말아라 엔티티 그 자체에 관계가 포함되어 있을 수 있다.
# 전체 설계 단계
- 개념->이알다이아그램->테이블->정규화(데이터의 중복을 제거하기 위해 속성을 분리)->논리스키마->물리스키마
- 제 1정규화 : 중복되는 부분을 정리하여 일대 다의 관계로 만든다.  떨어저 나간 놈이 자식
1. 첫번째 위배 : 비슷비슷한 튜플, 같은 정보를 많이 가진 여러개의 튜플의 경우
2. 두번째 위배 : null이 채워지는 칸이 많은 경우. 이 경우에는 비슷한 속성을 반복적으로 가지는 경우.
- 제 2정규화 : 복합키에 모두에 대해 의존적이지 않은 키를 분리. 떨어져 나간 놈이 부모 (두 개 이상의 칼럼을 묶어 복합키로 사용하는 경우에 사용)
- 제 3정규화 : 기본키에 의존적이지 않고 일반키에 의존적인 것들은 분리

## 뷰
- 가상의 테비블로 데이터를 저장하지 않음.
- 테이블을 바라보는 하나의 '창(window)'으로 생각하면 좋다.
- 뷰는 실체가 없이 데이터를 모으기 위한 정보만을 가진다.
- 하나 또는 복수의 테이블로부터 원하는 컬럼만을 수집할 수 있다.(장점)
- 뷰와 테이블은 서로 조인(JOIN)이 가능하기 때문에 뷰를 사용하여 다중 조인의 효과를 볼 수 있다.

- [중요] 뷰를 가지고 데이터를 편집할 수 있다. 하지만
1. 가공된 값을 보여주는 컬럼은 수정할 수 없다.
2. 가공 없이 그대로 테이블을 보여주지 않는 이상 키 값을 편집할 수 없다.

따라서 뷰를 통한 데이터 편집 및 삭제는 하지 않는 것을 강력하게 권장한다.

- 뷰를 생성할 때 적용한 WHERE절의 조건은 계속 유지됨 
-> WHERE절을 뷰를 만들 때 사용하지 않고 상황에 따라 조건을 주는 것이 바람직
