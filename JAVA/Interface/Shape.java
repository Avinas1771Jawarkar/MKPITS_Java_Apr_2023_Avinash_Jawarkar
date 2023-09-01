package Interface;

public interface Shape {



     void calculatedArea() ;



    default void displayAea(){
        System.out.println("red");

    }
}
