import java.util.Scanner;

class evennos{
    public static int evenno(int[] arr){
    int s=0;
    int n=arr.length;
    for (int i=0; i<n; i++){
        if (arr[i]%2==0){
            s+=arr[i];
        }
    }
    return s;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();     
        }
        System.out.println("The sum of the even nos are: " + evenno(arr));
        sc.close();
    }

}

    