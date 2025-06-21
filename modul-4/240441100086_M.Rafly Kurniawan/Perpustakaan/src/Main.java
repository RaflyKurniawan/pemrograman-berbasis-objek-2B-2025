import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan(100);
        
        while (true){
            System.out.println("\n---Menu Perpustakaan---");
            System.out.println("1.Tambah Buku");
            System.out.println("2.Tampilkan Semua Buku");
            System.out.println("3.Keluar");
            System.out.println("Pilih menu : ");
            
            int pilihan;
            if (input.hasNextInt()){
                pilihan = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Pilih dengan memasukkan angka!");
                input.nextLine();
                continue;
            }
            
            switch(pilihan){
                case 1 :
                    perpustakaan.tambahBuku(input);
                    break;
                case 2 :
                    perpustakaan.tampilkanSemuaBuku();
                    break;
                case 3 :
                    System.out.println("Keluar Program");
                    return;
                default :
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
    }
    
}
