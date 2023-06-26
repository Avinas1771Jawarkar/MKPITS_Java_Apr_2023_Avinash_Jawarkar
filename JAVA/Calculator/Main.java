public class Main {
    public static void main(String[] args) {
        CalculateService calculateService=new CalculateService();
        calculateService.calculate("+",3.0,6.4);
        calculateService.calculate("-",3.0,6.4);
        calculateService.calculate("*",3.0,6.4);
        calculateService.calculate("/",3.0,6.4);
    }
}