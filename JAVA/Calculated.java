class Calculated{
public int substraction (int number1, int number2){
return number1 - number2;
}
public static void main(String[] args){
Calculated cal =new Calculated();
int substract =cal.substraction(15,12);
System.out.println("substraction of 2 no.=" + substract);
}
}