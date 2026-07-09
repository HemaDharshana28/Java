class Bank {
    double accountNumber;
    String holderName;
    double balance;
    double lastDeposit;
    double lastWithdrawal;

    Bank(double accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.lastDeposit = 0;
        this.lastWithdrawal = 0;
    }

    void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            lastDeposit = amt;
            System.out.println("Amount Deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amt <= balance) {
            balance -= amt;
            lastWithdrawal = amt;
            System.out.println("Amount Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
        System.out.println("Last Deposit   : " + lastDeposit);
        System.out.println("Last Withdrawal: " + lastWithdrawal);
    }
}

public class BankAccount {
    public static void main(String[] args) {

        Bank b = new Bank(123456, "Hema", 10000);

        b.deposit(5000);
        b.withdraw(2000);

        b.display();
    }
}