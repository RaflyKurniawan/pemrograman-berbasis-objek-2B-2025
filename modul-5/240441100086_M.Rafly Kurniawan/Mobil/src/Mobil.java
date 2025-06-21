

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
        System.out.println("Mobil sedan dinyakan secara halus.");
    }
    
    @Override
    public void matikan_mesin(){
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}


