SELECT * FROM category;
SELECT category_code,category_name FROM category;
SELECT
	category_code'분류코드',
	category_name'분류명' 
FROM
	category AS C 
-- category 를 c로 알리알싱하고 있다.  
WHERE
	category_code='ACTI'
--	category_code NOT LIKE 'A___';(ㅇ)
--	category_code LIKE 'A%' (ㅇ)
--	category_code NOT LIKE 'A%' (ㅇ)
-- 분류코드='atci' 이건 안 됨 (x)
-- category_code='A%' 이것 도 안 됨 이거를 하려면 (X)
ORDER BY
	C.category_code DESC
-- asc
LIMIT 3
-- 2.3 3번째 행부터 3개
