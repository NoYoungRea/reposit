
-- ////////////////////copy by insert//////////////////////
CREATE TABLE temp(
t_code VARCHAR(200),
t_name VARCHAR(200))ENGINE=INNODB;

insert INTO temp(SELECT bc_code, bc_name FROM book_category);
-- select로 지금까지 추력한 것을 table로 만들 수 있다.
-- create table as select 와 비슷한 기능임.
-- 쓸 일이 거의 없음 쓰면 view를 쓰게 됨

-- /////////////update & delete all/////////////
UPDATE temp SET t_code='web programming';
-- 이렇게 하면 where이 없기때문에 다 바뀜
DELETE FROM temp;
-- 이렇게 하면 다 날라감

-- //////////////////auto commit(x)/////////////////
SET autocommit=0;
-- 자동으로 반영 안 되게 off사용해도 됨
DELETE FROM temp;
-- 다 달라갔네? 보이는 거만 그렇게 보인다는 것x`
ROLLBACK;
-- 롤백 사용시 돌아가는 위치는 begin위치다. 명시적으로 해주어도 되지만 주로
-- on에서 off로 바뀔때, commit한 지점, rollback한 지점


-- ///////////////////update////////////////////////
CREATE TABLE saleslog(
id INT UNSIGNED ,
pd_name VARCHAR(20) NOT NULL,
pd_price INT UNSIGNED NOT null)
ENGINE=innodb

INSERT INTO saleslog VALUES(1,'함버거',5000);
INSERT INTO saleslog VALUES(1,'핫도그',4000);

SELECT
	A.id,A.pd_name,A.pd_price
FROM saleslog AS A

ALTER TABLE saleslog ADD PRIMARY KEY(id)
-- 데이터 텝에 가서 바궈주면 적용 가능 이대로라면 불가능

UPDATE saleslog SET pd_price=pd_price+1000;
-- 천원식 올리기
UPDATE saleslog
SET pd_price=pd_price-2000
WHERE pd_name LIKE'함버거';

ALTER TABLE saleslog
ADD tax INT UNSIGNED ;

UPDATE saleslog
SET tax=pd_price*0.1

ALTER TABLE saleslog MODIFY id INT UNSIGNED AUTO_INCREMENT;
-- auto를 주려면 primary 로 되어 있어야 한다.

UPDATE saleslog
SET id=id+1 ORDER BY id DESC
-- 앞에서 부터 하면 오류 뜬다. 내부적으로 정렬을 해 놓고 가져오는 것.

-- ///////////////////////////////////////////////////////////
CREATE TABLE parts(
p_code CHAR(10) NOT NULL PRIMARY KEY,
p_name VARCHAR(200) NOT NULL)
ENGINE=INNODB;

CREATE TABLE products(
pd_code CHAR(10) NOT NULL PRIMARY KEY,
p_code CHAR(10) NOT NULL,
pd_name VARCHAR(200) NOT NULL,
pd_price INT UNSIGNED NOT NULL DEFAULT 0,
pd_discount TINYINT UNSIGNED NOT NULL DEFAULT 0,
FOREIGN KEY(p_code) REFERENCES parts(p_code))
ENGINE=INNODB;

SET autocommit =off

 SELECT*FROM products
 INSERT INTO parts VALUES('monitor','모니터');
 INSERT INTO parts VALUES('storage','저장장치');
 COMMIT;
 -- 이것을 해야 cmd에 보임 (여기서는 안해도 보이는 데 실제로 들어간것이 아니라 로그에 있는 것을 보여줌)
 INSERT INTO products VALUES('monitor001','monitor','23inchLED',240000,DEFAULT);
 INSERT INTO products VALUES('monitor002','storage','ssD',80000,10);
 
 -- ////////////////////////update join.//////////////////////////////////
 -- 제품정보를 실제 판매가와 함께 출력
 SELECT
 pd_code,p_code,pd_name,pd_price,pd_discount,pd_price*(1-pd_discount/100)
 FROM products;
 
 -- 제품코드가 ~인 제품의 할인울을 20-으로 변경하세요
 UPDATE products SET pd_discount=20 WHERE pd_code='monitor001';
 
 -- 분류명인  모니터인것을 30프로로 바꿔라?
 UPDATE products A NATURAL JOIN parts B SET A.pd_discount=30 WHERE B.p_name='모니터';

 UPDATE products a,parts b
 SET a.pd_discount=10;
 WHERE B.p_name='모니터' 
 -- 세타로도 가능 but 세타는 의미 없잖음
 
 -- 분류명인  저장장치인것을 제품들의 가격을 10% 인상
 UPDATE products A NATURAL JOIN parts B SET A.pd_price=pd_price*1.1 WHERE B.p_name='저장장치';
 -- ////////////////////////////////delete join/////////////////////////////////////////////
 SET autocommit=off
 SELECT*FROM products;
 SELECT*FROM parts
 DELETE FROM products;
 ROLLBACK;
 
 -- 전체 지우는 것 delete말고 truncate
 TRUNCATE products;
 -- 롤벡이 안 먹힘. 결과는 같지만 작동하는 방식이 다름.
 -- 테이블 자체를 아예 지워버리고 빈 테이블을 다시 만듬. 안 쓰는 것이 좋음
 -- 근데 왜 알려줌?
 
INSERT INTO products VALUES('monitor003','monitor','24inchLED',250000,DEFAULT);
INSERT INTO products VALUES('ssd001','storage','ssD',70000,20);
-- 제품 코드가 ssd128mlc인것을 삭제
DELETE FROM products WHERE pd_code='ssd001'
-- 분류명이 모니터인 것을 삭제
DELETE A FROM products A NATURAL JOIN parts B WHERE B.p_name='모니터'; 


-- ////////////////////case/////////////////////////////////
SELECT pd_name,pd_price,
case floor(pd_price/100000)
	when 0 then '10만 미만'
	when 1 then '10만 ~ 20만'
	ELSE '20만 이상'
END AS '가격대'
FROM products

SELECT pd_name,pd_price,
case
	when pd_price BETWEEN 0 AND 99999 then '10만 미만'
	when pd_price BETWEEN 100000 AND 200000 then '10만 미만'
	ELSE '20만 이상'
END AS '가격대'
FROM products

