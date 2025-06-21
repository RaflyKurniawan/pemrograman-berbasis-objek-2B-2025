public abstract class Book {
    protected String judul;
    protected String penulis;
    protected boolean tersedia;

    public Book(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public abstract void info();
}
