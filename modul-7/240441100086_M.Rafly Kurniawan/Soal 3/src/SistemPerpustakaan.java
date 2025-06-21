import java.util.ArrayList;
import java.util.List;

public class SistemPerpustakaan {
    private List<Book> daftarBuku;

    public SistemPerpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Book buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemua() {
        for (Book b : daftarBuku) {
            b.info();
        }
    }

    public Book cariBuku(String judul) {
        for (Book b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                return b;
            }
        }
        return null;
    }
}
