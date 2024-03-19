class StudentDataProgram {
    public static void main(String[] args) {
        Student[] students = {
            new Student("John", 20, "A"),
            new Student("Emily", 21, "B"),
            new Student("Michael", 19, "A"),
            new Student("Sophia", 22, "B"),
            new Student("William", 20, "A")
        };

        System.out.println("Student Details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
        }
    }
}

class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
