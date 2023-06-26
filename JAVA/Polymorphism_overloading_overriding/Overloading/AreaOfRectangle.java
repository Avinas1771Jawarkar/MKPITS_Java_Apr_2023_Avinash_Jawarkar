class AreaOfRectangle{

public int Rectangle(int length ,int breadth){
return length*breadth;
}
public double Rectangle(double length ,double breadth){
return length*breadth;
}
public static void main(String[] agrs){
 AreaOfRectangle areaofrectangle=new AreaOfRectangle();

int AREAOFRECTANGLE=areaofrectangle.Rectangle(12,17);
System.out.println("Area of Reactangle=" +AREAOFRECTANGLE);

double AREAOFRECTANGLE1= areaofrectangle.Rectangle(12.0 ,18.0);
System.out.println("Area of Reactangle=" +AREAOFRECTANGLE1);  
}
}