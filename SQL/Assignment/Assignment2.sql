-- 2. Retrieve the number of distinct films in the inventory
use sakila
show tables
select * from inventory
select distinct (film_id) from inventory
