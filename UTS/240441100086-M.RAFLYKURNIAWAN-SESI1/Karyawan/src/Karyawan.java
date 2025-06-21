
public class Karyawan {
    private String nama;
    private double gaji;
    
    public Karyawan(String nama, double gaji){
        this.nama = nama;
        setGaji(gaji);
    }
    
    public String getNama(){
        return nama;
    }
    
    public double getGaji(){
        return gaji;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setGaji(double gaji){
        if (gaji < 0){
            System.out.println("Gaji tidak boleh negatif");
            this.gaji = 0;
        } else {
            this.gaji = gaji;
        }
        
    
    }
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Josa", 5000000);
        Karyawan k2 = new Karyawan("Ismaya", -3000000);


        System.out.println(k1.getNama() + " " + "gaji: Rp" + k1.getGaji());
        System.out.println(k2.getNama() + " " + "gaji: Rp" + k2.getGaji());
    }
}

