use mySql_database

declare
delimiter //
create procedure Marks(mark int)
begin

if mark<50 then 
select "Fail";

elseif mark>50 and mark<65 then
select "pass";

else 
select "Distinction";

end if; 
End
// 
delimiter ;


call Marks(90)