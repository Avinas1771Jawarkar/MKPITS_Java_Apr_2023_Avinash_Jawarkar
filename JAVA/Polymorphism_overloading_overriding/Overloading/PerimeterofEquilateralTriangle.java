class PerimeterofEquilateralTriangle{
	
public int EquilateralTriangle(int side){
return 3*side;
}
public long EquilateralTriangle(long side){
return 3*side;
}

public static void main(String[] args){
PerimeterofEquilateralTriangle Equilateral=new PerimeterofEquilateralTriangle();
 int equilateral =Equilateral.EquilateralTriangle(21);
 System.out.println("Perimeter of Equilateral Triangle=" +equilateral );
 long equilateral1=Equilateral.EquilateralTriangle(320);
 System.out.println("Perimeter of Equilateral Triangle="+equilateral1);
 }
 }