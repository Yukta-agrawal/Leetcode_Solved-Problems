-- # Write your MySQL query statement below

--  day , cancellation_rate

--  select count(*) where status =  " cancelled_by_driver" OR status =  " cancelled_by_client" AND banned = "No"
-- / select count(*) from trips


-- where request_at between "2013-10-01" and "2013-10-03"


select 
    request_at as Day,
    ROUND(
        SUM(status != 'completed') / count(*) , 2
    ) AS 'Cancellation Rate'

from 
    trips 
    Left join users as clients ON trips.client_id = Clients.users_id
    Left join Users as Drivers on trips.driver_id = Drivers.users_id
where 
    Clients.banned = 'No'
AND drivers.banned = 'No'
AND request_at between "2013-10-01" and "2013-10-03"

GROUP BY day;
