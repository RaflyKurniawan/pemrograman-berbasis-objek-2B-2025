
public class Main {

    public static void main(String[] args) {
        HewanKarnivora kucing = new HewanKarnivora("Kucing", "Mamalia", 2, "Ikan");
        HewanHerbivora jerapah = new HewanHerbivora("Jerapah", "Mamalia", 6, "Daun");
        
        System.out.println();
        
        kucing.tampilkanInfo();
        kucing.infoKhusus();
        System.out.println();
        
        jerapah.tampilkanInfo();
        jerapah.infoKhusus();
        System.out.println();
        
        System.out.println("Total Hewan : " + Hewan.jumlahHewan);
    }

}
