# Write your MySQL query statement below

select u.name , IFNULL(sum(r.distance), 0) as travelled_distance 
from users u 
LEFT JOIN rides r
ON u.id = r.user_id
group by u.id
order by travelled_distance desc , name ;