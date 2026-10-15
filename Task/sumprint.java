import java.util.Scanner;
class sumprint{
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int end=sc.nextInt();
    int sum=0;
    int i=1;
    do{
        sum+=i;
        i++;
    }while(i<=end);
    System.out.println(sum);
   }
}
        
    