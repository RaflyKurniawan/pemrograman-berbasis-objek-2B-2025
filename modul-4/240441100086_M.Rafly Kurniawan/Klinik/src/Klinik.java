import java.util.Scanner;

public class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;
    
    public Klinik(int kapasitas){
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }
    
    public void jalankanMenu(){
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("\n---Menu Klinik---");
            System.out.println("1.Tambah Pasien");
            System.out.println("2.Tampilkan Pasien");
            System.out.println("3.Keluar ");
            System.out.println("Pilih Menu : ");
            
            if(!input.hasNextInt()){
                System.out.println("Pilihan harus berupa angka. coba lagi.");
                input.nextLine();
                continue;
            }
            
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan){
                case 1 :
                    if(jumlahPasien >= daftarPasien.length){
                        System.out.println("Kapasitas Penuh. Tidak bisa menambah pasien lagi.");
                        break;
                    }
            
                    System.out.println("Nama pasien     : ");
                    String nama = input.nextLine();
                    System.out.println("Umur Pasien     : ");
                    int umur = input.nextInt();
                    input.nextLine();
                    System.out.println("Keluhan Pasien  : ");
                    String keluhan  = input.nextLine();

                    Pasien p = new Pasien(nama, umur, keluhan);
                    daftarPasien[jumlahPasien] = p;
                    jumlahPasien++;

                    System.out.println("Pasien berhasil ditambahkan");
                    break;
                
                case 2 :
                    if (jumlahPasien == 0){
                        System.out.println("Belum ada pasien tercatat.");
                    } else {
                        System.out.println("\n---Daftar Pasien.---");
                        for (int i = 0; i < jumlahPasien; i++){
                            daftarPasien[i].tampilkanInfo();
                        }
                    }
                    break;
                    
                case 3 :
                    System.out.println("Keluar Program.");
                    return;
                    
                default :
                    System.out.println("Pilihan tidak valid.");
            }
            
        }
    }
}
