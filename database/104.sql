ALTER TABLE customers MODIFY c_phone VARCHAR(40) NOT NULL;
-- 속성의 형식변경
ALTER TABLE customers MODIFY c_phone VARCHAR(40) NULL;
--null 허용
ALTER TABLE customers CHANGE c_phone c_tel VARCHAR(50) NOT NULL;
-- 이름 변경 및 형식 변경 왠지 널도 가능할듯
ALTER TABLE customers MODIFY c_tel INT NULL;
-- 무조건 허용되는 것이 아님(캐릭터를 정수로 x)
ALTER TABLE customers MODIFY c_tel VARCHAR(5) NULL;
-- 기존의 데이터를 망치는 형도 안됨 기존의 데이터를 다 5개 아래로 해 놓으면 가능
DESC customers;

