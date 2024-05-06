import java.util.Scanner;
class MultiInputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        scanner.nextLine();

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        scanner.nextLine();

        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("You entered: " + charValue);

        scanner.nextLine();

        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("You entered: " + stringValue);

        System.out.print("Enter true or false: ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("You entered: " + boolValue);

        scanner.close();
    }
}
