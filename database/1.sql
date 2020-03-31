
CREATE TABLE if NOT EXISTS members(
id INT UNSIGNED AUTO_INCREMENT PRIMARY key,
mname VARCHAR(20) NOT NULL,
pass VARCHAR(20) NOT null,
email VARCHAR(20) NOT NULL unique,
regdate DATETIME NOT NULL DEFAULT NOW()

)ENGINE=INNODB DEFAULT CHARSET=UTF8;


INSERT INTO
members(id,mname,pass,email,regdate)
VALUES(DEFAULT,'adddd','1234','shddufo2@naver.com',DEFAULT)

members(mname,pass,email)
VALUES('adddd','1234','shddufo2@naver.com')

members(mname,email,pass)
VALUES('adddd','shddufo2@naver.com','1234')
