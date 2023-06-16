class AdditionArguNoReturn{
	
	//--------arguament with no return type------------
	
public void addition (int number1, int number2){
	int sum = number1+number2;
	System.out.println("addition of tow number="+ sum);
		
	}

public static void main(String[] args){
AdditionArguNoReturn add = new AdditionArguNoReturn();
add.addition (12 ,32);
}
}