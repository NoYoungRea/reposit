
-- ///////////////////////자식부모관계를 한 테이블로///////////////////////
CREATE TABLE book_category(
bc_code VARCHAR(20) NOT NULL,
bc_name VARCHAR(200) NOT NULL,
bc_upcode VARCHAR(20) NOT NULL DEFAULT '00',
PRIMARY KEY(bc_code)) ENGINE=INNODB

INSERT INTO book_category (bc_code,bc_name,bc_upcode)VALUES('programming','프로그래밍',DEFAULT);
INSERT INTO book_category (bc_code,bc_name)VALUES('reference','참고서');
INSERT INTO book_category(bc_name,bc_code)VALUES('소설','fiction');
INSERT INTO book_category VALUES('java','자바','programming');
INSERT INTO book_category VALUES('web','웹','programming');
INSERT INTO book_category VALUES('mysql','mysql','programming');
INSERT INTO book_category VALUES('java basic','자바기초','java');
SELECT * FROM book_category
-- 참조의 무결성이 깨짐, 데이터의 일관성이 깨진다고도 함. 데이터베이스에서 일관성 보장을 못함 그래서
-- 프로그래밍에서 보장을 해 주어야 함.
-- 노드로 연결한 것 같은 느낌이 강함

-- 분류코드 분류명 상위분류코드 상위 분류명
-- 상위가 뭐든 다 친거
SELECT
	A.bc_code 분류코드,
	A.bc_name 분류명,
	B.bc_code 상위코드,
	B.bc_name 상위분류명
FROM book_category A LEFT JOIN book_category B
ON(A.bc_upcode=B.bc_code);


-- 상위가 없으면
SELECT 	
	A.bc_code 분류코드,
	A.bc_name 분류명,
	B.bc_code 상위코드,
	B.bc_name 상위분류명
FROM book_category A JOIN book_category B
ON(A.bc_upcode=B.bc_code)

-- ////////////////////////////////

