package car;

public class BMW extends Car {
    @Override
   public int mileage(int TotalDistanceTravelled,int TotalFuelConsumed){
      int Mileage = TotalDistanceTravelled / TotalFuelConsumed;
       System.out.println("the mileage is "+ Mileage);
       return 0;
    }


}
