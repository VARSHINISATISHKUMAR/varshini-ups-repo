/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author varsh
 */

package Services;

import DAO.StudentDAO;
import Models.Students;
import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private final StudentDAO dao = new StudentDAO();

    public int addStudent(Students s) throws SQLException {
        if (s.getStudId() <= 0) {
            throw new IllegalArgumentException("Student ID must be positive.");
        }

        if (s.getStudName() == null || s.getStudName().trim().isEmpty()) {
            throw new IllegalArgumentException("Student name is required.");
        }

        if (s.getAge() <= 0 || s.getAge() > 120) {
            throw new IllegalArgumentException("Invalid age.");
        }
        return dao.addStudent(s);
    }

    public List<Students> getAllStudents() throws SQLException {
        return dao.getAllStudents();
    }

    public int updateStudentAge(int id, int age) throws SQLException {
        if (id <= 0 || age <= 0 || age > 120) {
            throw new IllegalArgumentException("Invalid student ID or age.");
        }
        return dao.updateStudentAge(id, age);
    }

    public int deleteStudent(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid student ID.");
        }
        return dao.deleteStudent(id);
    }
}
