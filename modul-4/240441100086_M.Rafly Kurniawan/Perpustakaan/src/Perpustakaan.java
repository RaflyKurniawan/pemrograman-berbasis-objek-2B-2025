import java.util.Scanner;

public class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;
    
    public Perpustakaan(int kapasitas){
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }
    
    public void tambahBuku(Scanner input){
        if(jumlahBuku >= daftarBuku.length){
            System.out.println("Kapasitas penuh, tidak dapat menambah Buku.");
            return;
        }
        
        System.out.println("Masukkan Judul Buku : ");
        String judul = input.nextLine();
        
        System.out.println("Masukkan Nama Penulis : ");
        String penulis = input.nextLine();
        
        System.out.println("Masukkan Jumlah Halaman : ");
        int halaman;
        if (input.hasNextInt()){
            halaman = input.nextInt();
            input.nextLine();
        } else {
            System.out.println("Input harus angka!");
            input.nextLine();
            return;
        }
        
        Buku buku = new Buku(judul, penulis, halaman);
        daftarBuku[jumlahBuku] = buku;
        jumlahBuku++;
        
        System.out.println("Buku berhasil ditambahkan");  
    }
    
    public void tampilkanSemuaBuku(){
        if(jumlahBuku == 0){
            System.out.println("Belum ada buku di perpustakaan.");
            return;
        }
        
        System.out.println("\nDaftar Buku");
        for(int i = 0; i < jumlahBuku; i++){
            daftarBuku[i].tampilkanInfo();
        }
    }
}
