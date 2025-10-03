-- Last updated: 10/3/2025, 2:12:20 PM
# Write your MySQL query statement below
select EmployeeUNI.unique_id, Employees.name from Employees left join EmployeeUNI on EmployeeUNI.id=Employees.id;