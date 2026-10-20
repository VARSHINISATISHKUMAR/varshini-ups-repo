package service;

import model.Student;
import repository.StudentFileRepository;
import util.DateTimeUtil;

import java.util.Comparator;
import java.util.List;

public class StudentService {

    private final StudentFileRepository repository;

    public StudentService(StudentFileRepository repository) {
        this.repository = repository;
    }

    public void addStudent(int id, String name,
                           int age, String course) {

        List<Student> students = repository.loadAll();

        if (id <= 0 || age <= 0) {
            System.out.println("ID and age must be positive.");
            return;
        }

        if (isInvalidText(name) || isInvalidText(course)) {
            System.out.println("Name and course cannot be empty or contain |.");
            return;
        }

        if (getStudentById(id) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        students.add(new Student(
                id, name.trim(), age, course.trim(),
                DateTimeUtil.getCurrentDate()
        ));

        repository.saveAll(students);
        System.out.println("Student added successfully.");
    }

    public void viewAllStudents() {
        List<Student> students = repository.loadAll();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student getStudentById(int id) {
        for (Student s : repository.loadAll()) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    public void searchStudent(int id) {
        Student student = getStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student);
        }
    }

    public void searchStudentByName(String name) {
        boolean found = false;

        for (Student s : repository.loadAll()) {
            if (s.getName().toLowerCase()
                    .contains(name.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching student found.");
        }
    }

    public void updateStudent(int id, String name,
                              int age, String course) {

        List<Student> students = repository.loadAll();

        if (age <= 0 || isInvalidText(name)
                || isInvalidText(course)) {
            System.out.println("Invalid student details.");
            return;
        }

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name.trim());
                s.setAge(age);
                s.setCourse(course.trim());

                repository.saveAll(students);
                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        List<Student> students = repository.loadAll();

        boolean removed = students.removeIf(
                s -> s.getId() == id
        );

        if (removed) {
            repository.saveAll(students);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void sortStudents(int choice) {
        List<Student> students = repository.loadAll();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        if (choice == 1) {
            students.sort(Comparator.comparingInt(Student::getId));
        } else if (choice == 2) {
            students.sort(Comparator.comparing(
                    Student::getName,
                    String.CASE_INSENSITIVE_ORDER
            ));
        } else {
            System.out.println("Invalid sorting choice.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    private boolean isInvalidText(String value) {
        return value == null
                || value.isBlank()
                || value.contains("|");
    }
}
