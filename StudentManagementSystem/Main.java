import repository.StudentFileRepository;
import repository.AcademicFileRepository;

import service.StudentService;
import service.AcademicService;
import service.AuthService;

import ui.StudentMenu;
import ui.LoginMenu;

public class Main {

    public static void main(String[] args) {

        StudentFileRepository studentRepository =
                new StudentFileRepository();

        AcademicFileRepository academicRepository =
                new AcademicFileRepository();

        StudentService studentService =
                new StudentService(studentRepository);

        AcademicService academicService =
                new AcademicService(
                        academicRepository, studentService
                );

        StudentMenu studentMenu =
                new StudentMenu(
                        studentService, academicService
                );

        AuthService authService = new AuthService();

        LoginMenu loginMenu =
                new LoginMenu(authService, studentMenu);

        loginMenu.start();
    }
}
