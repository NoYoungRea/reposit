
-- ////////////////where///////////////////////
SELECT *FROM comics
WHERE price=MAX(price)
-- 그룹함수 where 못쓴다.

SELECT *FROM comics
WHERE price=(SELECT MAX(price) FROM comics)
-- sub quary : 쿼리문 안에서 수행되는 쿼리문
-- 그래서 이렇게 할 수 있다.

SELECT *FROM comics
WHERE price=(SELECT MAX(price) FROM comics WHERE price<(SELECT MAX(price) FROM comics))
-- 두번째 큰거

SELECT *FROM comics
WHERE price>(SELECT AVG(price) FROM comics)
-- 평균보다 큰거
-- subquary 를 사용할 수 있는 위치가 있다. where select from 에서 가능

-- /////////////////select/////////////////////
SELECT id, title,price, category_code,(SELECT category_name FROM category WHERE category.category_code=comics.category_code) AS category_name
FROM comics;
-- select에는 각 튜플마다 실행해야 하기 때문에 사용하지 말자 위에건 걍 조인 하셈
-- ////////////////from////////////////////
SELECT comics.id, title, price 
FROM(SELECT * FROM comics) a
-- from 에서 sub를 사용하는 경우 반드시 알리아싱 해주어야 함.
-- 해주지 않는다면 id title price의 이름이 없음. 위처럼 하면 오류가 난다.

-- test1--
SELECT category.category_name, a.cnt
FROM category INNER join
(SELECT category_code,COUNT(*) cnt
FROM comics
GROUP BY category_code) a
USING(category_code)

-- test2--
-- 서적별 매출액
-- 서적명 총판매부수 총판매액

SELECT
	title,TC,AP,TP
FROM comics INNER join
(SELECT 
comics_id,
SUM(rating_count) AS TC,
AVG(rating_price) AS AP,
SUM(rating_price* rating_count) AS TP 
FROM ratings
GROUP BY comics_id)AS b
on(id=b.comics_id)

-- on으로 사용할거 이름 바꿔서 using 사용 가능
-- 내가 한 것은 안 팔린 책들은 안 나온다.

SELECT
	title,ifnull(TC,0),IFNULL(AP,0),ifnull(TP,0)
FROM comics left join
(SELECT 
comics_id,
SUM(rating_count) AS TC,
floor(AVG(rating_price)) AS AP,
SUM(rating_price* rating_count) AS TP 
FROM ratings
GROUP BY comics_id)AS b
on(id=b.comics_id)

-- 분류별 매출액
-- 분류명 총판매부수 판매단가 총판매액
SELECT
	category_name,q1,q2,q3
FROM category LEFT join
(SELECT
	comics.category_code,ifnull(sum(TC),0) AS q1,IFNULL(avg(AP),0) AS q2,ifnull(sum(TP),0)AS q3

FROM
	comics LEFT join
	(SELECT 
		comics_id,
	SUM(rating_count) AS TC,
	floor(AVG(rating_price)) AS AP,
	SUM(rating_price* rating_count) AS TP 
	FROM ratings
	GROUP BY comics_id
	) AS b
	ON(comics.id=b.comics_id)

GROUP BY comics.category_code)
AS c
using(category_code)
