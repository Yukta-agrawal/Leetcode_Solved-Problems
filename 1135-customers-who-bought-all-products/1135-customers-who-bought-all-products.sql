# Write your MySQL query statement below

-- select c.customer_id from customer c
-- inner join product p
-- using (product_key)
-- group by product_key;


select customer_id from customer
group by customer_id
having count(distinct(product_key)) = (select count(distinct(product_key)) from product );