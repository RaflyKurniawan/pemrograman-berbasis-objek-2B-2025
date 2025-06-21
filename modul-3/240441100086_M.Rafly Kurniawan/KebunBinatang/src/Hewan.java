
public class Hewan {
    String nama;
    String jenis;
    int usia;
    static int jumlahHewan = 0;
    
    public Hewan(String nama, String jenis, int usia){
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
        jumlahHewan++;
    }
    
    public void tampilkanInfo(){
        System.out.println("===Berikut Daftar Hewan=== ");
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis Hewan : " + jenis);
        System.out.println("Usia Hewan : " + usia);
    }
    
}
