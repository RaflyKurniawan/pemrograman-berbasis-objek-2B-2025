import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    private ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("\n=== Koleksi Buku Fiksi ===");
        if (koleksiFiksi.isEmpty()) {
            System.out.println("Belum ada buku fiksi.");
        } else {
            for (BukuFiksi buku : koleksiFiksi) {
                buku.infoFiksi();
            }
        }

        System.out.println("=== Koleksi Buku Non-Fiksi ===");
        if (koleksiNonFiksi.isEmpty()) {
            System.out.println("Belum ada buku non-fiksi.");
        } else {
            for (BukuNonFiksi buku : koleksiNonFiksi) {
                buku.infoNonFiksi();
            }
        }
    }
}