SELECT
	id 일렬번호, comics_id 서적번호, rating_date 판매일자, rating_count 판매수량, rating_price 판매단가,
	rating_count*rating_price 총판매액
FROM ratings
WHERE rating_count>=10 and rating_price >=17000  --&& 사용 가능
ORDER BY rating_count*rating_price DESC;
