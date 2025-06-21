
public class Sepeda implements Booking{
    private final double tarifPerhari = 50_000;
    
    @Override
    public void prosesBooking(String nama, int usia, int durasi){
        if (usia < 10){
            System.out.println("Usia minimal untuk booking sepeda adalah 10 tahun");
        }
        
        double total = hitungBiaya(durasi);
        System.out.println("Booking Sepeda berhasil oleh " + nama);
        System.out.println("Durasi : " + durasi + " Hari");
        System.out.println("Biaya Total : " + total);
    }
    
    @Override
    public double hitungBiaya(int durasi){
        return tarifPerhari * durasi;
    }
}
