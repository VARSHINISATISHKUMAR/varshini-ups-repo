import java.util.Scanner;
public class calculations {

    public static int sum(int a,int b) {
        return a+b;
    }

    public static int subt(int a,int b) {
        return a-b;
    }

    public static int mult(int a,int b) {
        return a*b;
    }

    public static int division(int a,int b) {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The result of addition is: " + sum(a,b));
        System.out.println("The result of subtraction is: " + subt(a,b));
        System.out.println("The result of multiplication is: " + mult(a,b));
        System.out.println("The result of division is: " + division(a,b));

        sc.close();
    }
}