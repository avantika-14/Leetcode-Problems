# Write your MySQL query statement below
select product_id,
new_price as price
from Products 
where date <= '2019-08-16'