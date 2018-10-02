select * from employees;
select * from departments;
select * from locations;
select * from countries;
select * from regions;
select * from jobs;
select * from job_history;

-- internal function DUAL
select 'hello oracle' from DUAL;
select current_date from dual;
select 2 + 10 * 2 from dual;
SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES;
-- function memperkecil karaketer
select upper('Hello OracLe') from dual;
select lower('Hello oRacle') from dual;

-- SELECT COLUMN ALIAS NAME
desc EMployees;
select * from employees;

select 
  FIRST_NAME as nama_depan, 
  LAST_NAME nama_belakang, 
  EMAIL as "email pegawai"
from employees;

-- concat => menyambung karakter
select 
  upper(first_name), 
  salary,
  salary * 2 as bonus,
  first_name || ' ' || salary as info
from employees;

-- Equal condition ("=")
select * 
from employees where job_id ='IT_PROG';
select * 
from employees where employee_id = '101';
select * 
from employees where upper(first_name) = trim(upper('               steVen     '));
select trim('                   ayo               yo ayo..      ') from dual;
select * from employees where first_name = 'Steven' and employee_id = '100';

-- IN condition (multiple condition)
select * 
from employees where employee_id = '101' OR employee_id = '105';
select * 
from employees where employee_id in ('101','105') ;

-- Like Condition (search character within object field)
select * from locations where STREET_ADDRESS like '%Victoria%';
select * from locations where STREET_ADDRESS like '%e';
select * from locations where STREET_ADDRESS like 'S%';


-- JOIN
--- 1. INNERT JOIN
--- 2. OUTER JOIN
------ A. LEFT OUTER JOIN -> left join
------ B. RIGHT OUTER JOIN -> righ join
----3. SELF JOIN

-- INNER JOIN
select 
  emp.EMPLOYEE_ID, --pk
  emp.first_name,
  emp.email,
  emp.department_id, --
  dept.DEPARTMENT_NAME,
  loc.STATE_PROVINCE,
  loc.STREET_ADDRESS,
  job.JOB_TITLE,
  job.MIN_SALARY
from employees emp -- left (fk) (107 rows)
inner join departments dept -- right (pk) (27 rows) -- left 4 locations -> location_id
on emp.DEPARTMENT_ID = dept.DEPARTMENT_ID
inner join locations loc -- right
on dept.LOCATION_ID = loc.LOCATION_ID
inner join jobs job
on emp.JOB_ID = job.JOB_ID

select * from employees;
select * from departments;

-- left outer
select * 
from employees emp
left outer join departments dept
on emp.DEPARTMENT_ID = dept.DEPARTMENT_ID

-- rigth outer
select * 
from employees emp
right outer join departments dept
on emp.DEPARTMENT_ID = dept.DEPARTMENT_ID

select * from employees, departments;

--- FUNCTION GROUP
/*
  1. max -- mendapatkan nilai terbesar dari list data
  2. min -- mendapatkan nilain terkecil dari list data
  3. avg -- mendapatkan nilai rata rata dari list data
  4. sum -- mendapatkan jumlah total dari list data
  5. count -- mendapatkan jumlah baris dari list data
*/

select * from employees;
select 
  job_id,
  max(salary), 
  min(salary),
  round(avg(salary),2),
  count(*),
  sum(salary)
from employees
group by job_id

select 
  dept.department_name,
  max(salary) as max, 
  min(salary),
  round(avg(salary),2),
  count(*) as jml,
  sum(salary)
from employees emp
join departments dept
on emp.department_id = dept.department_id
--where dept.department_name = 'Administration'
group by dept.department_name
having count(*) < 5
order by max asc;

-- distinct -> untuk mendapatkan record yang uniq
select distinct(job_id) from employees;

select * from employees where job_id = 'IT_PROG'

select * from employees;

select *from employees where salary = 24000;
select * from departments where department_id = 90;
select * from jobs where job_id = 'AD_PRES';


-- VIEW
create or replace view myCalculation
as
select 
  dept.department_name as deptname,
  max(salary) as terbesar, 
  min(salary) as terkecil,
  round(avg(salary),2) as rata2,
  count(*) as jml,
  sum(salary) as total
from employees emp
join departments dept
on emp.department_id = dept.department_id
--where dept.department_name = 'Administration'
group by dept.department_name
having count(*) < 5
order by terbesar asc

select * from myCalculation;

--- SELF JOIN
select 
  emp.FIRST_NAME,
  emp.email,
  mng.first_name as "manager"
from employees emp
join employees mng
on emp.manager_id = mng.employee_id