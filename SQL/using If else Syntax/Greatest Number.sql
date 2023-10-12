use  mySql_database
declare
delimiter //
create Procedure GreatestNumber(a int, b int , c int)
begin

if a>b and a>c then
select "greatest number is a"+a;
elseif b>a and b>c then
select "greatest number is b"+b;
else
select "grreatest number is c"+c;
end if;

end
//
delimiter ;

call GreatestNumber(12,43,23)
 
