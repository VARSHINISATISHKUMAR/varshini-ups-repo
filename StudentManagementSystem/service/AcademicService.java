package service;

import model.Marks;
import repository.AcademicFileRepository;

import java.util.List;

public class AcademicService {

    private final AcademicFileRepository repository;
    private final StudentService studentService;

    public AcademicService(AcademicFileRepository repository,
                           StudentService studentService) {
        this.repository = repository;
        this.studentService = studentService;
    }

    public void enterOrUpdateMarks(int studentId,
                                   int mark1,
                                   int mark2,
                                   int mark3) {

        if (studentService.getStudentById(studentId) == null) {
            System.out.println("Student not found.");
            return;
        }

        if (!validMark(mark1) || !validMark(mark2)
                || !validMark(mark3)) {
            System.out.println("Each mark must be between 0 and 100.");
            return;
        }

        List<Marks> marksList = repository.loadAll();

        for (Marks m : marksList) {
            if (m.getStudentId() == studentId) {
                m.setSubject1(mark1);
                m.setSubject2(mark2);
                m.setSubject3(mark3);

                repository.saveAll(marksList);
                System.out.println("Marks updated successfully.");
                return;
            }
        }

        marksList.add(new Marks(studentId, mark1, mark2, mark3));
        repository.saveAll(marksList);

        System.out.println("Marks entered successfully.");
    }

    public void viewResult(int studentId) {
        List<Marks> marksList = repository.loadAll();

        for (Marks m : marksList) {
            if (m.getStudentId() == studentId) {
                System.out.println("Student ID: " + studentId);
                System.out.println("Subject 1: " + m.getSubject1());
                System.out.println("Subject 2: " + m.getSubject2());
                System.out.println("Subject 3: " + m.getSubject3());

                int total = calculateTotal(m);
                double average = calculateAverage(m);

                System.out.println("Total: " + total + " / 300");
                System.out.printf("Average: %.2f%%%n", average);
                System.out.println("Grade: " + calculateGrade(average));
                return;
            }
        }

        System.out.println("Marks not found for this student.");
    }

    private boolean validMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    private int calculateTotal(Marks m) {
        return m.getSubject1()
                + m.getSubject2()
                + m.getSubject3();
    }

    private double calculateAverage(Marks m) {
        return calculateTotal(m) / 3.0;
    }

    private String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
