package Methodreference;

public class MAin {
    public static void main(String[] args) {

// Giving reference of static methode to functional Interface
        MyInterface myInterface= MyClass::dispaly;
        Runnable runnable= MyClass::dispaly;
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
