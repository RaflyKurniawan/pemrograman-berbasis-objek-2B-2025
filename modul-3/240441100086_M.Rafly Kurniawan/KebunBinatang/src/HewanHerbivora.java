
public class HewanHerbivora extends Hewan{
    String tumbuhanFavorit;
    
    public HewanHerbivora(String nama, String jenis, int usia, String tumbuhanFavorit){
        super(nama, jenis, usia);
        this.tumbuhanFavorit = tumbuhanFavorit;
        
    }
    
    public void infoKhusus(){
        System.out.println("Hewan ini adalah hewan Herbivora dan suka makan " + tumbuhanFavorit);
    }
}
