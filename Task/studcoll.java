import java.util.*;
class studcoll{
    public static void main(String[] args){
        HashSet<Object> studs= new HashSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n= sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Enter the student name: ");
            String name = sc.nextLine();
            System.out.println("Enter student age: ");
            Integer age= sc.nextInt();
            sc.nextLine();

            studs.add(name);
            studs.add(age);
        }
        System.out.println("Student Details:::");
        System.out.println(studs);
        
    }

}


        