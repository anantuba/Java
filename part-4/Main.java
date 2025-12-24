class BankAccount {

    BankAccount(String acC12345, int par) {
    }

//Private variables:
    private String accountNumber;
    private double balance;

    public void setAccount(String accNo, double amount) {
        accountNumber = accNo;
        balance = amount;
    }
    
//Getter method to check balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("ACC101", 8000);
        myAccount.deposit(3000);
        myAccount.withdraw(2000);
        myAccount.displayAccountInfo();
    }
}
