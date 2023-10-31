package Project;

import java.util.ArrayList;
import java.util.List;

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(int id, Student updatedStudent) {
        Student student = findStudentById(id);
        if (student != null) {
            student.setName(updatedStudent.getName()); // Use the setter method
            student.setAge(updatedStudent.getAge()); // Use the setter method
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
