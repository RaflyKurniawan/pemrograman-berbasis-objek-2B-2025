package hewan;

public class Kucing {
    
    String nama;
    String warna;
    int umur;

    void setData(String n, String w, int u) {
        nama = n;
        warna = w;
        umur = u;
    }
    void tampilkanInfo() {
        System.out.println("Nama Kucing : " + nama);
        System.out.println("Warna       : " + warna);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println(); 
    }

    public static void main(String[] args) {
        
        Kucing k1 = new Kucing();
        Kucing k2 = new Kucing();
        Kucing k3 = new Kucing();
        
        k1.setData("Oyen", "Oranye", 3);
        k2.setData("Milo", "Hitam", 2);
        k3.setData("Luna", "Putih", 4);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("=== Data Kucing ke-" + i + " ===");

            if (i == 1) {
                k1.tampilkanInfo();
            } else if (i == 2) {
                k2.tampilkanInfo();
            } else if (i == 3) {
                k3.tampilkanInfo();
            }
        }
    }
}