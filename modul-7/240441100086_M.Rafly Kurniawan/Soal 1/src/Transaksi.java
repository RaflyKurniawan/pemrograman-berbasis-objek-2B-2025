public class Transaksi {
    private double jumlah;
    private Payment metode;

    public Transaksi(double jumlah, Payment metode) {
        this.jumlah = jumlah;
        this.metode = metode;
    }

    public void proses() {
        metode.prosesPembayaran(jumlah);
    }
}
