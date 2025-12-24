public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(8, 2));
        System.out.println("Subtraction: " + calc.subtract(8, 2));
        System.out.println("Multiplication: " + calc.multiply(8, 2));
        System.out.println("Division: " + calc.divide(8, 0)); 
    }
}
