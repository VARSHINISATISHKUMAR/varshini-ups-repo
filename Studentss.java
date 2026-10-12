
import java.util.Scanner;

class Studentss {
    private String studentName;
    private int studentId;
    private String studentDept;

    public Studentss(String studentName, int studentId, String studentDept) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentDept = studentDept;
    }

    //getter
    public String getStudentName() {
        return studentName;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getStudentDept() {
        return studentDept;
    }

    //setter
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public void display() {
        System.out.println("Name: " + getStudentName());
        System.out.println("ID: " + getStudentId());
        System.out.println("Department: " + getStudentDept());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        Studentss[] students = new Studentss[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            String name = sc.nextLine();

            System.out.println("Enter student ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter department:");
            String dept = sc.nextLine();

            students[i] = new Studentss(name, id, dept);
        }

        System.out.println("\nStudent Details:");

        for (Studentss s : students) {
            s.display();
        }
        sc.close();
    }
}
