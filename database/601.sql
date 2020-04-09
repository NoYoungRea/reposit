SELECT* FROM parts;
SELECT* FROM products;
SELECT* FROM orders;
SELECT* FROM orderlists;


-- 분류명 제품명 제품가격

CREATE OR REPLACE VIEW v_products AS
(SELECT parts.name,products.name, products.price
FROM parts JOIN products ON(parts.id=products.part_id)
)
SELECT*FROM v_products;

orders

-- 제품별 총 매출

SELECT product_id, product_price
FROM orderlists
GROUP BY product_id

-- 일자별 총 매출

SELECT ordered_date,SUM(product_price)
FROM orders LEFT JOIN orderlists ON(orders.id=orderlists.order_id)
GROUP BY ordered_date

-- 일자별 


SELECT ordered_date,SUM(product_price) AS total, name
FROM orders a inner JOIN orderlists b ON(a.id=b.order_id) INNER JOIN products c on(b.product_id=c.id)
GROUP BY ordered_date,c.name




delimiter $$
DROP PROCEDURE if not EXISTS test;
CREATE OR REPLACE PROCEDURE test() -- ;가 구분문자 역활만 하도록 d8elimiter
BEGIN
	SELECT*FROM products LIMIT 0,cnt;
END$$
delimiter ;
-- 원상태로

CALL test(10);

delimiter $$
CREATE OR REPLACE PROCEDURE test()-- ;가 구분문자 역활만 하도록 delimiter
BEGIN
	DECLARE max_price INTEGER DEFAULT 100;
	SELECT max_price;
END$$
delimiter ;
-- 변수는 이 안에서만 유효하다.(decrale은 procedure내에서만 가능)


delimiter $$
CREATE OR REPLACE PROCEDURE test()-- ;가 구분문자 역활만 하도록 delimiter
BEGIN
	DECLARE max_price INTEGER DEFAULT 100;
	SET @min_price:=50; -- 예는 전역 변수
	SELECT max_price;
END$$
delimiter ;

delimiter $$
CREATE OR REPLACE PROCEDURE test()-- ;가 구분문자 역활만 하도록 delimiter
BEGIN
	DECLARE max_price INTEGER DEFAULT 100;
	SELECT MAX(price) INTO max_price FROM products;
	SELECT max_price;
END$$
delimiter ;


delimiter $$
DROP PROCEDURE if EXISTS test;
CREATE OR REPLACE FUNCTION test() RETURNS integer
BEGIN
	DECLARE max_price INTEGER DEFAULT 100;
	SELECT MAX(price) INTO max_price FROM products;
	RETURN max_price;
END$$
delimiter ;

SET @r:=test();
SELECT @r;


delimiter $$
CREATE OR REPLACE PROCEDURE test(
col1 VARCHAR(50),
col2 VARCHAR(50),
word VARCHAR(50))
BEGIN
	-- SELECT col1,col2 FROM products;
	SET @q := CONCAT('select ',col1,',',col2,' from products where name like ?');
	
	PREPARE stmt FROM @q;
	set @w:= word;
	execute stmt USING @w;
END $$
delimiter ;

CALL test('name','price','크림치즈 스틱');



delimiter $$
CREATE OR REPLACE PROCEDURE mcount(IN bound INTEGER, OUT result integer)
BEGIN
	DECLARE cnt INTEGER DEFAULT 0;
	SET cnt=0;-- cnt=0(x) : cnt가 영이니?
	SET result=0;
	
	test_loop : loop
		SET cnt=cnt+1;
		SET result=result+cnt;
		if(cnt>=bound) then leave test_loop;
		END if;
	END loop;	
END $$
delimiter ;

SET @result :=0;
CALL mcount(10, @result);
SELECT @result;

DELETE PROCEDURE mcount;


delimiter $$
CREATE OR REPLACE function mcount(bound INTEGER) RETURNS integer
BEGIN
	DECLARE cnt INTEGER DEFAULT 0; 
	DECLARE result INTEGER DEFAULT 0; 

	test_loop : loop
		SET cnt=cnt+1;
		SET result=result+cnt;
		if(cnt>=bound) then leave test_loop;
		END if;
	END loop;	
	RETURN result;
END $$
delimiter ;

SET @result :=mcount(10);
SELECT @result;


delimiter $$
CREATE OR REPLACE PROCEDURE myproc(
col1 VARCHAR(50),
TABLE1 VARCHAR(50),
CODE1 VARCHAR(50))
BEGIN
	SET @q := CONCAT('select ',col1, ', case Floor(price/1000)
	when 0 then \'1000 미만\'
	when 1 then \'2000 미만\'
	when 2 then \'3000 미만\'
	else \'3000 이상\'
	end
	from ',TABLE1, ' where part_id=?');
	PREPARE stmt FROM @q;
	set @w:= CODE1;
	execute stmt USING @w;
END $$
delimiter ;

CALL myproc('name','products',1);

delimiter $$
CREATE OR REPLACE PROCEDURE myCursor()
BEGIN
	DECLARE mcursor FOR SELECT 'name', 'price' FROM products;
	DECLARE pname VARCHAR(200) DEFAULT NULL;
	DECLARE pprice INT UNSIGNED DEFAULT 0;
	DECLARE eod INT DEFAULT FALSE;
	DECLARE continue handler FOR NOT FOUND eod=ture;
	-- continue라는 핸들러를 지정해서 더이상 찾지 못하면 eod값을 true로 만든다.
	OPEN mcuror;
	my_loop : loop
		fetch mcursor INTO pname,pprice;
		-- 첫번째 것을 pname, 두번째를 pprice에 넣는다.
		if(eod=ture) then leave my_loop;
		END if;
		SET @q
		SELECT pname,pprice;
	END loop;
END $$
delimiter ;