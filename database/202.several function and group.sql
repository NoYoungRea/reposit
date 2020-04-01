SELECT NOW()
SELECT YEAR (NOW())
-- 숫자로 나옴2020
SELECT quarter(NOW())
-- 2
SELECT DATE_ADD(NOW(),INTERVAL 100 DAY)
SELECT DATE_ADD('1900-01-01 00:00:00',INTERVAL 100 DAY)
SELECT concat('h','gd')
-- 합치기
SELECT lpad(CONCAT('h','gd'),10,'#')
-- 채우기
SELECT length("hgd")
-- 문자 셋에 따라서 산정 방식이 다르다.
SELECT if(length("hgd")=3,'3!','dontknow')
-- 조건문
SELECT IFNULL(category_code, 'unknown') FROM category;
-- 널일때

SELECT category_code, LEFT(category_code,2) FROM category
-- 카테고리와 카테고리 왼쪽에서 두개로 짜른거 출력 다 개별적인 함수이기 때문에


-- 여기서 부터는 table 전체애 대한 위에는 
SELECT COUNT(*) FROM comics;
-- table 전체를 연산 대상으로 삼는다.
SELECT SUM(price) FROM comics;
-- /////////////////////////////////////
SELECT category_code, AVG(price) FROM comics;
-- 전자는 개별 후자는 전체 이렇게 하면 안 됨. 두개가 같이 출력될 수 없는 구조임

SELECT category_code, AVG(price)
FROM comics
GROUP BY category_code
-- 이렇게 하면 저 avg라는 그룹 함수를 전체를 대상으로 하는 것이 아니라 카테고리 별로 수행하게 된다.
-- group by를 사용하지 않는 경우는 전체를 대상으로 할때
HAVING AVG(price)>=15000
-- where 대신 조건문으로 having 이것을 쓴다.

SELECT category_code, publisher_code, COUNT(*) FROM comics
GROUP BY category_code, publisher_code
-- 이렇게 하면 code기준으로 나누고 그 내부에 서는 publiser기준으로 나눈다. 복수의 그룹