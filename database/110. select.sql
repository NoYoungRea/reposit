SELECT* FROM category;
SELECT 2+2;
SELECT NOW();
SELECT CEIL(3.1);
SELECT CEIL(3.1) from category;
-- 이경우 북에 10개 행이 있다면 그 행에 대해서 모두 저 연산을 수행하는 것이다.
SELECT CEIL(3.1) AS result FROM category;
-- 헤더가 result
SELECT CEIL(3.1) AS 'result value' FROM category;
--공백 해더
SELECT CEIL(3.1) result FROM category;
-- as 생략가능
SELECT c_code,c_name FROM category;
--카테고리 테이블로 부터 특정 컬롬을 찍는 것
SELECT category.c_code,category.c_name FROM a1.category;
-- 이게 자동으로 생략 된거
SELECT c_code'a',c_name'b' FROM category;
-- 이렇게 이름 붙이는 거 가능 알리아스
SELECT c_code AS 'a',c_name AS 'b' FROM category;
-- 여기 as가 생략 된거 
SELECT NOW()'current',c_code AS 'a',c_name AS 'b' FROM category;
-- 해당 테이블로 부터자료를 가져오는 것 뿐만 아니라 덧붙이는 것이 가능
SELECT a.c_code,a.c_name FROM category AS a;
--알리아스 저거 생략은 해도 되지만 category로 참조하면 오류다.




