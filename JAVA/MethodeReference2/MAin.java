package MethodeReference2;

public class MAin {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        MyInterface myInterface=myClass::dispaly;
         myClass.dispaly();
    }
}
