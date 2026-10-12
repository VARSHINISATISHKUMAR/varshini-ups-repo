import java.util.Scanner;
public class atm {
    private int amount;

        public atm(int initialAmount) {
            this.amount = initialAmount;
        }

        public void deposit(int depositAmt){
            if (depositAmt>0){
                amount+=depositAmt;
                System.out.println("Amount deposited:" + depositAmt);
            
            }else{
                System.out.println("Please enter a  valid amount.");
            }
        }

        public void withdraw(int withdrawAmt){
            if (withdrawAmt<=amount && withdrawAmt>0){
                amount-=withdrawAmt;
                System.out.println("Amount withdrawn:" + withdrawAmt);
            }else{
                System.out.println("Invalid withdrawal amount or insufficient balance available.");
            }
        }

        public int getBalance(){
            return amount;
        }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        atm atm = new atm(2000);

        while (true) {
            System.out.println("ATM operations:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Enter the deposit amount: ");
                    int depositAmt=sc.nextInt();
                    atm.deposit(depositAmt);
                    break;
                case 2:
                    System.out.println("Enter the withdrawal amount: ");
                    int withdrawAmt=sc.nextInt();
                    atm.withdraw(withdrawAmt);
                    break;
                case 3:
                    System.out.println("Current Balance: " + atm.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting the system");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
    }
}

