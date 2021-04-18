public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setOperandOne(5);
        calc.setOperation("+");
        calc.setOperandTwo(3);
        calc.performOperation();
        calc.getResults();
        calc.setOperation("-");
        calc.performOperation();
        calc.getResults();
    }
}
