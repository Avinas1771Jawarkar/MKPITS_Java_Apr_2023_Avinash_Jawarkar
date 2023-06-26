class AreaOfTriangle{
public int Triangle(int base ,int height){
return base*height/2;
}
public double Triangle(double base ,double height){
return base*height/2;
}
public static void main(String[] args){
AreaOfTriangle areaoftriangle =new AreaOfTriangle();

int AREAOFTRIANGLE= areaoftriangle.Triangle(9 ,8);
System.out.println("Area of Triangle=" + AREAOFTRIANGLE);

double AREAOFTRIANGLE1 =areaoftriangle.Triangle(12.0 ,10.0);
System.out.println("Area of Triangle=" + AREAOFTRIANGLE1);
}
}