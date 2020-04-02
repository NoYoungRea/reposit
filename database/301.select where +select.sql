
-- /////////////////////where 에 select 심화///////////////////////////
SELECT *
FROM comics
WHERE category_code=(SELECT DISTINCT category_code FROM comics WHERE price>19000)
-- 안되는 이유 : sub의 실행결과가 4개인데 이것을 가지고 비교를 하고 처 앉아있음.

SELECT *
FROM comics
WHERE category_code in(SELECT DISTINCT category_code FROM comics WHERE price>18000)
-- 이렇게 하면 쌉가능

-- ////////////////////////select 에 select 심화//////////////////////////
SELECT
	(SELECT category_name FROM category WHERE category_code='FANT') AS category_name,
	category_code,
	title
FROM comics
-- 잘못된 예

-- 코믹에 있는 책들의 카테고리를 코드가 아니라 이름으로 하고 싶을때 조인이 아니라 셀렉을 이요ㅗㅇ하
SELECT
	(SELECT category_name FROM category WHERE category_code=comics.category_code) AS category_name,
	category_code,
	title
FROM comics
-- 소가로만 안에만  했을때는 실행 안 됨.
-- //////////////////////////////////////////////////////////////
