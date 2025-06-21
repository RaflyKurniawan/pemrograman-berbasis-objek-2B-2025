public class EWallet implements Payment {
    @Override
    public double hitungTotal(double jumlah) {
        double diskon = jumlah * 0.05;
        if (diskon > 10000) diskon = 10000;
        return jumlah - diskon;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran dengan E-Wallet sebesar Rp" + hitungTotal(jumlah));
    }
}
