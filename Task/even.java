import java.util.Scanner;
class even{
   public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      int i= sc.nextInt();
      while(i<50){
         if (i%2==0){
            System.out.println(i);
            i+=2;
         }
         else{
            System.out.println(i);
            i+=1;
         }
      }
   }
}