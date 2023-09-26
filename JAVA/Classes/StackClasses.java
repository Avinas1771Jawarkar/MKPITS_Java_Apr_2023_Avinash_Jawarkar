import java.util.Scanner;
import java.util.Stack;

public class StackClasses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack stack=new Stack();
        stack.push(100);
        stack.push(299);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        System.out.println("cheack the top value in stack "+stack.peek());   //peek methode
        System.out.println(" remove the last value of stack "+stack.pop());  //pop methode
        System.out.println("cheack its empty or not  "+stack.empty());       // empty methode
        System.out.println( "push methode (Pushes an item onto the top of this stack.) "+stack.push(600));




    }
}
