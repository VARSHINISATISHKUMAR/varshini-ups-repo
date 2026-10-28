/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author varsh
 */

package upsjava;

import Models.Students;
import Services.StudentService;
import java.sql.SQLException;

public class UPSJava {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        try {
            // READ
            
            System.out.println("ALL STUDENTS:");

            for (Students s : service.getAllStudents()) {
                System.out.println(s);
            }
            
           

            // CREATE 
            /*
            Students s = new Students( 10, 3, "Johnn", "johnjohn@gmail.com", 35, "CIT");
            int inserted = service.addStudent(s);
            System.out.println(inserted + " student inserted");
            */
            

            // UPDATE 
            /*
            int updated = service.updateStudentAge(10, 45);
            System.out.println(updated + " student updated");
            

            // DELETE 
            
            int deleted = service.deleteStudent(10);
            System.out.println(deleted + " student deleted");
            */

            

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
