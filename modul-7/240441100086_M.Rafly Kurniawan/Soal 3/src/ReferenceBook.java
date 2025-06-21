public class ReferenceBook extends Book implements Reservasi {

    public ReferenceBook(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void reservasi() {
        System.out.println("Buku referensi \"" + judul + "\" berhasil direservasi (tidak untuk dipinjam).");
    }

    @Override
    public void batalkanReservasi() {
        System.out.println("Reservasi buku referensi \"" + judul + "\" dibatalkan.");
    }

    @Override
    public void info() {
        System.out.println("Referensi - Judul: " + judul + ", Penulis: " + penulis + ", Tersedia: " + tersedia);
    }
}
