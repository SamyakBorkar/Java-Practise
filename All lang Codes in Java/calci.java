class Calculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        int choice = 3; 

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of Addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result of Subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result of Multiplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
