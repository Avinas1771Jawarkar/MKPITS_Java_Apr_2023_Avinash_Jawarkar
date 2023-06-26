class DivisionOverloading{
public double Division(double number1 ,double number2){
return number1/number2;
}
public double Division (double number1,double number2 ,double number3){
return number1 /number2/number3;
}
public static void main(String[] agrs){
DivisionOverloading division =new DivisionOverloading();
 double  DIVISION = division.Division(12,36);
 System.out.println("division of tow number=" + DIVISION);
 double DIVISION1 =division.Division(6,18,26);
 System.out.println("Division of tow number="+DIVISION1);
}
}