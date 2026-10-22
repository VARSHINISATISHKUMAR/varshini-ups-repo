import java.util.*;
class studcolltree{
    public static void main(String[] args){
        TreeSet<String> studs= new TreeSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n= sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Enter the student name: ");
            String name = sc.nextLine();

            studs.add(name);
        }
        System.out.println("Student Details:::");
        System.out.println(studs);
        
    }

}


        
