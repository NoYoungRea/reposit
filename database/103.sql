CREATE TABLE customers(
id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY)
ENGINE=INNODB DEFAULT CHARSET=UTF8;
--테이블을 잘 못 만들었을때 지우고 다시만드는 것이 아니라 편집할 수 있다.
ALTER TABLE customers ADD c_name VARCHAR(50) NULL;
ALTER TABLE customers ADD c_phone VARCHAR(50) NULL;
DESC customers;
--속성 집어넣고 속성에 대한 것 보기 show column 이랑 똑같은 듯
ALTER TABLE customers DROP c_name;
--속성 날리기
ALTER TABLE customers ADD c_name VARCHAR(30) NOT NULL
DEFAULT 'defualt' AFTER id;
--속성 위치 정하기                    
ALTER TABLE customers ADD num INT FIRST;
--속성 위치 맨 처음으로 하기
