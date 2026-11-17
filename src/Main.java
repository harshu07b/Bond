class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
        void deposit(double amount){
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Amount deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }
        void withdraw(double amount){
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount!");
            } else if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Amount withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } void checkBalance() {
            System.out.println("Current Balance: " + balance);
        }
        void displayDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }
public class Main {
public static void main(String[] args) {
    BankAccount acc1 = new BankAccount(1, "Harsh", 5000);
    BankAccount acc2 = new BankAccount(2, "Aatman", 8000);
    System.out.println( " " + " " +"ACCOUNT 1");

    acc1.deposit(2000);
    acc1.withdraw(1000);
    acc1.checkBalance();
    System.out.println("\n" + " "+ " "+ "ACCOUNT 2 ");

    acc2.deposit(3000);
    acc2.withdraw(2000);
    acc2.checkBalance();
    System.out.println("\n FINAL ACCOUNT DETAILS ");
    System.out.println("\nAccount 1:");


    acc1.displayDetails();
    System.out.println("\nAccount 2:");
    acc2.displayDetails();
}
}

