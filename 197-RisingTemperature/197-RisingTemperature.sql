-- Last updated: 10/3/2025, 2:14:13 PM
# Write your MySQL query statement below
select w1.id from Weather w1 join Weather w2
on datediff(w1.recordDate,w2.recordDate) = 1
where w1.temperature>w2.temperature;