create or REPLACE function prop
   RETURN emp.ename%type
is
     vename emp.ename%type;
begin 
      select ename 
      into vename from emp where sal = (select max(sal) from emp);
      return vename;
end prop;
/
SELECT DISTINCT prop() from emp;
create or REPLACE function mola
  (v_dept student.stu_dept%type)
  return number
  is
  v_studev number;
  begin
      SELECT STDDEV(enrol.enr_grade)
      into v_studev from enrol natural join student where stu_dept = v_dept;
      return v_studev;
end mola;
/
SELECT * from student natural join enrol;
SELECT DISTINCT mola('±‚∞Ë') from student;

create or REPLACE PROCEDURE mola2
(v_empno emp.empno%type,
v_job emp.job%type
)
is
begin
UPDATE emp set emp.job = v_job where emp.empno = v_empno;
end mola2;
/
SELECT
    *
FROM emp;
EXECUTE mola2(7839,'∑Á∆Œ');
set serveroutput on
create or replace PROCEDURE test10
(v_stu_no in student.stu_no%type)
is
v_stu_name student.stu_name%type;
begin
  select stu_name into v_stu_name from student where stu_no=v_stu_no;
  DBMS_OUTPUT.PUT_line(v_stu_name);
EXCEPTION 
   when no_data_found then
DBMS_OUTPUT.PUT_line('No Data');

end test10;
/

Create or replace procedure teset7
is
v_stu_no emp.stu_no%type;
begin 







