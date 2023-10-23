Use mysql_database

drop procedure PrintEven;

DELIMITER //
CREATE PROCEDURE PrintEven(num int)
BEGIN
if(num % 2 = 0) then
select "even number",num;
else 
select "odd number",num;
end if;
END
//
DELIMITER ;


call PrintEven(9)