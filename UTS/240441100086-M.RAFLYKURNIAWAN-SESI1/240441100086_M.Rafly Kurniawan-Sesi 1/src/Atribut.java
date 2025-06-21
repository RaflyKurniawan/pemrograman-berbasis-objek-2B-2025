public class Atribut {
    String date;
    String description;
    int amount;
    
    public Atribut(String date, String description, int amount){
        this.date = date;
        this.description = description;
        this.amount  = amount;
        
    
    }
    
    public void displayInfo(){
        System.out.println("Berikut adalah List Transaksi");
        System.out.println("Tanggal Transaksi  : " + date);
        System.out.println("Deskripsi Transaksi  : " + description);
        System.out.println("Jumlah Transaksi  : " + amount );
    }
        
        

}
    
