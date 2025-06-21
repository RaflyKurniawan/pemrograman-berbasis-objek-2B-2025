public class Main {
    public static void main(String[] args) {
        SistemPerpustakaan sistem = new SistemPerpustakaan();

        
        FictionBook buku1 = new FictionBook("Laskar Pelangi", "Andrea Hirata");
        ReferenceBook buku2 = new ReferenceBook("Ensiklopedia Sains", "Tim Sains");

        sistem.tambahBuku(buku1);
        sistem.tambahBuku(buku2);

        System.out.println("=== Daftar Buku ===");
        sistem.tampilkanSemua();

        System.out.println("\n=== Simulasi Peminjaman & Reservasi ===");
        
        buku1.pinjam();
        buku1.kembalikan();

        // Reservasi buku referensi
        buku2.reservasi();

        // Reservasi buku fiksi
        buku1.reservasi();

        // Tampilkan status akhir
        System.out.println("\n=== Status Akhir Buku ===");
        sistem.tampilkanSemua();
    }
}
