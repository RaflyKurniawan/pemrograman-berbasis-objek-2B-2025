import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===Sistem Booking Kendaraan===");
        System.out.println("Nama anda : "); String nama = sc.nextLine();
        System.out.println("Usia anda : "); int usia = sc.nextInt();
        
        System.out.println("Pilih Kendaraan : ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Sepeda");
        System.out.println("Pilih (1-3):");
        int pilihan = sc.nextInt();
        
        System.out.println("Durasi sewa (hari) : ");
        int durasi = sc.nextInt();
        
        Booking booking = null;
        
        switch (pilihan){
            case 1:
                booking =  new Mobil();
                break;
            case 2:
                booking = new Motor();
                break;
            case 3:
                booking = new Sepeda();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        
        booking.prosesBooking(nama, usia, durasi);
        sc.close();
    }
    
}
