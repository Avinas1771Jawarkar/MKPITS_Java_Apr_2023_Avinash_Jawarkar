use mySql_database
declare 
delimiter //
create procedure Looop()
begin
 declare num int ;
 
 set num=0;
 loopon:loop
 set num =num+1;
 select num;
 if num>=10 then
 leave loopon;
 end if;
 end loop;
 End
 //
 delimiter ;
 
 call Looop()