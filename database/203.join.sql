SELECT category_code FROM comics;
SELECT DISTINCT category_code FROM comics;
-- 중복되는거 거르기\
-- 실제 사용중인 카테고리를 본다.
SELECT category_code FROM category;
-- 현재 존재하는 분류 기준을 보는 것. 이것은 부모의 분류를 보는 것이라면 위에 것은 자식에서 실제 사용중인 분류를 보는 것


SELECT* FROM comics,category
-- full join 사용할 일이 없음 (관련성이 없어서)
-- straign join 도 사용할 일이 없음(관련성이 없어서) 두개의 차이는 그냥 순서

-- /////////////////세타조인/////////////////////////////
SELECT* FROM comics,category
WHERE comics.category_code=category.category_code;
-- 이것을 추가하면 관련된 것만 연결->세타 조인

SELECT* FROM category,comics
WHERE comics.category_code=category.category_code;
-- 세타조인의 문제점 없는 것들은 안 나옴 저거 바꿔도 해결이 안 됨...
-- 즉 기준이 없다는 것, 나오는 순서만 바뀜


SELECT
	a.id,title,rating_count, rating_price,
	rating_count*rating_price 'total'
FROM comics a, ratings b
WHERE a.id=b.comics_id && rating_count*rating_price >=100000 -- 'total' 이렇게 사용하면 안 됨
ORDER BY total -- 여기선 total라벨 사용하는 것 가능 where에서는 알리아슬를 연산자로 사용할 수 없음.
-- 이렇게 하면 애매하다. 따로 참조해주어야 함.
-- 주의 할점은 id의 경우 comics에도 있고 ratings에도 있어서 모호성의 여부가 생기기 때문에 반드시 참조를 명시해주어야 한다.

SELECT
	a.id,title,category_name,rating_count, rating_price,rating_date
FROM comics a,category b,ratings c
WHERE a.category_code=b.category_code
AND a.id=c.comics_id
AND rating_count >=10
order BY rating_count DESC
-- 3개 세타
-- ///////////////////inner join///////////////////
SELECT
	id,title,rating_count, rating_price,
	rating_count*rating_price 'total'
FROM comics inner join ratings
ON (comics.id=ratings.comics_id);
-- where 절을 이용하냐 on을 이용하냐 차이 밖에 없음

SELECT
	a.id,title,category_name,rating_count, rating_price,rating_date
FROM comics a INNER JOIN category b using(category_code)
INNER JOIN ratings c ON(a.id=c.comics_id)
WHERE rating_count>=10
ORDER BY rating_count DESC
-- 3개 inner join
-- /////////////////////natural join//////////////////

SELECT*
FROM comics a NATURAL JOIN category b
-- only 동일한 이름의 콤롬만 
-- join은 주로 주키 보조키로 엮는다. 오류는 나지 않겠지만 상관 없는 것들 역지 말자.
-- natural은 using을 이용하는 것과 비슷하다. 이름이 같은 것이 반드시 있어야 한다.(혹은 알리오싱으로 지정해주던지)


-- //////////////////left right join//////////////////
-- 여기서 부터는 기준이 생기기 때문에 매칭되는 것 뿐만 아니라 기준에 따라 참조되지 않은 것도 null로 다 나온다.
-- outer 생략 가능
-- using과 on다 가능
SELECT *
FROM comics LEFT outer JOIN category
USING(category_code)
-- 왼쪽이 기준(자식이 기준) 참조되지 않은 것은 나오지 않음

SELECT *
FROM comics right outer JOIN category
USING(category_code)
-- 오른쪽 부모가 기준 참조되지 않은 것도 다 나옴


-- 분류명 서적명 판매일자 판매수량 판매단가
-- 단 분류명으로 등록된 서적이 업어도 분류정보는 출력이 되야 한다.
-- 또한 서적 판매정보가 없어도 서적 정보는 출력이 되야 한다.

SELECT 
category_name,title,rating_date,rating_count,rating_price
FROM category LEFT outer JOIN comics USING(category_code) LEFT join ratings using(id);


-- 분류명 서적명 판매일시 판매수량 판매단가 총판매가 
-- 조건 : 서적을 기준으로 출력하되 만약 판매 이력이 없다면 판매 일시는 empty로 그 외의 수치형은 0으로 출력

SELECT
category_name,title,IFNULL(c.rating_date,'') AS rating_date,IFNULL(c.rating_count,0) as rating_count,
IFNULL(c.rating_price,0) as rating_price, IFNULL(c.rating_count,0)* IFNULL(c.rating_price,0) AS total_price
FROM category a NATURAL JOIN comics b LEFT JOIN ratings c ON(b.id=c.comics_id)
-- 자식이  기준이므로 부모랑 join할때 딱히 기준이 없어도 된다. 그래서 inner를 썼고 이 실체를 가진 책에 대한 판매이력은
-- 팔리지 않았어도 나와야 하기 때문에 이 합친 것을 기준으로 했다.