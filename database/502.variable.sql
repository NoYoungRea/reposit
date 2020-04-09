CREATE TABLE test(
id INT UNSIGNED NULL DEFAULT NULL,
uname VARCHAR(50) NULL,
num INT UNSIGNED NOT NULL DEFAULT 0)
ENGINE=INNODB DEFAULT CHARSET=UTF8;

SELECT*
FROM test


INSERT INTO test VALUES(DEFAULT,'hgd',2500000);
INSERT INTO test VALUES(DEFAULT,'agd',2300000);
INSERT INTO test VALUES(DEFAULT,'gtw',2200000);
INSERT INTO test VALUES(DEFAULT,'cvx',2600000);
INSERT INTO test VALUES(DEFAULT,'hiy',2800000);
INSERT INTO test VALUES(DEFAULT,'nkc',1500000);

ALTER TABLE test ADD PRIMARY KEY (id)

SET @a:=10;
SET @a:=@a+1
SELECT @a;

SET @a:=0;
SELECT @a:=@a+1,id,uname,num
FROM test;

SET @a:=0;
UPDATE test SET id=@a:=@a+1;
SELECT*FROM test;

SET @a:=(SELECT MAX(num) FROM test);
SELECT @a;
-- 딱 하나의 값만 와야 함
SELECT * FROM test
WHERE num<@a
ORDER BY num DESC

-- subquary 대신 사용하는 변수들

SELECT COUNT(*), MAX(num),AVG(num),MIN(num)
INTO @rowCount, @maxNum,@avgNum,@minNum
FROM test

shdudfo
-- select 절 안에 into 구문 출력 값을 변수 안에 처 넣음