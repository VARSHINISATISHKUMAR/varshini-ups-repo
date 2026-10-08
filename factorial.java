import java.util.Scanner;

class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int i=1;
        do{
           fact = fact * i;
           i++;
        }while (i <= n);
        System.out.println(fact);
    }
}