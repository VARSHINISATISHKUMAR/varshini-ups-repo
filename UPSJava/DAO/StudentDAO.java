/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varsh
 */

package DAO;

import Models.Students;
import Util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // CREATE
    public int addStudent(Students s) throws SQLException {
        String sql = "INSERT INTO stud_db " +
                "(stud_id, dept_id, stud_name, email, age, college_name) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, s.getStudId());
            ps.setInt(2, s.getDeptId());
            ps.setString(3, s.getStudName());
            ps.setString(4, s.getEmail());
            ps.setInt(5, s.getAge());
            ps.setString(6, s.getCollegeName());

            return ps.executeUpdate();
        }
    }

    // READ - ALL STUDENTS
    public List<Students> getAllStudents() throws SQLException {
        List<Students> students = new ArrayList<>();
        String sql = "SELECT * FROM stud_db";
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Students s = new Students(
                        rs.getInt("stud_id"),
                        rs.getInt("dept_id"),
                        rs.getString("stud_name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("college_name")
                );
                students.add(s);
            }
        }
        return students;
    }

    // UPDATE
    public int updateStudentAge(int studId, int age) throws SQLException {
        String sql = "UPDATE stud_db SET age = ? WHERE stud_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, age);
            ps.setInt(2, studId);
            return ps.executeUpdate();
        }
    }

    // DELETE
    public int deleteStudent(int studId) throws SQLException {
        String sql = "DELETE FROM stud_db WHERE stud_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studId);
            return ps.executeUpdate();
        }
    }
}

