class  PerimeterofCircle{
private float pi =3.14f;
public float circumference (float radius){
return 2*pi*radius;
}
public double circumference (double radius){
return 2*pi*radius;
}
public static void main(String[] args){
PerimeterofCircle Circumference=new PerimeterofCircle();
float CIRCUMFERENCE =Circumference.circumference(3.2f);
System.out.println("Perimeter of Circle="+ CIRCUMFERENCE);
double CIRCUMFERENCE1 = Circumference.circumference(23.00);
System.out.println("Perimetero f Circle="+CIRCUMFERENCE1 );
}
}