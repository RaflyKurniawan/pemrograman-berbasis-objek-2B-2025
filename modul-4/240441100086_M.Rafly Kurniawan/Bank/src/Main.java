import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank(100);
        
        while(true){
            System.out.println("\n---Menu Bank---");
            System.out.println("1.Tambah Rekening");
            System.out.println("2.Setor");
            System.out.println("3.Tarik");
            System.out.println("4.Tampilkan Semua Rekening");
            System.out.println("5.Keluar");
            System.out.println("Pilihan Menu :");
            
            int pilihan;
            if(input.hasNextInt()){
                pilihan = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Masukkan Angka.");
                input.nextLine();
                continue;
            }
            
            switch (pilihan){
                case 1 :
                    bank.tambahRekening(input);
                    break;
                case 2 :
                    bank.setor(input);
                    break;
                case 3 :
                    bank.tarik(input);
                    break;
                case 4 : 
                    bank.tampilkanSemuaRekening();
                    break;
                case 5 :
                    System.out.println("Keluar Program.");
                default :
                    System.out.println("Pilihan tidak tersedia.");
            }
        } 
    }
    
    
}
