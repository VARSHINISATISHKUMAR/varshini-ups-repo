package ui;

import service.StudentService;
import service.AcademicService;
import util.InputUtil;
import util.DateTimeUtil;

public class StudentMenu {

    private final StudentService studentService;
    private final AcademicService academicService;

    public StudentMenu(StudentService studentService,
                       AcademicService academicService) {
        this.studentService = studentService;
        this.academicService = academicService;
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Enter / Update Marks");
            System.out.println("7. View Student Result");
            System.out.println("8. Sort Students");
            System.out.println("9. Date and Time");
            System.out.println("10. Exit");

            choice = InputUtil.readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    studentService.viewAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    enterMarks();
                    break;

                case 7:
                    int resultId = InputUtil.readInt(
                            "Enter student ID: ");
                    academicService.viewResult(resultId);
                    break;

                case 8:
                    System.out.println("1. Sort by ID");
                    System.out.println("2. Sort by Name");

                    int sortChoice = InputUtil.readInt(
                            "Choose sorting method: ");

                    studentService.sortStudents(sortChoice);
                    break;

                case 9:
                    System.out.println("Current date: "
                            + DateTimeUtil.getCurrentDate());

                    System.out.println("Current date and time: "
                            + DateTimeUtil.getCurrentDateTime());

                    System.out.println("Zoned date and time: "
                            + DateTimeUtil.getCurrentZonedDateTime());
                    break;

                case 10:
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);
    }

    private void addStudent() {
        int id = InputUtil.readInt("Enter student ID: ");

        String name = InputUtil.readNonEmptyString(
                "Enter student name: ");

        int age = InputUtil.readInt("Enter age: ");

        String course = InputUtil.readNonEmptyString(
                "Enter course: ");

        studentService.addStudent(id, name, age, course);
    }

    private void searchStudent() {
        System.out.println("1. Search by ID");
        System.out.println("2. Search by Name");

        int choice = InputUtil.readInt("Choose search method: ");

        if (choice == 1) {
            int id = InputUtil.readInt("Enter student ID: ");
            studentService.searchStudent(id);
        } else if (choice == 2) {
            String name = InputUtil.readNonEmptyString(
                    "Enter student name: ");
            studentService.searchStudentByName(name);
        } else {
            System.out.println("Invalid search choice.");
        }
    }

    private void updateStudent() {
        int id = InputUtil.readInt(
                "Enter student ID to update: ");

        String name = InputUtil.readNonEmptyString(
                "Enter new name: ");

        int age = InputUtil.readInt("Enter new age: ");

        String course = InputUtil.readNonEmptyString(
                "Enter new course: ");

        studentService.updateStudent(id, name, age, course);
    }

    private void deleteStudent() {
        int id = InputUtil.readInt(
                "Enter student ID to delete: ");

        if (InputUtil.readYesNo("Confirm deletion? (Y/N): ")) {
            studentService.deleteStudent(id);
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    private void enterMarks() {
        int id = InputUtil.readInt("Enter student ID: ");

        int mark1 = InputUtil.readInt("Enter subject 1 marks: ");
        int mark2 = InputUtil.readInt("Enter subject 2 marks: ");
        int mark3 = InputUtil.readInt("Enter subject 3 marks: ");

        academicService.enterOrUpdateMarks(
                id, mark1, mark2, mark3
        );
    }
}
