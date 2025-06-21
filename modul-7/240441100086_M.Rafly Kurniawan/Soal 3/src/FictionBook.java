public class FictionBook extends Book implements Peminjaman, Reservasi {

    public FictionBook(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void pinjam() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku fiksi \"" + judul + "\" berhasil dipinjam.");
        } else {
            System.out.println("Buku \"" + judul + "\" tidak tersedia untuk dipinjam.");
        }
    }

    @Override
    public void kembalikan() {
        tersedia = true;
        System.out.println("Buku fiksi \"" + judul + "\" telah dikembalikan.");
    }

    @Override
    public void reservasi() {
        System.out.println("Buku fiksi \"" + judul + "\" telah berhasil direservasi.");
    }

    @Override
    public void batalkanReservasi() {
        System.out.println("Reservasi buku fiksi \"" + judul + "\" dibatalkan.");
    }

    @Override
    public void info() {
        System.out.println("Fiksi - Judul: " + judul + ", Penulis: " + penulis + ", Tersedia: " + tersedia);
    }
}
