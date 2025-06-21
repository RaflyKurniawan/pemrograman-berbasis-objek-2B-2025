public class Manusia{
    public void berbicara(){
        System.out.println("Manusia berbicara.");
    }
    public void bekerja(){
        System.out.println("Manusia Bekerja.");
    }
    public void makan(){
        System.out.println("Manusia Makan");
    }
}

class Joko extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Joko berbicara dengan sopan.");
    }
    
    @Override
    public void bekerja(){
        System.out.println("Joko bekerja sebagai petani.");
    }
    
    @Override
    public void makan(){
        System.out.println("Joko makan nasi dengan lauk sederhana.");
    }
}

class Beni extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Beni berbicara dengan cepat.");
    }
    
    @Override
    public void bekerja(){
        System.out.println("Beni bekerja sebagai programmer.");
    }
    
    @Override
    public void makan(){
        System.out.println("Beni suka makan makanan cepat saji.");
    }
}

class Fani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Fani berbicara dengan lembut.");
    }
    
    @Override
    public void bekerja(){
        System.out.println("Fani bekerja sebagai guru.");
    }
    
    @Override
    public void makan(){
        System.out.println("Fani menyukai makanan yang sehat.");
    }
}

class Jani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Jani berbicara dengan percaya diri.");
    }
    
    @Override
    public void bekerja(){
        System.out.println("Jani bekerja sebagai desainer");
    }
    
    @Override
    public void makan(){
        System.out.println("Jani suka makan makanan tradisional.");
    }
}

