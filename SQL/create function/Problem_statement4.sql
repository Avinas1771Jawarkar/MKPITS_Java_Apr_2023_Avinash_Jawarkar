 -- Calculate BMI (Body Mass Index)
-- Create a user-defined function that takes a person's weight (in kilograms) and height (in meters) as 
-- input and calculates their BMI.
use mysql_database

delimiter //
create function BMI(weight double ,height double)
returns double
deterministic
begin 
declare BMI_formula  double ;
set BMI_formula= weight / sqrt(height);
return  BMI_formula;
end
// delimiter ;
select BMI(63,5.3) as BMI_formula
