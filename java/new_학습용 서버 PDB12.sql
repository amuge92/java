create table t_student
(stu_no char(9),
stu_name varchar2(12)
CONSTRAINT u_stu_name UNIQUE,
stu_dept varchar2(20)
CONSTRAINT n_stu_dept not null,
stu_grade number(1),
stu_class char(1),
stu_gender char(1),
stu_height number(5,2),
stu_weight number(5,2),
CONSTRAINT pt_stu_no primary key(stu_no));

DROP TABLE t_student;
desc t_student;

create table t_enrol(
sub_no char(3),
stu_no char(9),
enr_grade number(3),
CONSTRAINT btenrol primary key(sub_no,stu_no));
desc t_enrol;

SELECT
    stu_dept
FROM student;

SELECT
    *
FROM emp natural join dept;

SELECT
    emp.empno,emp.ename,dept.dname
FROM emp,dept
where emp.deptno = dept.deptno;

SELECT
    emp.empno,emp.ename,dept.dname
FROM emp natural join dept;

SELECT
        emp.empno,emp.ename,dept.dname
FROM emp join dept using(deptno);

SELECT
 emp.ename   
FROM emp, dept
where emp.deptno = dept.deptno 
 and dept.loc = 'NEW YORK';

