import java.io.*;
import java.util.*;
public class studfilehandle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String file= "studentss.txt";

        try{
            FileWriter fw= new FileWriter(file);

            for( int i=0; i<=5; i++){
                System.out.println("Enter id, name and marks:");
                int id= sc.nextInt();
                String name= sc.next();
                int marks= sc.nextInt();
                fw.write(id + " " + name + " " + marks + "\n");
            }
            fw.close();

            BufferedReader br= new BufferedReader(new FileReader(file));
            String line;
            int maxmarks= -1;
            String topper= "";
            System.out.println("\nStudent Records: ");

            while((line=br.readLine())!= null){
                System.out.println(line);
                String[] data= line.split(" ");
                int marks= Integer.parseInt(data[2]);

                if(marks>maxmarks){
                    maxmarks=marks;
                    topper=data[1];
                }

            }
            br.close();
            System.out.println("Highest marks: " + topper + " " + maxmarks);

            FileWriter fw2= new FileWriter(file, true);
            System.out.println("\nEnter the new stud id, name and marks: ");
            int id= sc.nextInt();
            String name= sc.next();
            int marks= sc.nextInt();
            fw2.write(id + " " + name + " " + marks + "\n");
            fw2.close();
            System.out.println("New student added successfully.");
        }catch (IOException e){
            System.out.println("File error: " + e.getMessage());
        }
        sc.close();
    }
    
}
