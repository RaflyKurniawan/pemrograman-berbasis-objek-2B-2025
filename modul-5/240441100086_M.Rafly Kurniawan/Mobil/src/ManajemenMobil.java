import java.util.ArrayList;
import java.util.List;

public class ManajemenMobil {
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