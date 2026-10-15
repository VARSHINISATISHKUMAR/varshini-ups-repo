import java.util.Scanner;

class maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int secondMax=0;
        int secondMin=0;

        for (int i=0; i<n; i++) {
            if (arr[i]>max) {
                secondMax=max;
                max=arr[i];
            }
            if (arr[i]<min) {
                secondMin=min;
                min=arr[i];
            }
        }

        for (int i=0; i<n; i++) {
            if (arr[i]>secondMax && arr[i]<max) {
                secondMax=arr[i];
            }
            if (arr[i]<secondMin && arr[i]>min) {
                secondMin=arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Second Maximum: " + secondMax);
        System.out.println("Second Minimum: " + secondMin);
        sc.close();
    }
}