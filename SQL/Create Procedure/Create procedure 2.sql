delimiter //
create procedure sp_gettotalAmountOfcustomer(in cust_id int, out tot_amt int)
begin
select sum(amount) into tot_amt from payment where customer_id= cust_id;
end 
 // delimiter ;
 
 call sp_gettotalAmountOfcustomer(3, @tot_amt);
 select @tot_amt;