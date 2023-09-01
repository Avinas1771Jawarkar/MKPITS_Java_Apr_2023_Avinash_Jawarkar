package Intcal;

import Loan.Loan;

public final class InterestCalculation {
    private int rateofinterest;
    public int amount;
    public int time;

    public  InterestCalculation(){
        rateofinterest=0 ;
    }


    public final void calculateInterest( double amount , int time){

        double SI=amount*time;
        System.out.println("The loan is "+SI);


    }

    public static void main(String[] args) {


        InterestCalculation interestCalculation = new InterestCalculation();

//         Loan myLoan = new Loan("343536",9888,6);//with constructor
        Loan loan=new Loan();
        loan.setAccount_no("9623103714");
        loan.setAmount(70000);
        loan.setDuration(6);

        interestCalculation.calculateInterest(loan.getAmount(),loan.getDuration());


    }

}
