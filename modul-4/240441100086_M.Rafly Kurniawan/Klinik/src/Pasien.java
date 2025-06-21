public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;
    
    public Pasien(String nama, int umur, String keluhan){
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public String getKeluhan(){
        return keluhan;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void setKeluhan(String keluhan){
        this.keluhan = keluhan;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama Pasien     : " + nama);
        System.out.println("Umur Pasien     : " + umur + " Tahun");
        System.out.println("Keluhan Pasien  : " + keluhan);
        System.out.println("--------------------");
    }
}
