///zero division with try catch block 

import java.util.Scanner;
class ZeroDiv{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("Result is : " + c);
        }
        catch(Exception e){
            System.out.println("Error: Division by 0 is not allowed.");
        }
    }
}



