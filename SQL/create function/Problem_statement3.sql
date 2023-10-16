-- String Reversal
-- Design a user-defined function that takes a string as input and returns the reversed string.


delimiter //
create function  reverse_string(stringg varchar(25))
returns varchar(25)
deterministic
begin 
declare string_name varchar(25);
set string_name =reverse(stringg);
return string_name;
end
// delimiter ;

select reverse_string('Avinash') as string_name ;





drop  FUNCTION reverse_string
use mysql_database
DELIMITER //

CREATE FUNCTION reverse_string(string VARCHAR(255))
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
  DECLARE reversed_string VARCHAR(255);
  SET reversed_string = REVERSE(string);
  RETURN reversed_string;
END 
// DELIMITER ;
select reverse_string('Avinash') as reversed_string ;
