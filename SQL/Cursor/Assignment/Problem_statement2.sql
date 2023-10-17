-- Problem Statement 2: Calculate Total Rental Fees for a Customer
-- Create a cursor to calculate the total rental fees paid by a specific customer 
-- in the Sakila database.

use sakila
create table total_amount(
TotalAmount int 
)
show tables
select*from payment
select*from rental

delimiter //
create procedure Total_Rental_Fee( cust_id int)
begin
declare Total int;
declare cursor2 cursor for
select sum(amount) from Payment where customer_id= cust_id ;
open cursor2;
fetch cursor2 into Total;
insert into total_amount value (Total);
close cursor2;
end
// delimiter ;

call Total_Rental_Fee(3)
select*from total_amount
