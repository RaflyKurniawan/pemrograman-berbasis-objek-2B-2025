
import java.util.ArrayList;
import java.util.List;



abstract class Mobil {
    public abstract void nyalakan_mesin();
    public abstract void matikan_mesin();
}

class MobilSport extends Mobil{
    @Override
    public void nyalakan_mesin(){
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }
    
    @Override
    public void matikan_mesin(){
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}

class MobilSedan extends Mobil{
    @Override
    public void nyalakan_mesin(){
        System.out.println("Mobil sedan dinyakan secara halus.");
    }
    
    @Override
    public void matikan_mesin(){
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}
class ManajemenMobil {
    private List<Mobil> daftarMobil;

    public ManajemenMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakan_mesin();
            mobil.matikan_mesin();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ManajemenMobil manajemen = new ManajemenMobil();

        MobilSport sport = new MobilSport();
        MobilSedan sedan = new MobilSedan();

        manajemen.tambahMobil(sport);
        manajemen.tambahMobil(sedan);

        manajemen.operasikanSemuaMobil();
    }
}

