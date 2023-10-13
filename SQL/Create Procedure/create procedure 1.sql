use mySql_database
use sakila
show tables
select*from payment
drop procedure sp_getTotalAmoutofCustomer ;
declare
delimiter //
create procedure sp_getTotalAmoutofCustomer(in cust_id int)
begin
select sum(amount) as "total amount" from payment where  customer_id = cust_id;
end
// delimiter ;

call sp_getTotalAmoutofCustomer(2);
