class PerimeterOfTrapezium{
public int Trapezium (int base1 ,int base2 ,int side1 , int side2){
 return base1+base2+side1+side2;
}
public long Trapezium (long base1,long base2 ,long side1,long side2){
return base1+base2+side1+side2;
}
public static void main(String[] args){
PerimeterOfTrapezium trapezium =new PerimeterOfTrapezium();
 int TRAPEZIUM = trapezium.Trapezium(12,21,34,41);
 System.out.println("peirmeter of Trapezium="+ TRAPEZIUM );
 long TRAPEIZIUM1= trapezium.Trapezium(120,411,321,234);
 System.out.println("PerimeterOfTrapezium="+ TRAPEIZIUM1);
}

}