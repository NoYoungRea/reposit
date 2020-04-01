CREATE TABLE board(
num INT UNSIGNED NOT NULL,
renum INT UNSIGNED NOT NULL DEFAULT 0,
regdate DATETIME NOT NULL DEFAULT NOW(),
writer VARCHAR(50) NOT NULL,
passwaord VARCHAR(20) NOT NULL,
title VARCHAR(200) NOT NULL,
content MEDIUMTEXT NOT NULL)
ENGINE=INNODB DEFAULT CHARSET=UTF8;
-- //////////////////////////////////////

ALTER TABLE board ADD PRIMARY KEY(num,renum);
-- 데이터가 저장되어 있다면 프라이머리를 후에 바꾸기 힘들 수도 있다.
ALTER TABLE board CHANGE renum rnum INT UNSIGNED NOT NULL DEFAULT 0;
-- 속성 이름 변경
-- //////////////////////////////////
CREATE TABLE parts(
p_code CHAR(2) NOT NULL PRIMARY KEY,
p_name VARCHAR(100) NOT NULL)
ENGINE=INNODB DEFAULT CHARSET=UTF8;
-- ////////////////////////////////
ALTER TABLE board ADD p_code CHAR(2) NOT NULL AFTER rnum;
ALTER TABLE board ADD FOREIGN KEY (p_code) REFERENCES parts(p_code);
-- 폴린 키 boaard에 추가
ALTER TABLE board DROP PRIMARY KEY;
ALTER TABLE board ADD PRIMARY KEY(num,rnum,p_code);
-- 프라이머리 키 다시 지정
INSERT INTO parts VALUES('pr', 'programing');
INSERT INTO parts VALUES('wb', 'web');
-- 데이터 추가
ALTER TABLE board DROP regdate;
ALTER TABLE board DROP writer;
ALTER TABLE board DROP passwaord;
ALTER TABLE board DROP title;
ALTER TABLE board DROP content;
-- 속성 제거
INSERT INTO board VALUES (1,0,'pr');
INSERT INTO board VALUES (1,0,'wb');
INSERT INTO board VALUES (2,0,'wb');
INSERT INTO board VALUES (1,1,'wb');
INSERT INTO board VALUES (2,0,'pr');
INSERT INTO board VALUES (2,1,'pr');
INSERT INTO board VALUES (2,2,'pr');
INSERT INTO board VALUES(1,1,'pr');
-- 객체 생성
SELECT num,rnum,p_code
FROM board
-- WHERE p_code='pr' OR p_code LIKE 'wb'
-- where p_code in('pr','wb')
-- where p_code = 'pr' && rnum<=1
where p_code = 'pr' && rnum in(0,1)
ORDER BY num DESC, rnum ASC
-- num 기준으로 정렬을하고 그다음 rum기준으로 정렬
DESC board;
desc parts;
