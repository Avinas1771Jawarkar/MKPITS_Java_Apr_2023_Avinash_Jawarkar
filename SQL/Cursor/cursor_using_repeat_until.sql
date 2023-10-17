use mysql_database
create table cityname(
name varchar(20),
city varchar(20)
);


drop procedure mycursor
select *from Student_detail


delimiter //
create procedure mycursor()
begin
declare record varchar(50);
declare namee,cityy varchar(20);
declare my_cursor cursor for
select Student_name,Address from Student_detail;
declare continue handler for not found set record=1;
open my_cursor;
repeat
fetch my_cursor into namee,cityy;
insert into  cityname value(namee,cityy);
until(record>1)
end repeat;
close my_cursor;
end
// delimiter ;


call mycursor()
select *from cityname 