import java.util.Scanner;

class Student {
    String studentName;
    int studentId;
    String studentDept;

    public Student(String studentName, int studentId, String studentDept) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentDept = studentDept;
    }

    public void display() {
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("Department: " + studentDept);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i=0; i<n; i++) {
            System.out.println("Enter name of student " + (i+1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter student ID:");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter department:");
            String dept = sc.nextLine();

            students[i] = new Student(name, id, dept);
        }

        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }
        sc.close();
    }
}
