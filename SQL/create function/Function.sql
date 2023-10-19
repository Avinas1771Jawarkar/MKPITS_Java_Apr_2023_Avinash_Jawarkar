use sakila
select * from payment

drop function myfun
delimiter //
create function myfun(cust_id int)
returns integer Deterministic 
begin
declare amt int;
select sum(amount) into amt from payment where customer_id= cust_id;
return amt;
end
// delimiter ;

select myfun(3);
