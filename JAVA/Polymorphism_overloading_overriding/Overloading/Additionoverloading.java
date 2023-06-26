class Additionoverloading{
 
 public int Addition (int number1 ,int number2){
 return number1+number2;
}
public int Addition(int number1 ,int number2 ,int number3){
return number1+number2+number3;
}
public static void main(String[] args){
Additionoverloading addition=new Additionoverloading();
 int ADDITION=addition.Addition(3,6);
 System.out.println("addition of 2number ="+ADDITION);
 int ADDITION1=addition.Addition(100,356,550);
 System.out.println("Addition of 2 number ="+ ADDITION1);
}

 }