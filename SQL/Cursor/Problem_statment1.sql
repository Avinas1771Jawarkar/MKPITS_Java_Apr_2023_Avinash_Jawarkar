-- Problem Statement 1: Retrieve Customer Names and Addresses
-- Create a cursor to retrieve the names and addresses of all customers from the Sakila database.

use sakila
drop table customer_one
create table customer_One(
name varchar(500),
city varchar(500)
);


drop procedure Retrieve_Customer_Names_Addresses;
delimiter //
create procedure Retrieve_Customer_Names_Addresses()
begin
declare record varchar(500);
declare namee,cityy varchar(500);
declare cursor1 cursor for
select customer.first_name,address.address from customer join address on
customer.address_id=address.address_id;
declare continue handler for not found set record =1;
open cursor1;
label:loop
fetch cursor1 into namee ,cityy ;
insert into customer_one value (namee ,cityy);
if record=1 then 
leave label;
end if;
end loop;
close cursor1;
end
// delimiter ;


call Retrieve_Customer_Names_Addresses
select *from customer_one

