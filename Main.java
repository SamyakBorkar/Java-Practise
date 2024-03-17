class Calculator {
    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Constructor Overloading
    Calculator() {
        System.out.println("Default constructor called.");
    }

    Calculator(int a, int b) {
        System.out.println("Parameterized constructor called with int values: " + a + " and " + b);
    }

    Calculator(double a, double b) {
        System.out.println("Parameterized constructor called with double values: " + a + " and " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Calls default constructor
        Calculator calculatorInt = new Calculator(5, 10); // Calls parameterized constructor with int values
        Calculator calculatorDouble = new Calculator(3.5, 2.5); // Calls parameterized constructor with double values

        System.out.println("Result of adding two integers: " + calculator.add(5, 3));
        System.out.println("Result of adding two doubles: " + calculator.add(3.5, 2.5));
    }
}
