SELECT*FROM members;
SELECT*FROM grades;
--만들어진 객체에 대한 설명
SHOW COLUMNS IN grades;
--속성에 대한 세부사항
SHOW COLUMNS FROM USER FROM mysql;
SHOW COLUMNS FROM mysql.user;
--다른 데이터베이스의 것을 할때
SHOW COLUMNS FROM temp;
-- 내 데이터베이스의 것을 할때
SHOW CREATE TABLE grades;
--다른 테이블을 기준으로 복사인듯 제약사항 다 안 따라옴
CREATE TABLE temp AS SELECT mname,email FROM members;