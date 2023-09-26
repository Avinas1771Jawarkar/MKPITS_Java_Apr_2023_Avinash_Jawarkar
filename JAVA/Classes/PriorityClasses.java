import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityClasses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PriorityQueue priorityQueue=new PriorityQueue();
         priorityQueue.add(100);
         priorityQueue.add(300);
         priorityQueue.add(200);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.contains(200));
        System.out.println(priorityQueue.offer(400));
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());


    }
}
