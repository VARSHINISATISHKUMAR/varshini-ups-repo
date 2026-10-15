import java.time.*;
import java.util.Scanner;
class datetimeapi{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name of the zone:");
        String zone= sc.nextLine();
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println("Date and time of  " + zone + " is " + zdt);

        System.out.println("The local time of the current area is: ");
        LocalTime time = LocalTime.now();

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        System.out.println(time.plusHours(2));
        System.out.println(time.minusMinutes(30));

        System.out.println(LocalTime.of(10, 30));
    }
}


