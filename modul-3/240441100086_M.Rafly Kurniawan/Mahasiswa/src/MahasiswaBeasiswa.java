public class MahasiswaBeasiswa extends Mahasiswa{
    String jenisBeasiswa;
    
    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa){
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    public void InfoBeasiswa(){
        super.infoMahasiswa();
        System.out.println("Jenis Beasiswa : " + jenisBeasiswa);
    }
}
