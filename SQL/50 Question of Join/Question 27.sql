 -- (27) Get the names of customers who have rented the film titled "Murder Antitrust".
 use sakila
 show tables
    select* from customer
	select* from rental 
    select* from inventory
    select* from film
    
	select first_name,last_name from customer join rental
    on rental.customer_id=customer.customer_id join inventory
    on inventory.inventory_id=rental.inventory_id join film 