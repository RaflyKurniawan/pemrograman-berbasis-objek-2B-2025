
public class Motor implements Booking, Asuransi {
    
    private final double tarifPerhari = 150_000;
    
    @Override
    public void prosesBooking(String nama, int usia, int durasi){
        if (usia < 17){
            System.out.println("Usia minimal untuk booking Motor adalah 17 tahun.");
            return;
        }
        
        double total = hitungBiaya(durasi) + hitungAsuransi();
        System.out.println("Booking Motor berhasil oleh " + nama);
        System.out.println("Durasi : " + durasi + " Hari");
        System.out.println("Biaya Total (termasuk asuransi): Rp." +total );
    }
    
    @Override
    public double hitungBiaya(int durasi){
        return tarifPerhari * durasi;
    }
    
    @Override
    public double hitungAsuransi(){
        return 75_000;
    }
}