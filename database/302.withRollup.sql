SELECT 
comics_id,
SUM(rating_count*rating_price),
AVG(rating_price)
FROM ratings
WHERE comics_id<=10
GROUP BY comics_id
WITH ROLLUP
-- 데이터의 소유주가 없으므로 자바 프로그래밍을 할때 의미가 없을 수도 있음. 여기에서만 보는 것은 의미가 있을 수도
-- 무조건 group 키워드가 있다고 having이 아니라 select에서 사용할 것이 개별인가 그룹인가 에 따라 다름