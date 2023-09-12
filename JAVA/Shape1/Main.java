package Shape1;

public class Main {

    public static void main(String[] args) {
        Shape s=(l,b)-> System.out.println("Area of triangle" +(l*b));

        s.calArea(12,21);
    }
}
