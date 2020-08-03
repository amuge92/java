UPDATE enrol set sub_grade = sub_grade-5 where sub_no = 104;

SELECT
    *
FROM enrol;

create table emp1 as SELECT
    *
FROM emp where deptno in(20,30);

create table dept1 as SELECT
    *
FROM dept;

create table salgrade1 as SELECT
    *
FROM salgrade;

desc emp1;
desc dept1;
desc salgrade1;

insert into emp1 VALUES
(7401,'HOMER','','',sysdate,1300,'',10);

insert into emp1 VALUES
(7323,'BRANDA','','',sysdate,(select sal from emp where empno=7499),'',30);

insert into emp1 select * from emp where 
Deptno = 10;
update emp1 set job = 'ANALYST' where empno = 7369;
update emp1 set sal=sal*0.9 where deptno = 20;
update emp1 set sal = sal+100;
update emp1 set sal = sal-10 
where deptno = (select deptno from dept1 where loc = 'DALLAS');
DELETE FROM emp1 WHERE empno = 7499;
insert into dept1 values(50,'PLANNIG','MIAMI');
update dept1 set deptno = 60 where deptno = 40;
update emp1 set deptno = 99 where deptno not in (select deptno from dept1);
update emp1 set deptno = 30 where ename in('JONES','JOSH','CLARK');
update emp1 set comm = 0 where comm is null;
drop table emp1;



create table t_enrol (
sub_no char(3),
stu_no number(9),
enr_grade number(3),
CONSTRAINT fenkey foreign key(sub_no) references subject(sub_no),
CONSTRAINT tenkey PRIMARY key(sub_no,stu_no)
);
SELECT
    *
FROM t_enrol;
drop table t_enrol;

commit;
--제약 조건의 확인
SELECT * from user_constraints where table_name = 'T_ENROL';

create table t_tbl(
t_empno number(4) not null,
t_name varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_dept number(2),
CONSTRAINT t_tbl_pk primary key(t_empno));

desc t_tbl;

insert into t_tbl values(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
insert into t_tbl values(7788,'SCOTT','ANALYST',7566,to_date('13-07-1987','dd-mm-yyyy'),3000,NULL,20);
insert into t_tbl values(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
insert into t_tbl values(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
insert into t_tbl values(7876,'ADAMS','CLERK',7788,to_date('13-07-1987','dd-mm-yyyy'),1100,NULL,20);

SELECT
    *
FROM t_tbl;
desc t_tbl;

alter table t_tbl
add(t_gender char(1));

alter table t_tbl
modify (t_gender varchar2(10));

alter table t_tbl
drop (t_gender);

create table t_emp10(
t_empno number(4) not null,
t_name varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_dept number(2),
CONSTRAINT t_emp10_pk primary key(t_empno));
insert into t_emp10 values(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
insert into t_emp10 values(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
insert into t_emp10 values(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);

SELECT
    *
FROM t_emp10;

truncate TABLE t_tbl;
SELECT
    *
FROM t_tbl;

create table t_emp3(
t_empno number(4) not null,
t_name varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2) not null,
t_comm number(7,2),
t_dept number(2),
CONSTRAINT t_emp3_pk primary key(t_empno));


create table t_emp2(
t_empno number(4) not null,
t_name varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_dept number(2)
constraint t_emp2_fk references dept(deptno),
constraint t_emp2_pk primary key (t_empno))
;
SELECT
    *
FROM user_constraints where table_name = 'T_TBL';


alter table t_emp2
DISABLE constraint t_emp2_fk;


alter table t_emp2
enABLE constraint t_emp2_fk;

alter table t_emp2
drop CONSTRAINT t_emp2_fk;

drop table t_emp2;

create view v_emp20 as SELECT * from emp where deptno=20;

SELECT
    *
FROM v_emp20;

create view v_emp_dept as SELECT dname from emp natural join dept;
rollback;
SELECT
    *
FROM v_emp_dept;

SELECT
    empno,ename,hiredate
FROM (SELECT
    *
FROM emp order by hiredate desc)
where rownum<=5 and hiredate is not null;

SELECT
    dname
FROM (SELECT
    dname,avg(sal)
FROM emp,dept where emp.deptno = dept.deptno 
group by dname order by avg(sal) desc)
where rownum <=2;


SELECT
    dname,avg(sal)
FROM emp,dept where emp.deptno = dept.deptno 
group by dname order by avg(sal) desc
;

create or replace PROCEDURE 프로시져명(
변수 in student.stu_no%type)
is 
begin 
        SQL
end 프로시저명;
/

create sequence text4
increment by 1
start with 201
maxvalue 9999;

create procedure test5(
v_sub_name in subject.sub_name%type,
v_sub_prof in subject.sub_prof%type,
v_sub_grade in subject.sub_grade%type,
v_sub_dept in subject.sub_dept%type)
is
begin
   insert into subject values(text4.nextval,
                    v_sub_nam,
                    v_sub_prof,
                    v_sub_grade,
                    v_sub_dept);
                    commit;
             end test5;
/

select * from subject;
execute test5('앱프로그래밍','홍길동',3,'컴퓨터정보');



sel
