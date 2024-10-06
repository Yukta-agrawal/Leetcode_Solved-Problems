# Write your MySQL query statement below

select 
    p1.project_id , 
    round(avg(e.experience_years) , 2) as average_years
from project p1 
inner join employee e
using(employee_id) 
group by p1.project_id
;

