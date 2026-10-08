import java.util.Scanner;
class table{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1;
      while(i<=10){
         System.out.println(n+ "x" +i+ "=" +(i*n));
         i++;
      }
   }
}