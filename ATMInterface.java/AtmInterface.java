import java.util.Scanner;

public class AtmInterface 
{
    public static void main(String[] args) {
        int balance = 92453, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM");
            System.out.println("Choose 1 for Cash Withdraw");
            System.out.println("Choose 2 for Cash Deposit");
            System.out.println("Choose 3 for Balance Inquiry");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful");
                        System.out.println("Please collect your money");
                        System.out.println("Balance after withdrawal: " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.println("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("Balance after deposit: " + balance);
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using the ATM!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}