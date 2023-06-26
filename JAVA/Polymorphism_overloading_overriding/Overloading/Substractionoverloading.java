class Substractionoverloading{
public float Substraction(float number1 ,float number2){
return number1-number2;
}
public float Substraction(float number1 ,float number2 ,float number3){
return number1-number1-number2-number3;
}
public static void main(String[] args){
Substractionoverloading substraction=new Substractionoverloading();
float SUBSTRACTION=substraction.Substraction(5.1f,4.2f,19.0f);
System.out.println(" Substraction of 2number ="+ SUBSTRACTION);
float SUBSTRACTION1= substraction.Substraction(19.1f,20.4f,39.0f);
System.out.println(" Substraction of tow number ="+ SUBSTRACTION1);
}
}