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
        System.out.println("Mobil sedan dinyalakan secara halus.");
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

    public void operasikan_semua_mobil() {
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakan_mesin();
            mobil.matikan_mesin();
            System.out.println();
        }
    }
}

public class Main{
    public static void main(String[] args) {
        ManajemenMobil manajemen = new ManajemenMobil();
        
        manajemen.tambahMobil(new MobilSport());
        manajemen.tambahMobil(new MobilSedan());
        
        manajemen.operasikan_semua_mobil();
        
    }
}
