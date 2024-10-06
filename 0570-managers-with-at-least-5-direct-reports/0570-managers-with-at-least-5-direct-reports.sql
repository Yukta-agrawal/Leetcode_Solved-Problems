# Write your MySQL query statement below


-- select name from Employee where id in (
--     select managerId
--     from Employee
--     group by managerId
--     having count(managerId) >= 5
-- ) ;

select e1.name from employee e1 
inner join employee e2 On e1.id = e2.managerId 
group by e2.managerId
having count(e2.managerId) >= 5;
