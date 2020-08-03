variable d_score char;
execute :d_score := test6(95);
print d_score;


SELECT
    *
FROM emp;

create or replace PROCEDURE gogo(
p_empno in emp.empno%type,
p_ename in emp.ename%type,
p_job in emp.job%type,
p_mgr in emp.mgr%type,
p_sal in emp.sal%type,
p_deptno in emp.deptno%type)
is 
begin
 insert into emp VALUES(
p_empno,
p_ename,
p_job,
p_mgr,'',
p_sal,'',
p_deptno);
end gogo;
/
SELECT
    *
FROM emp;


execute  gogo(1234,'LEE','SALESMAN','1234',3000,30);

create or REPLACE PROCEDURE gogogo(
p_empno in emp.empno%type,
p_deptno in emp.deptno%type
)
is
begin
update emp set emp.deptno = p_deptno where emp.empno = p_empno;
end gogogo;
/
SELECT
    *
FROM emp;
execute gogogo(7839,11);








