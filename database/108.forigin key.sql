CREATE TABLE category(
c_code CHAR(2) NOT null PRIMARY KEY,
c_name VARCHAR(200) NOT NULL)
ENGINE=INNODB DEFAULT CHARSET=UTF8;


CREATE TABLE ingredient (
i_code CHAR(2) NOT NULL PRIMARY KEY,
i_name VARCHAR(200) NOT NULL)
ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE product(
p_code CHAR(4) NOT NULL PRIMARY KEY,
p_name VARCHAR(200) NOT NULL,
c_code CHAR(2) NOT NULL,
i_code CHAR(2) NOT NULL)
ENGINE=INNODB DEFAULT CHARSET=UTF8;

INSERT INTo category VALUES('00','not yet');
ALTER TABLE product ADD FOREIGN KEY(c_code) REFERENCES category(c_code) on delete RESTRICT ON UPDATE cascade;
-- 자식있으면 삭제 못해 (기본값)(restrict) 자식거 까지 다 없에 or 자식거랑 같이 바뀌어라(cascade) 자식들을 다른 걸로 바꿔(set)
INSERT INTO category VALUES('01','bread');
INSERT INTO product VALUES('p001','고구마빵','01','00');

SELECT *FROM category;
SELECT * FROM product;
DELETE FROM category WHERE c_code ='01';
-- 자식이 있기 때문에 거부가 된다.
UPDATE category SET c_code='02' WHERE c_code ='01';
-- 부모것을 바꿔도 상관 없는 것이 우리가 지정하기를 cascade로 해 놓았다. 부모가 바뀌어 소유가 없어질 것을 고려하지 않아도 된다.

DELETE FROM product;
-- 전체 삭제
DELETE FROM category WHERE c_code='02';
-- 딸려있는 자식이 없으므로 삭제해도 괜찮다

SHOW CREATE TABLE product;
CREATE TABLE `product` (
  `p_code` char(4) NOT NULL,
  `p_name` varchar(200) NOT NULL,
  `c_code` char(2) NOT NULL,
  `i_code` char(2) NOT NULL,
  PRIMARY KEY (`p_code`),
  KEY `c_code` (`c_code`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`c_code`) REFERENCES `category` (`c_code`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=UTF8

-- 다음과 같은 정보가 나온다. 여기서
ALTER TABLE product DROP FOREIGN KEY product_ibfk_1;
SHOW CREATE TABLE product;
--이 코드를 처주면

SELECT * FROM product

CREATE TABLE `product` (
  `p_code` char(4) NOT NULL,
  `p_name` varchar(200) NOT NULL,
  `c_code` char(2) NOT NULL,
  `i_code` char(2) NOT NULL,
  PRIMARY KEY (`p_code`),
  KEY `c_code` (`c_code`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8
-- 다음과 같이 저 폴린 키에대한 정보가 없어진 것을 볼 수 있다. 관계로부터 자유로워졌다.

ALTER TABLE product DROP KEY c_code;
-- 인덱스 키를 지운다. 포린 키를 지정하면 자동으로 인덱스 키로 지정된다.

ALTER TABLE product ADD FOREIGN KEY (c_code) REFERENCES category(c_code) ON UPDATE CASCADE;
ALTER TABLE product ADD FOREIGN KEY (i_code) REFERENCES ingredient(i_code) ON UPDATE CASCADE;



INSERT INTO ingredient VALUES('01','밀가루');
INSERT INTO category VALUES('01','빵류');
INSERT INTO product VALUES('p001','메론빵','01','01');

SHOW INDEX FROM product;
-- 인덱스에 해당하는 칼럼들을 볼 수 있다. 각 속성 관련 데이터들(index, unique) 그리고 cardinality는 만들어직 객체의 수를 말하는 듯 햐다.
-- 현재는 하나만 만들었기 때문에 1이라고 뜬다.
