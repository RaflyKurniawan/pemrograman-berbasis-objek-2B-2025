
public class Mobil implements Booking, Asuransi {
    private final double tarifPerhari = 500_000;
    
    @Override
    public void prosesBooking(String nama, int usia, int durasi){
        if (usia < 17){
            System.out.println("Usia minimal untuk booking mobil adalah 17 tahun.");
            return;
        }
        
        double total = hitungBiaya(durasi) + hitungAsuransi();
        System.out.println("Booking Mobil berhasil oleh " + nama);
        System.out.println("Durasi : " + durasi + "Hari");
        System.out.println("Biaya total (termasuk asuransi): Rp." + total);
    }
    
    @Override
    public double hitungBiaya(int durasi){
        return tarifPerhari * durasi;
    }
    
    @Override
    public double hitungAsuransi(){
        return 150_000;
    }
}
