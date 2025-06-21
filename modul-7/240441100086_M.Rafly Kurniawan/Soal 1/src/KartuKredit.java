public class KartuKredit implements Payment {
    private final double biayaAdmin = 0.025;

    @Override
    public double hitungTotal(double jumlah) {
        return jumlah + (jumlah * biayaAdmin);
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran dengan Kartu Kredit sebesar Rp" + hitungTotal(jumlah));
    }
}
