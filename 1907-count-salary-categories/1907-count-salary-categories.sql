# Write your MySQL query statement below
select "Low Salary" as Category,
       sum(if(income < 20000, 1, 0)) as accounts_count
from Accounts
union
select "Average Salary" as Category,
       sum(if(income between 20000 and 50000, 1, 0)) as accounts_count
from Accounts
union
select "High Salary" as Category,
       sum(if(income > 50000, 1, 0)) as accounts_count
from Accounts;
