CREATE VIEW view_comics AS 
SELECT category_name, title, price
FROM comics
NATURAL JOIN category
-- select문을 이용해서 view를 만듬shdudfoshdudfo
SELECT* from view_comics
-- 확인
DROP view view_comics;
-- view 삭제
CREATE VIEW view_comics AS SELECT id, category_name,title,price,publisher_code
from category NATURAL JOIN comics;

SELECT* FROM view_comics;

SELECT* FROM view_comics NATURAL JOIN publisher
-- \g

SELECT*FROM comics;
SELECT*FROM ratings;
SELECT*FROM category

shdudfo
CREATE VIEW VIEW1 as
SELECT publisher_name,category_name,title,price
FROM publisher NATURAL JOIN comics NATURAL JOIN category
WHERE price>=17000

-- view를 통해서 데이터를 바꿀 수 있음.
-- 주의할점은 가공된 데이터는 view를 통해 편집이 안됨. 본래의 값 그대로는 편집이 가능
-- 보여지는 정보 외에는 편집 불가능
-- view를 통한 편집 삭제는 되도록 하지 말도록 하지말도록 되도록 하지 말도록 하자

SHOW CREATE VIEW VIEW1;
-- 어떻게 만들어 졌는지 보여준다는
if NOT EXISTS vs CREATE OR replacemysql