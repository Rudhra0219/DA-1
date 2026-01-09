import java.util.Scanner;

public class ATM {

    static int balance = 10000;

    static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    static void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    static void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
