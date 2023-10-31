package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // The rest of the code remains the same as in the previous example.
        while (true) {

            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    sms.addStudent(new Student(id, name, age));
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    sms.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to find: ");
                    int findId = scanner.nextInt();
                    Student foundStudent = sms.findStudentById(findId);
                    if (foundStudent != null) {
                        System.out.println("Found Student: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Updated Student Name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter Updated Student Age: ");
                    int updatedAge = scanner.nextInt();
                    sms.updateStudent(updateId, new Student(updateId, updatedName, updatedAge));
                    System.out.println("Student updated successfully.");
                    break;
                    case 5:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    sms.deleteStudent(deleteId);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
