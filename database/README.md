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

## index
인덱스 column은 데이터를 더 빨리 찾도록 도와준다.
폴린키가 설정되면 인덱스키도 자동으로 해당 칼럼에 매겨진다. (유니크 프라이머리 포린 모두 인덱스 걸림)삭제할때는 별도로 해주어야 한다.
인덱스는 많이 사용하지 않는 것이 좋다. 검색이 많이 사용되는 컬럼에 인덱스를 추가하는 것이 좋다.  varchar는 가변형이기 때문에 index를 걸지 않는 것이 좋다. (효율이 안 좋다.)

## INNODB
ISAM,MYISAM 이런것과 달리 우리가 사용하는 것은 삭제하고 넣어도 increment 갱신이 되지를 않는다. 즉, 4를 삭제하고 추가하면 4가 아니라 5에 추가 된다.사이사이 비어 있는 값을 사용하려면 직접 지정해야 한다. 대신 transectiono을 사용가능하다. (아직 안 배움) 



