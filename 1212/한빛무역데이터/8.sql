-- 부모 테이블: 부서
use com2;
CREATE TABLE 부서 (
    부서번호 INT PRIMARY KEY,       -- 기본 키
    부서명 VARCHAR(50) NOT NULL     -- 부서 이름
);

-- 자식 테이블: 사원
CREATE TABLE 사원 (
    사원번호 INT PRIMARY KEY,        -- 기본 키
    이름 VARCHAR(50) NOT NULL,       -- 사원 이름
    부서번호 INT,                    -- 외래키 (부모 테이블 참조)
    FOREIGN KEY (부서번호) REFERENCES 부서(부서번호) ON DELETE CASCADE ON UPDATE CASCADE
);

-- 부모 테이블 데이터 삽입
INSERT INTO 부서 (부서번호, 부서명) VALUES 
(1, '인사'),
(2, '개발'),
(3, '마케팅');

-- 자식 테이블 데이터 삽입
INSERT INTO 사원 (사원번호, 이름, 부서번호) VALUES 
(101, '홍길동', 1),
(102, '김철수', 2),
(103, '박영희', 3),
(104, '이영희', 2),
(105, '최강훈', 1);