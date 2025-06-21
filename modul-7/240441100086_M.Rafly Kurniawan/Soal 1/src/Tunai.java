public class Tunai implements Payment {
    @Override
    public double hitungTotal(double jumlah) {
        return jumlah;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran tunai sebesar Rp" + hitungTotal(jumlah));
    }
}
