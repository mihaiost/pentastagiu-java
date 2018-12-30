package main.java.HomeworkWeek3.The_BANK_app;

public class Account {

    private int account_balance;

    public Account(int account_balance) {
        this.account_balance = account_balance;
    }

    public int getBalance() {
        return this.account_balance;
    }

    public void withdraw(int suma) {
        if (suma < 0) {
            System.out.println("EROARE suma introdusa este negativa");
        } else if(suma > account_balance)System.out.println("EROARE suma introdusa este mai mare decat cea aflata in cont");
            else account_balance = account_balance - suma;
    }

    public void deposit(int suma) {
        if (suma < 0) {
            System.out.println("EROARE suma introdusa este negativa");
        } else
            account_balance = account_balance + suma;
    }
}
