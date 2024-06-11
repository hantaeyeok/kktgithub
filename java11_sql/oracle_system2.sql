-- 작성된 데이터베이스 객체 모두 제거
drop sequence bseq;
drop sequence sseq;
drop table member;
drop table book;
drop table sales;
-- 테이블 만들기
-- 회원(member)		
-- 아이디(id)	가변문자(12)	기본키
-- 비밀번호(password)	가변문자(12)	널 값 허용안함
-- 회원명(name)	가변문자(20)	널 값 허용안함
-- 주소(address)	가변문자(100)	
-- 연락처(tel)	가변문자(20)	널 값 허용안함
-- 가입일(reg_date)	날짜	기본값은 오늘날짜
create table member(id varchar(12) primary key,
password varchar(12) not null,
name varchar(20) not null,
address varchar(100),
tel varchar(20) not null,
reg_date timestamp default sysdate);

desc member;

insert into member values('bgh', 'a1234', '배곤희', 
'신사동 912', '010-1111-2222', '2023-09-13');
insert into member values('yjh', 'a3421', '유정환', 
'강일동 128', '02-2222-3333', '2023-09-13');
insert into member values('lmk', 'b1111', '이민규', 
'수유동 1004', '010-3333-4444', '2023-09-14');
insert into member values('lsh', 'c456', '이성하',
'화곡1동 37', '010-4444-5555', '2023-09-15');
insert into member values('lyj', 'z675', '이연정',
'난곡동 67', '02-4444-2222', '2023-09-11');
insert into member values('lyl', 'q789', '이예린',
'능동 13', '010-5555-6666', '2023-09-15');
insert into member values('lws', 'g478', '이원석',
'고척1동 178', '010-6666-7777', '2023-09-13');
insert into member values('ljh', 'd666', '이정희',
'독산1동 75', '010-7777-8888', '2023-09-14');
insert into member values('ljw', 'e964', '이종우',
'상계동 777', '02-5555-2222', '2023-09-05');
insert into member values('jib', 'h369', '장인범',
'쌍문3동 888', '010-8888-9999', '2023-09-16');

select * from member where id like 'l%' and rownum <= 5 order by name desc;

-- 도서(book)		
-- 도서코드(bookid)	숫자(10)	시퀀스적용(bseq), 기본키
-- 도서분류(bookkind)	가변문자(3)	널 값 허용안함
-- 도서제목(booktitle)	가변문자(50)	널 값 허용안함
-- 도서가격(bookprice)	숫자(10)	널 값 허용안함
-- 도서수량(bookcount)	숫자(5)	널 값 허용안함
-- 저자(author)	가변문자(40)	
-- 출판사(pubcom)	가변문자(40)	
-- 출판일(pubdate)	날짜	

create table book(bookid int primary key,
bookkind varchar(6) not null,
booktitle varchar(50) not null,
bookprice int not null,
bookcount int not null,
author varchar(40), pubcom varchar(40),
pubdate timestamp);

create sequence bseq start with 1 increment by 1 nocycle;

desc book;

insert into book values(bseq.nextval, 'IT', 
'이것이 자바다', 30000, 10, '신용권', '한빛미디어',
'2021-08-20');
insert into book values(bseq.nextval, 'IT', 
'자바웹개발워크북', 31500, 19, '구멍가게코딩단', '남가람북스',
'2022-08-04');
insert into book values(bseq.nextval, 'NV', 
'하얼빈', 14400, 15, '김훈', '문학동네', 
'2022-08-03');
insert into book values(bseq.nextval, 'NV', 
'불편한편의점', 12600, 10, '김호연', '나무옆의자', 
'2022-08-10');
insert into book values(bseq.nextval, 'DV', 
'역행자', 15750, 8, '자청', '웅진출판', 
'2022-05-30');
insert into book values(bseq.nextval, 'DV', 
'자소서바이블', 18000, 15, '이형', '엔알디', 
'2022-08-25');
insert into book values(bseq.nextval, 'HC', 
'벌거벗은한국사', 17500, 10, 'tvn', '프런트페이지', 
'2022-08-22');
insert into book values(bseq.nextval, 'HC', 
'난중일기', 14000, 30, '이순신', '스타북스', 
'2022-07-27');
insert into book values(bseq.nextval, 'TC', 
'진짜쓰는실무엑셀', 20000, 10, '전진권', '제이펍', 
'2022-02-15');
insert into book values(bseq.nextval, 'TC', 
'빅데이터인공지능', 25000, 15, '박해선', '한빛미디어', 
'2020-12-21');

select * from book;

select system.bseq.currval from dual;

-- 판매(sales) -> 구매(buy)	
-- 판매코드(sno)	숫자	기본키, 시퀀스 적용(sseq)
-- 도서코드(bno)	숫자	널 값 허용안함
-- 구매자(id)	가변문자(12)	널 값 허용안함
-- 구매수량(amount)	숫자(5)	널 값 허용안함, 기본값 1
-- 구매금액(money)	숫자	
-- 구매일(salesday)	날짜	기본값 오늘날짜

create table sales(sno int primary key,
bno int not null, id varchar(12) not null,
amount int default 1 not null,
money int, salesday timestamp default sysdate);

desc sales;

create sequence sseq start with 1 increment by 1 nocycle;

insert into sales(sno, bno, id, amount, salesday) 
values (sseq.nextval, 1, 'bgh', 1, sysdate);
-- 모든 항목의 값을 적용하되, 구매금액(money)는 
-- 현재 항목의 값(amount)이 입력이 되어 있을 경우만 계산이 가능하므로 
-- 일단 null 처리 해야함.
insert into sales values (sseq.nextval, 1, 
'bgh', 1, null, sysdate);
insert into sales values (sseq.nextval, 2, 
'lmk', 1, null, sysdate);
insert into sales values (sseq.nextval, 1, 
'lsh', 2, null, sysdate);
insert into sales values (sseq.nextval, 9, 
'lyj', 1, null, sysdate);
insert into sales values (sseq.nextval, 2, 
'lyl', 5, null, sysdate);
insert into sales values (sseq.nextval, 2, 
'ljh', 3, null, sysdate);
insert into sales values (sseq.nextval, 3, 
'ljw', 2, null, sysdate);
insert into sales values (sseq.nextval, 5, 
'jib', 4, null, sysdate);
insert into sales values (sseq.nextval, 4, 
'lmk', 8, null, sysdate);
insert into sales values (sseq.nextval, 1, 
'bgh', 3, null, sysdate);
insert into sales values (sseq.nextval, 2, 
'lmk', 4, null, sysdate);
insert into sales values (sseq.nextval, 7, 
'lyl', 1, null, sysdate);
insert into sales values (sseq.nextval, 8, 
'ljw', 2, null, sysdate);
insert into sales values (sseq.nextval, 10, 
'jib', 5, null, sysdate);
insert into sales values (sseq.nextval, 1, 
'lmk', 3, null, sysdate);
insert into sales values (sseq.nextval, 2, 
'jib', 2, null, sysdate);
insert into sales values (sseq.nextval, 2, 
'lyj', 1, null, sysdate);
insert into sales values (sseq.nextval, 1, 
'jib', 3, null, sysdate);

select * from sales;

-- 
select bookprice from book 
where bookid in (select bno from sales);
select a.bookprice from 
book a inner join sales b on a.bookid=b.bno;

-- 연관 검색에 의한 도서별 가격을 검색하여 도서가격*수량
update sales set money=(select bookprice from 
book where bookid=sales.bno)*amount;

select * from sales;  
-- 9번 거래 : 100800, 수량 : 8,
-- 도서가격 : 12600, 도서:4
select bookprice from book where bookid=4;

select system.sseq.currval from dual;

