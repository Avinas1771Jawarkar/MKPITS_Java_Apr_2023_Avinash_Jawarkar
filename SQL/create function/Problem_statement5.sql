--  Generate a Unique Customer ID
-- Design a user-defined function that generates a unique customer ID based on a predefined pattern and 
-- the customer's personal details.
use mysql_database

drop  function Generates_unique_ID
delimiter //
create function Generates_unique_ID(name varchar(25), last_name varchar(25), mobile varchar(20) , udia varchar(20))
returns varchar(35)
deterministic
begin
declare Generates_unique_customer_ID varchar(35) ;
 set Generates_unique_customer_ID = concat(left(name,3),right(last_name,2),right(mobile,4),left(udia,9));
 return Generates_unique_customer_ID;
 end
 // delimiter ;
 drop function Generates_unique_ID
 
 select Generates_unique_ID("avinash","jawarkar","7410547322","400508232524") as Generates_unique_customer_ID

