
public class HewanKarnivora extends Hewan{
    String dagingFavorit;
    
    public HewanKarnivora(String nama, String jenis, int usia, String dagingFavorit){
        super(nama, jenis, usia);
        this.dagingFavorit = dagingFavorit;
    }
    
    public void infoKhusus(){
        System.out.println("Hewan ini adalah hewan karnivora dan suka makan " + dagingFavorit);
    }
}
