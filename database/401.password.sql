CREATE TABLE members(
id VARCHAR(50) NOT NULL PRIMARY KEY,
nick VARCHAR(50) NOT NULL,
pass VARCHAR(100) NOT NULL)
ENGINE=INNODB DEFAULT CHARSET=UTF8;

--비밀번호 숨기기(관리자에게도)
INSERT INTO members VALUES('gildong@naver.com', '도적 홍',PASSWORD('1234'));

-- 비밀번호에 해당하는 데이터 찾기
WHERE pass LIKE PASSWORD('1234');
/*아이디 쉽게 변경 가능*/
UPDATE members SET id = 'hong@google.co.kr' WHERE id = 'gildong@naver.com';
-- /////////////////해결//////////////
ALTER TABLE members DROP pass;  /*비밀번호를 없애고 다른테이블로 옮기기*/
CREATE TABLE passwords (
id VARCHAR(50) NOT NULL PRIMARY KEY,
pass VARCHAR(100) NOT NULL,
FOREIGN KEY(id) REFERENCES members(id))
ENGINE=INNODB DEFAULT CHARSET=UTF8;
/*비밀번호를 분리하자*/

-- 삽입
INSERT INTO passwords VALUES('hong@google.co.kr', PASSWORD('1234'));
-- /////////데이터 함부로 삭제 및 변경 불가능//////////////
DELETE FROM members WHERE nick LIKE '도적 홍'; /*실행안됨.*/
UPDATE members SET id = 'gildong@naver.com'
WHERE id = 'hong@google.co.kr';/*실행안됌.*/

-- //관리자 쪽에서 회원 탈퇴를 했다고 해서 데이터를 삭제하는 것이 아니라 비공으로 돌려놓는 것이 좋다.
ALTER TABLE members ADD regdate DATETIME NOT null DEFAULT NOW();
ALTER TABLE members ADD remove_at DATETIME NULL;

UPDATE members SET remove_at=NOW() WHERE nick='도적 홍'


