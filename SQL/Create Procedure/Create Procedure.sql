use sakila

show tables
select *from city
select *from customer
select *from Address

 drop procedure Cityname
delimiter //
create procedure Cityname( citynumber varchar(20))
begin 
select customer.first_name,customer.last_name,city.city,city.city_id from customer 
join address
on customer.address_id=address.address_id 
join city 
on city.city_id=address.city_id where city=citynumber ;
end
// delimiter ;
call  Cityname('kabul');