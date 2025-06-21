
public class RekeningBank {
    private String noRekening;
    private String namaPemilik ;
    private double saldo;
    
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal){
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }
    
    public String getnoRekening(){
        return noRekening;
    }
    
    public String getnamaPemilik(){
        return namaPemilik;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setor(double jumlah){
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }
    
    public boolean tarik(double jumlah){
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
    
    public void tampilkanInfo(){
        System.out.println("---Data Rekening Nasabah--- ");
        System.out.println("No Rekening     : " + noRekening );
        System.out.println("Nama Pemilik    : " + namaPemilik );
        System.out.println("Saldo           : Rp  " + saldo );
        System.out.println("---------------------------");
    }
}
