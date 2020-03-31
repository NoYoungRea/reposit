CREATE TABLE book(
id INT  UNSIGNED AUTO_INCREMENT PRIMARY KEY
title VARCHAR(200) NOT NULL
price MEDIUMINT UNSIGNED NOT NULL DEFAULT 0,
CHECK(price BETWEEN 0 AND 100000))
ENGINE=INNODB DEFAULT CHARSET==UTF8;
-- check를 통해서 들얻오는 데이터를 한 번 더 검사할 수 있다.
INSERT INTO book VALUES (DEFAULT,'java programming',-10000);
-- 오류가 나오는 것을 알 수 있다.


create TABLE courses(
ctype CHAR(10) NOT NULL,
CHECK (ctype IN('a','b','c')))
ENGINE=INNODB DEFAULT CHARSET=UTF8;

INSERT into courses VALUES('d');
-- check을 통해 a b c가 아니면 오류


SHOW CREATE TABLE courses;
CREATE TABLE `courses` (
  `ctype` char(10) NOT NULL,
  CONSTRAINT `CONSTRAINT_1` CHECK (`ctype` in ('a','b','c'))
) ENGINE=InnoDB DEFAULT CHARSET=UTF8
--check이 제약의 일종으로 잡혀있다.

ALTER TABLE courses DROP constraint constraint_1;
-- 제약 지우기
SHOW CREATE TABLE courses;
CREATE TABLE `courses` (
  `ctype` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8
-- 제약이 없어진 것을 몰 수 있다.

ALTER TABLE courses ADD CHECK(ctype IN('a','b','c'))
-- check추가
-- 폴린 키는 drop 치고그냥 삭제 가능 유니크와 이건 constraint이딴 거 붙여주어야 함.