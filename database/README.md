## sql command
mysql -uroot -p mysql<create_user_exam.txt
mysql -uroot -p mysql<show.txt
mysql -uroot -p mysql<show.txt>result.txt
mysql -uroot -p mysql<show.txt>result.txt 2>error.txt	 	(< system.in 1>system.out 2>system.err)
mysql -uroot -p mysql<show.txt>result.txt 2>result.txt		(윈도우 불가 포식스 가능)
mysql -uroot -p mysql<show.txt>result.txt 2>&1			(에러도 같은 곳에 같이 출력))
첫번째 줄에서 오류면 담것은 실행 안함(만약 3째줄이 오류이면 2째 줄까지는 정상 처리가 됨.

show tables(현재 db)
show tables in mysql
show columns in grades

rename user project to worker;

show grants
show grants for worker

drop user if exists project;
create user project identified by '1234';
!=
create user if not exists project identified by '1234';
1. 있으면 지우고 없으면 만듬
2. 있으면 안만들고 없으면 만듬

revoke all privileges on project.*from worker;

mysqladmin --user=root -p drop project

show create user root@'localhost';	
set password for worker = password('1234');

## utf8
utf8을 기본으로 지정해줬다고 해서 클라이언트도 utf8을 기본으로 해주는 것이 아니다. 그것을 위해서 자신의 것으로 맞추라고 강제하는 것이 handshake라고 한다.
메모장에 추가해주면 된다.
collation-server=utf8_unicode_ci
skip-character-set-client-handshake

콘솔의 인코딩 또한 설정을 해줘야 할 수도 있다. 관련 코드는 다음과 같다.
chcp 65001
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
comics 은 카테고리와 퍼블리셔 가 부모임 일대 다의 관계 두개 그럼 다대다가 됨. 이것을 피벗테이블이라고 함.

## mysql
-- 그룹에 대해서 조건을 쓸때는 where을 안 쓴다.(having 사용)
-- 데이터가 저장되어 있다면 프라이머리를 후에 바꾸기 힘들 수도 있다
-- 정수정수 연산이여도 답이 실수면 실수가 나온다.
## join
- 세타 네추럴 이너 다 이너임
- 세타는 이너를 안쓰고 where을 쓴다는 것
- 네추럴은 동일한 콜롬만 이용한단느 것
- 이너는 using과 on이용
- 얘네들은 매칭이 안 되는 것은 안 나옴
- 테이블 순서를 바꿔도 마찬가지.
- 즉, 자식이 기준일때 부모에서 자식 참조하지 않은 것들은 출력이 안됨
- 이것을 가능하게 하는 것이 left right임
## 식별 비식별
외래키가 주키로 쓰이면 식별관계
외래키가 주키로 쓰이지 않으면 비식별관계
폴린키가 복합키의 일부가 되는 것을 식별관계이다.아니면 비 식별관계
