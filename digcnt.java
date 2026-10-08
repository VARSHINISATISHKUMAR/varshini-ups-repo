import java.util.Scanner;
class digcnt{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int cnt=0;
      while(n!=0){
         n=n/10;
         cnt++;
      }
      System.out.println(cnt);
   }
}