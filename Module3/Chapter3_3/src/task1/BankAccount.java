package task1;

import java.util.ArrayList;


public class BankAccount {
    private int AccountNumber;
    private int Balance;

    public static int TotalAccounts = 0;

    public BankAccount(int initialBalance) {
        TotalAccounts++;
        this.Balance = initialBalance;
        this.AccountNumber = TotalAccounts; // Assign a unique account number

    }

    // getters
    public int getAccountNumber() {
        return AccountNumber;
    }

    public int getBalance() {
        return Balance;
    }

    // methods
    public void deposit(int amount) {
        if(amount > 0){
            Balance += amount;
            System.out.println(amount + " is deposited " + " in your account " + getAccountNumber());
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= Balance){
            Balance -= amount;
            System.out.println(amount + " is withdrawn " + " from your account " + getAccountNumber());
        } else {
            System.out.println("Insufficient balance or invalid amount for account " + getAccountNumber());
        }
    }

    public static int getTotalAccounts(){
        return TotalAccounts;

    }



    public static void main(String[] args) {
        ArrayList<BankAccount> account = new ArrayList<>();

        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}