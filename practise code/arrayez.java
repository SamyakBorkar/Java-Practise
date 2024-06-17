import java.util.Scanner;

class StudentNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] studentNames = new String[n];
        
        System.out.println("Enter the names of the students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }
        System.out.println("___________________________________________");
        System.out.println("The names of the students are:");
        for (int i = 0; i < n; i++) {
            System.out.println(studentNames[i]);
        }
    }
}

