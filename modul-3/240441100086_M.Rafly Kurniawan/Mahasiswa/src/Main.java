public class Main {

    public static void main(String[] args) {
        MahasiswaReguler mhsReg1 = new MahasiswaReguler("Rafly Kurniawan", "24086","SI-2B");
        MahasiswaReguler mhsReg2 = new MahasiswaReguler("Salman", "24089","SI-2A");
        
        System.out.println("== Data Mahasiswa Reguler ==");
        System.out.println("Mahasiswa Ke-1");
        mhsReg1.InfoReguler();
        System.out.println("Mahasiswa Ke-2");
        mhsReg2.InfoReguler();
        System.out.println();
        
        
        MahasiswaBeasiswa mhsBeasiswa1 = new MahasiswaBeasiswa("Abyan Naufal", "24085", "Beasiswa Bidik misi");
        MahasiswaBeasiswa mhsBeasiswa2 = new MahasiswaBeasiswa("Naufal Husain", "24087", "Beasiswa Berprestasi");
        
        System.out.println("== Data Mahasiswa Beasiswa ==");
        System.out.println("Mahasiswa Ke-1");
        mhsBeasiswa1.InfoBeasiswa();
        System.out.println("Mahasiswa Ke-2");
        mhsBeasiswa2.InfoBeasiswa();
        System.out.println();
    }
    
}
