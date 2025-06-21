import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja: Rp");
        double total = input.nextDouble();

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();

        Payment metode;
        switch (pilihan) {
            case 1:
                metode = new Tunai();
                break;
            case 2:
                metode = new KartuKredit();
                break;
            case 3:
                metode = new EWallet();
                break;
            default:
                System.out.println("Metode tidak tersedia.");
                return;
        }

        Transaksi transaksi = new Transaksi(total, metode);
        transaksi.proses();
    }
}
