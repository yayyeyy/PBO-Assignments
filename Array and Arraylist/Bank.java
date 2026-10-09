
import java.util.ArrayList;

public class Bank {

    // Atribut
    private int balance;
    static int transaksi = 0;

    // Constructor
    public Bank(int balance) {
        this.balance = balance;
    }

    // Method deposit
    public void deposit(int amount) {
        balance = balance + amount;
        transaksi++;
    }

    // Method withdraw
    public void withdraw(int amount) {
        balance = balance - amount;
        transaksi++;
    }

    // Method getBalance
    public int getBalance() {
        return balance;
    }
}