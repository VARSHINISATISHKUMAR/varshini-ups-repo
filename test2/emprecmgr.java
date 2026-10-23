import java.util.*;
import java.io.*;

class Employee{
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id= id;
        this.name= name;
        this.dept= dept;
        this.salary= salary;
    }
    public String toString(){
        return id + " " + name + " " + dept + " " + salary;
    }
}

public class emprecmgr{
    static ArrayList<Employee> list= new ArrayList<>();
    static HashMap<Integer,Employee> map= new HashMap<>();
    static HashSet<Integer> ids= new HashSet<>();
    static Scanner sc= new Scanner(System.in);

    static void add(){
        try{
            System.out.print("Enter ID: ");
            int id= Integer.parseInt(sc.nextLine());
            if (!ids.add(id)){
                System.out.println("ID already exists!");
                return;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary= Double.parseDouble(sc.nextLine());
            if (salary < 0) {
                ids.remove(id);
                System.out.println("Invalid salary.");
                return;
            }

            Employee e= new Employee(id, name, dept, salary);
            list.add(e);
            map.put(id, e);
            System.out.println("Employee added.");
        }catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    static void search(){
        System.out.print("Enter ID: ");
        try{
            int id= Integer.parseInt(sc.nextLine());
            Employee e= map.get(id);

            if (e!= null)
                System.out.println(e);
            else
                System.out.println("Employee not found.");
        }catch(NumberFormatException e){
            System.out.println("Invalid ID.");
        }
    }

    static void update(){
        System.out.print("Enter ID: ");
        try{
            int id= Integer.parseInt(sc.nextLine());
            Employee e= map.get(id);
            if (e==null) {
                System.out.println("Employee not found.");
                return;
            }

            System.out.print("Enter new salary: ");
            double salary = Double.parseDouble(sc.nextLine());
            if (salary< 0) {
                System.out.println("Invalid salary!");
                return;
            }
            e.salary= salary;
            System.out.println("Salary updated!");
        }catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    static void delete(){
        System.out.print("Enter ID: ");
        try{
            int id= Integer.parseInt(sc.nextLine());
            Employee e= map.remove(id);
            if (e!=null) {
                list.remove(e);
                ids.remove(id);
                System.out.println("Employee deleted...");
            }else{
                System.out.println("Employee not found.");
            }
        }catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
        }
    }

    static void display() {
        if (list.isEmpty()) {
            System.out.println("No employees!");
            return;
        }
        for (Employee e : list)
            System.out.println(e);
    }

    static void load(){
        try(BufferedReader br= new BufferedReader(new FileReader("employees.txt"))){
            String line;
            while ((line= br.readLine()) != null) {
                String[] d= line.split(",", -1);

                int id= Integer.parseInt(d[0]);
                String name= d[1];
                String dept= d[2];
                double salary= Double.parseDouble(d[3]);
                if (ids.add(id)) {
                    Employee e= new Employee(id, name, dept, salary);
                    list.add(e);
                    map.put(id, e);
                }
            }
        }catch (FileNotFoundException e){
        }catch (IOException | NumberFormatException e) {
            System.out.println("Error loading the file.");
        }
    }

    static void save(){
        try(PrintWriter pw= new PrintWriter(
                new FileWriter("employees.txt"))) {
            for(Employee e : list) {
                pw.println(e.id + "," + e.name + "," + e.dept + "," + e.salary);
            }
            System.out.println("Data is saved suvcessfully!!");
        }catch(IOException e) {
            System.out.println("Error saving file..");
        }
    }

    public static void main(String[] args) {
        load();
        while (true) {
            System.out.println("\n1.Add  2.Search  3.Update Salary");
            System.out.println("4.Delete  5.Display  6.Save and Exit");
            System.out.print("Enter choice: ");

            try {
                int ch = Integer.parseInt(sc.nextLine());
                switch (ch) {
                    case 1: add(); break;
                    case 2: search(); break;
                    case 3: update(); break;
                    case 4: delete(); break;
                    case 5: display(); break;
                    case 6:
                        save();
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }catch(NumberFormatException e) {
                System.out.println("Please Enter a valid choice!!!");
            }
        }
    }
}
