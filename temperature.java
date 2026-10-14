import java.util.Scanner;

class temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to farenheit");
        System.out.println("2. Farenheit to celsius");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("Enter the temperature: ");
        double temp =sc.nextDouble();

        if (choice==1){
            double f=(temp * 9/5) +32;
            System.out.println("Farenheit: " + f);
        }else if (choice==2){
            double c =(temp- 32)*5/9;
            System.out.println("Celsius: " + c);
        }else{
            System.out.println("Please enter a valid chooice.");
        }
    }
}