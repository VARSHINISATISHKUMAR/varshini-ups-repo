import java.util.InputMismatchException;
import java.util.Scanner;
class trycatch{
    int a;
    int b;

    public trycatch(int a, int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("Result is : " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by 0 is not allowed.");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
        catch(Exception e){
            System.out.println("Error: An unexpected error occurred.");
        }
    }
}

