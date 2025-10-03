-- Last updated: 10/3/2025, 2:14:20 PM
# Write your MySQL query statement below
select p.firstName,p.lastName,a.city,a.state 
from Person p
left join Address a 
on p.personId=a.personId;
