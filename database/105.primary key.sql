DROP TABLE if EXISTS test;
CREATE TABLE test(
num INT NOT NULL PRIMARY key,
t_name VARCHAR(20) NOT NULL)
ENGINE=INNODB DEFAULT CHARSET=UTF8
-- pk추가 1. PRIMARY key
DROP TABLE if EXISTS test;
CREATE TABLE test(
num INT NOT NULL,
t_name VARCHAR(20) NOT NULL
PRIMARY KEY(num))
ENGINE=INNODB DEFAULT CHARSET=UTF8
-- 2. primary key(num)
ALTER TABLE test ADD PRIMARY KEY(num);
--3. pk 나중에 추가
ALTER TABLE test DROP PRIMARY KEY;
--pk는 하나기 때문에 대상이 필요 없음 이게 없으면 동일한 데이터가 여러개 들어갈 수 있다.

INSERT INTO test
VALUES(1,'shdudfo')
--만약 pk가 없어서 같은 것을 여러개 만들면  나중에 키 지정 못함
