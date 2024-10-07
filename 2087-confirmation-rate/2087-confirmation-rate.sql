# Write your MySQL query statement below

select 
    s.user_id ,
    round( sum(if(action = "confirmed" , 1 , 0 )) / count(*) , 2) as confirmation_rate 
from signups s left join confirmations c
ON s.user_id = c.user_id
group by user_id;