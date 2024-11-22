import java.util.HashMap;
import java.util.Scanner;

class StudentInfo {
    int age;
    String name;
    int rollNo;

    // Constructor
    StudentInfo(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll No: " + rollNo);
    }
}

public class student {
    public static void main(String[] args) {
        HashMap<Integer, StudentInfo> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Collect data for each student
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter details for student " + i + ":");

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();

            // Store student info in HashMap with rollNo as key
            students.put(rollNo, new StudentInfo(name, age, rollNo));
        }

        // Display all student information
        System.out.println("\nStudent Information:");
        for (Integer rollNo : students.keySet()) {
            System.out.print("Roll No: " + rollNo + " -> ");
            students.get(rollNo).display();
        }

        scanner.close();
    }
}