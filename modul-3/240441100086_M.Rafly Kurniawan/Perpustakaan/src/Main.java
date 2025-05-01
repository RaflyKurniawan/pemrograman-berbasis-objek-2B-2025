import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int pilihan = 0;

        while (true) {
            System.out.println("\n== MENU PERPUSTAKAAN ==");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Lihat Koleksi Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Input tidak valid. Masukkan angka antara 1-4.");
                scanner.nextLine(); 
                continue; 
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judulF = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String penulisF = scanner.nextLine();
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();
                    BukuFiksi bukuFiksi = new BukuFiksi(judulF, penulisF, genre);
                    perpustakaan.tambahBukuFiksi(bukuFiksi);
                    System.out.println("Buku fiksi berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.print("Judul: ");
                    String judulNF = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String penulisNF = scanner.nextLine();
                    System.out.print("Topik: ");
                    String topik = scanner.nextLine();
                    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judulNF, penulisNF, topik);
                    perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
                    System.out.println("Buku non-fiksi berhasil ditambahkan.");
                    break;

                case 3:
                    perpustakaan.tampilkanKoleksi();
                    break;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}
