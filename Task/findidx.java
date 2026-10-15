import java.util.Scanner;
class findidx {
    public static int find(int[] arr, int target) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number: ");
        int target=sc.nextInt();

        int res=find(arr, target);

        if (res!=-1) {
            System.out.println("The target is at index: " + res);
        }else{
            System.out.println("The target is not found");
        }
        sc.close();
    }
}
