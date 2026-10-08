import java.util.Scanner;

class MovieBooking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Ticket Booking System");
        System.out.println("Now showing: ");
        System.out.println("1. Movie1");
        System.out.println("2. Movie2");
        System.out.println("3. Movie3");

        System.out.println("select the movie");
        int movie=sc.nextInt();

        System.out.println("select the screen");
        String[] screens= {"1. Standard", "2. Premium", "3. Platinum"};
        int screen= sc.nextInt();

        switch(movie){
            case 1:
            {
                System.out.println("Movie1 selected");
                break;
            }
            case 2:
            {
                System.out.println("Movie2 selected");
                break;
            }
            case 3:
            {
                System.out.println("Movie3 selected");
                break;
            }
            default:
                System.out.println("The selected movie is not valid or not showing currently");
                
        }

        switch(screen){
            case 1:
            {
                System.out.println("Standard screen selected");
                break;
            }    
            case 2:
            {
                System.out.println("Premium screen selected" );
                break;
            }
            case 3:
            {
                System.out.println("Platinum screen selected");
                break;
            }
            default:
                System.out.println("Screen not available");
        }
        

    }
}