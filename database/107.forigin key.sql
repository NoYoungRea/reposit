CREATE TABLE mobil (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
typename VARCHAR(20) NOT NULL,
memger_id INT UNSIGNED NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8
-- 되도록 참조할 키와 같은 값을 사용하는 것이 좋다.
ALTER TABLE mobil ADD FOREIGN KEY(memger_id)
REFERENCES members(id)

INSERT INTO mobil(typename,memger_id) VALUES('그렌저',3);
INSERT INTO mobil VALUES(DEFAULT, 'bmw',7);
INSERT INTO mobil VALUES(DEFAULT, 'bmd',3);
-- 소유주가 없는 차량은 못온다. 부모에 1,3,4만 있음 그러므로 7은 안됨 member의 id의 값 중 하나가 와야 함
-- 소유주 한명에 여러 차량이 올 수 있다.
-- 부모에서는 삭제할때 자식에서는 추가할때 서로간의 관계를 고려해야 한다.
DELETE FROM mobil
-- 싹다 지우는 거
DELETE FROM mobil WHERE id=1;
DELETE FROM mobil where memger_id=3;
-- 자식에서 삭제 ok!!
DELETE FROM members WHERE id=3;
--부모에서 지우는 것은 고려해야 할 것이 많음 현재 3은 자식이 참조하고 있고 부모에서 지우게 되면 소유주 없는 차량이 되기때문에 삭제가 안 됨.
SELECT *FROM members;
SELECT *FROM mobil;
