class AreaOfSquare{
	public int Square(int side){
		return side*side;
		}

     public long Square(long side){
		 return side *side;
		 }
 public static void main(String[] args){
 AreaOfSquare areaofsquare =new AreaOfSquare();
 
 int AREAOFSQAURE=areaofsquare.Square(5);
 System.out.println("Area of Square="+AREAOFSQAURE );
  
  long AREAOFSQUARE1 =areaofsquare.Square(500);
 System.out.println("Area of square="+ AREAOFSQUARE1);
 
 
 }		 
	  
 }