ALTER TABLE locations ADD (uid_col RAW(16));

drop table test_student;
SELECT
    *
FROM test_student;

SELECT
    student.stu_name,enrol.enr_grade
FROM student natural join enrol;

SELECT
    subject.sub_name
FROM student natural join subject
where student.stu_name = '¿ÁÇÑºû';

SELECT
    DISTINCT subject.sub_name
FROM student natural join subject
where student.stu_gender = 'F';




