SELECT `name`, `price` FROM products;
DELIMITER $$
CREATE OR REPLACE PROCEDURE myCursor()
BEGIN	
	DECLARE pname VARCHAR(200) DEFAULT NULL;
	DECLARE pprice INT UNSIGNED DEFAULT 0;
	DECLARE EOD INT DEFAULT FALSE;
	DECLARE mcursor CURSOR FOR SELECT name, price FROM products;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET EOD = TRUE;
	
	SET @q := 'UPDATE products SET price = ? WHERE name = ?';
	PREPARE stmt FROM @q;
	SET @new_price := 0;
	SET @product_name := '';
	
	OPEN mcursor;
	my_loop : LOOP
		FETCH mcursor INTO pname, pprice;
		IF (EOD = TRUE) THEN
			leave my_loop;
		END IF;
		
		CASE 
			WHEN pprice < 1000 THEN SET @new_price := pprice + 50;
			WHEN pprice < 2000 THEN SET @new_price := pprice + 100;
			WHEN pprice < 3000 THEN SET @new_price := pprice + 200;
			ELSE SET @new_price := pprice + 500;
		END CASE;
		
		SET @product_name := pname;
		EXECUTE stmt USING @new_price, @product_name;
	END LOOP;
	CLOSE mcursor;
END$$
DELIMITER ;

CALL myCursor;