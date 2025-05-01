public class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    public void infoFiksi() {
        super.info();
        System.out.println("Genre: " + genre);
        System.out.println();
    }
}