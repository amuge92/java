set SERVEROUTput on
Create or replace procedure teset7
is
v_stu_no enrol.stu_no%type;
v_sub_no enrol.sub_no%type;
v_enr_grade enrol.enr_grade%type;
cursor t_curcor is SELECT stu_no,sub_no,enr_grade from enrol where sub_no=101;
--------------커서 선언
begin 
open t_curcor;
       loop
    fetch t_curcor into v_stu_no,v_sub_no,v_enr_grade;
    exit when t_curcor%notfound;
    dbms_output.put_line(v_stu_no);
    end loop;
    CLOSE t_curcor;
end teset7;
/
EXECUTE teset7;

set SERVEROUTput on
create or REPLACE PROCEDURE momlord
is 
v_empno emp.empno%type;
v_ename emp.ename%type;
v_dname dept.dname%type;
cursor t_cursor is SELECT emp.empno,emp.ename,dept.dname from emp natural join dept
where emp.sal >=2000;
begin
   open t_cursor;
   loop 
   fetch t_cursor into v_empno,v_ename,v_dname;
   exit when t_cursor%notfound;
   dbms_output.put_line(v_empno||v_ename||v_dname);
   end loop;
end momlord;
/
EXECUTE momlord();

create table tmp_tbl1
(userid varchar2(10)
CONSTRAINT p_userid_pk PRIMARY key,
workdate date,
bigo char(1));

create or replace trigger tri1
            after update --어떤값이 update될떄.
            on student   --student 테이블에서
            begin
            insert into tmb_tbl1
            values(user, sysdate,'U');
            end tri1;
            /




create or replace procedure test7
is
v_ENROL ENROL%ROWTYPE;
cursor t_cursor is
 select stu_no,sub_no,enr_grade
 from enrol
 where sub_no=101; 
begin
 open t_cursor;

 for
     V_ENROL IN t_cursor LOOP
     EXIT WHEN t_cursor%notfound;
     dbms_output.put_line(v_stu_no||' '||  v_sub_no||' '||v_enr_grade);
 end loop;
 close t_cursor;
end test7;
/

execute test7;

SELECT
    *
FROM ENROL;
CREATE OR REPLACE PROCEDURE ENPL
(V_SUB_NO ENROL.SUB_NO%TYPE,
V_STU_NO ENROL.STU_NO%TYPE,
V_ENR_GRADE ENROL.ENR_GRADE%TYPE)
IS
BEGIN
INSERT INTO ENROL VALUES (V_SUB_NO,V_STU_NO,V_ENR_GRADE);
END ENPL;
/
EXECUTE ENPL(101,20153088,40);

DESC ENROL;

SELECT
    *
FROM ENROL;
SELECT
    *
FROM SUBJECT;


set serveroutput on
CREATE OR REPLACE FUNCTION f_prof_return
(V_SUB_NO IN SUBJECT.SUB_NO%TYPE)
RETURN VARCHAR2
IS
F_PROF VARCHAR2(10);
BEGIN
  SELECT SUB_PROF INTO F_PROF FROM SUBJECT WHERE subject.sub_no = V_SUB_NO;
  RETURN F_PROF;
END f_prof_return;
/


variable x varchar2(10);
execute :x := f_prof_return(999);

--과목번호 없다
execute :x := f_prof_return(107);
--구봉규
PRINT X;
