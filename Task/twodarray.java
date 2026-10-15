import java.util.Scanner;
class twodarray{

    public static int[][] createarr(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of rows");
        int r=sc.nextInt();
        System.out.println("Enter no.of columns");
        int c=sc.nextInt();
        int[][] arr2d=new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        return arr2d;
    }


    public static int[][] arrsum(int[][] arr1, int[][] arr2){
        int r=arr1.length;
        int c=arr1[0].length;
        int[][] resarr=new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                resarr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return resarr;
    }

    public static void main(String[] args){
        int[][] arr1=createarr();
        int[][] arr2=createarr();
        int r=arr1.length;
        int c=arr1[0].length;
        int[][] resultarr=arrsum(arr1, arr2);
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.println(resultarr[i][j]+ " ");
            }
        }
}

}

