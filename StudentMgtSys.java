import java.util.Scanner;
import java.io.*;

class StudentMgtSys{
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System");

        try{
            File file=new File("Student Management System.txt");
            if(file.createNewFile()){
                System.out.println("File successfully created" );            
            }
            FileWriter writer= new FileWriter("Student Management System.txt");
            writer.write("Student Details: ");
            writer.write("\n");
            writer.write("Name: Varshini");
            writer.write("\n");
            writer.write("Department: AI&DS");
            writer.close();

        }catch (Exception e) {
            System.out.println("An error occurred while handling the file: " );
        }
    }
}

