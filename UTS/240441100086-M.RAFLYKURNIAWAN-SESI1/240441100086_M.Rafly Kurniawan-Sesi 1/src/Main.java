
public class Main {

    public static void main(String[] args) {
        Atribut info1 = new Atribut("3 MEI 2025", "Transaksi GPU memakai Dana", 4000000);
        Atribut info2 = new Atribut("4 MEI 2025", "Transaksi Laptop VIA BCA", 11000000);
        
        System.out.println("Berikut List Transaksi");
        info1.displayInfo();
        System.out.println("Berikut List Transaksi 2");
        info2.displayInfo();
                
    }
    
    
    
}
