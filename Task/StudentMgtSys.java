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



/*class ReadFile{
    public static void main(String[] args){
        try{
            BufferedReader reader=new BufferedReader(new FileReader("student.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



/////appending to a file

import java.io.FileWriter;
import java.io.IOException;

class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer =
                new FileWriter("student.txt", true);

            writer.write("Student Name: Priya\n");
            writer.write("Roll Number: 102\n");

            writer.close();

            System.out.println("Data appended successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








 */
