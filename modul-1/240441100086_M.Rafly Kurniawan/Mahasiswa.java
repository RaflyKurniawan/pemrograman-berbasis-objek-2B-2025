import java.util.Scanner;

public class Mahasiswa {
    
    String nama;
    String nim;
    String jurusan;
    String alamat;

    
    void setData(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

   
    void tampilkanData() {
        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("NIM     : ");
            String nim = input.nextLine();
            System.out.print("Jurusan : ");
            String jurusan = input.nextLine();
            System.out.print("Alamat  : ");
            String alamat = input.nextLine();

            
            Mahasiswa mhs = new Mahasiswa();
            mhs.setData(nama, nim, jurusan, alamat);

            
            daftarMahasiswa[i] = mhs;
        }

        
        System.out.println("\n===== Daftar Mahasiswa =====");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
        }
    }
}
