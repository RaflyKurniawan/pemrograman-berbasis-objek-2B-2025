import java.util.Scanner;

public class Bank {
    private RekeningBank[] daftarRekening;
    private int jumlahRekening ;
    
    public Bank(int kapasitas){
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }
    
    public void tambahRekening(Scanner input) {
        if (jumlahRekening >= daftarRekening.length){
            System.out.println("Kapasitas Rekening sudah Penuh");
            return;
        } 
        
        String noRek;
        while (true) {
            System.out.print("Masukkan No Rekening (angka): ");
            noRek = input.nextLine();
            if (noRek.matches("\\d+")) break;
            System.out.println("No rekening harus angka!");
        }
        System.out.println("Masukkan Nama Pemilik   : ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan Saldo Awal     : ");
        double saldo = input.nextDouble();
        input.nextLine();
        
        RekeningBank rek = new RekeningBank(noRek, nama, saldo);
        daftarRekening[jumlahRekening] = rek;
        jumlahRekening++;
        
        System.out.println("Rekening berhasil ditambahkan.");
    }
    
    public void setor(Scanner input){
        String noRek;
        while (true) {
            System.out.print("Masukkan No Rekening (angka): ");
            noRek = input.nextLine();
            if (noRek.matches("\\d+")) break;
            System.out.println("No rekening harus angka!");
        }
        RekeningBank rek = cariRekening(noRek);
        if (rek == null){
            System.out.println("Rekening tidak ditemukan.");
            return;
        }
        
        System.out.println("Jumlah Setoran : ");
        double jumlah = input.nextDouble();
        input.nextLine();
        
        rek.setor(jumlah);
        System.out.println("Setoran berhasil.");
    }
    
    public void tarik(Scanner input){
        String noRek;
        while (true) {
            System.out.print("Masukkan No Rekening (angka): ");
            noRek = input.nextLine();
            if (noRek.matches("\\d+")) break;
            System.out.println("No rekening harus angka!");
        }
        
        RekeningBank rek = cariRekening(noRek);
        if (rek == null){
            System.out.println("Rekening tidak ditemukan.");
            return;
        }
        
        System.out.println("Jumlah Penarikan : ");
        double jumlah = input.nextDouble();
        input.nextLine();
        
        if(rek.tarik(jumlah)){
            System.out.println("Penarikan Berhasil.");
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }
    
    public void tampilkanSemuaRekening(){
        if (jumlahRekening == 0){
            System.out.println("Belum ada Rekening.");
            return;
        }
        for(int i = 0; i <jumlahRekening; i++){
            daftarRekening[i].tampilkanInfo();
        }
    }
    
    private RekeningBank cariRekening(String noRek){
        for(int i = 0; i < jumlahRekening; i++){
            if(daftarRekening[i].getnoRekening().equals(noRek)){
                return daftarRekening[i];
            }
        }
        return null;
    }
    
}
