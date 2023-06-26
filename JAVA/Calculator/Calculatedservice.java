class Calculatedservice {
    private String operator;

    public void Calculated(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                Addition add = new Addition();
                System.out.println(add.getcalculated(operand1, operand2));
                break;
            case "-":
                Substraction sub = new Substraction();
                System.out.println(sub.getcalculated(operand1, operand2));
                break;
            case "*":
                Multiplication multiple = new Multiplication();
                System.out.println(multiple.getcalculated(operand1, operand2));
                break;
            case "/":
                Division divide = new Division();
                System.out.println(divide.getcalculated(operand1, operand2));
                break;
        }
    }

    public static void main(String[] args) {
        Calculatedservice calculatedservice = new Calculatedservice();

        calculatedservice.Calculated("+", 3.0, 6.4);
        calculatedservice.Calculated("-", 3.0, 6.4);
        calculatedservice.Calculated("*", 3.0, 6.4);
        calculatedservice.Calculated("/", 3.0, 6.4);
    }
}
