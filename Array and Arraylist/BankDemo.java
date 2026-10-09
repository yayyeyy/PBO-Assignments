
import java.util.ArrayList;

public class BankDemo {
    public static void main(String[] args) {

        // ARRAY: menyimpan beberapa saldo awal
        int[] saldoAwal = {100000, 200000, 300000};

        // ARRAYLIST: menyimpan beberapa object Bank
        ArrayList<Bank> daftarBank = new ArrayList<>();

        // Membuat rekening berdasarkan array
        for (int i = 0; i < saldoAwal.length; i++) {
            Bank bank = new Bank(saldoAwal[i]);
            daftarBank.add(bank);
        }

        System.out.println("Welcome to Bank ABC");

        // Menampilkan semua saldo rekening
        for (int i = 0; i < daftarBank.size(); i++) {
            System.out.println(
                "Saldo rekening " + (i + 1) +
                " : Rp " + daftarBank.get(i).getBalance()
            );
        }

        // Deposit ke rekening pertama
        daftarBank.get(0).deposit(50000);

        System.out.println("\nAfter deposit Rp 50000");
        System.out.println(
            "Saldo rekening 1 : Rp " +
            daftarBank.get(0).getBalance()
        );

        // Withdraw dari rekening kedua
        daftarBank.get(1).withdraw(25000);

        System.out.println("\nAfter withdraw Rp 25000");
        System.out.println(
            "Saldo rekening 2 : Rp " +
            daftarBank.get(1).getBalance()
        );

        // Total transaksi
        System.out.println(
            "\nTotal transaksi : " + Bank.transaksi
        );
    }
}
