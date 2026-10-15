import java.util.Scanner;
import java.util.Arrays;

class mergearrsort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[] b=new int[m];
        for (int i=0; i<m; i++) {
            b[i]=sc.nextInt();
        }

        int[] c=new int[n+m];

        for (int i=0; i<n; i++) {
            c[i]=a[i];
        }

        for (int i=0; i<m; i++) {
            c[n+i]=b[i];
        }

        Arrays.sort(c);
        for (int i=0; i<c.length; i++) {
            System.out.print(c[i] + " ");
        }
        sc.close();
    }
}