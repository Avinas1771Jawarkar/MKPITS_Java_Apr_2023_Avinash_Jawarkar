package AutoBoxing_Boxing;

public class Boxing {

    public static void main(String[] args) {
        int a = 5;

        Integer b = new Integer(a);

        System.out.println(b);

        int c = 6;
        Integer d = new Integer(c);
        System.out.println(d); //boxing  decperated
    }
}
