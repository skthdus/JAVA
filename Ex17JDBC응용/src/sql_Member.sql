/* 
 * table명 : memberInfo
 * 문자varchar2(크기 30) id
 * 문자(크기 30) pw,
 * 문자(크기 30) nick,
 * 숫자(20) age
 * 
 * 를 구성하는 테이블 생성!
 */

create table memberInfo(
	id varchar2(30), 
 	pw varchar2(30),
 	nick varchar2(30),
 	age number(20)
);

insert into memberInfo values('test1', '123', 'test1', 20);
insert into memberInfo values('test2', '123', 'test2', 25);
insert into memberInfo values('test3', '123', 'test3', 22);
insert into memberInfo values('test4', '123', 'test4', 26);


 select id, nick from memberInfo

 
 select * from memberInfo;
 

 