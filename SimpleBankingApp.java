import java.util.Scanner;

public class SimpleBankingApp {
    private double balance;

    public SimpleBankingApp() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleBankingApp bankingApp = new SimpleBankingApp();

        System.out.println("Welcome to Simple Banking App!");

        while (true) {
            System.out.println("\nChoose an option:");            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    bankingApp.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    bankingApp.withdraw(withdrawAmount);
                    break;
                case 3:
                    bankingApp.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Banking App. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
