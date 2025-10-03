-- Last updated: 10/3/2025, 2:14:17 PM
# Write your MySQL query statement below
select max(salary) as SecondHighestSalary 
from Employee
where salary<(
    select max(salary)
    from Employee
     )