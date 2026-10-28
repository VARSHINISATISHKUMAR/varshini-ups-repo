/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varsh
 */
package Models;

public class Students {
    private int studId;
    private int deptId;
    private String studName;
    private String email;
    private int age;
    private String collegeName;

    public Students(int studId, int deptId, String studName, String email, int age, String collegeName) {
        this.studId = studId;
        this.deptId = deptId;
        this.studName = studName;
        this.email = email;
        this.age = age;
        this.collegeName = collegeName;
    }

    public int getStudId() {
        return studId;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getStudName() {
        return studName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public String toString() {
        return studId + " " + studName + " " + age;
    }
}

