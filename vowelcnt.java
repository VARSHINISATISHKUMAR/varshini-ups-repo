import java.util.Scanner;
class vowelcnt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine().toLowerCase();
        int cnt= 0;

        for (int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cnt++;
            }
        }
        System.out.println("Number of vowels: " + cnt);
    }
}
