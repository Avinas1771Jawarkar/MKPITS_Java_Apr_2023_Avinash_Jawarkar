 -- (45) List the rental date and return date for all rentals made by
-- customer "Jennifer Lee".
use sakila
show tables
    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
 select rental_date,return_date from rental join inventory on
rental.inventory_id=inventory.inventory_id join customer
on customer.customer_id=rental.customer_id where first_name='Jennifer' and
last_name='Lee'