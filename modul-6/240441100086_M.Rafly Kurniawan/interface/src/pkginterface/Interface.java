/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Rafly
 */

public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        
        
        System.out.println("Karakteristik Manusia : ");
        human.walk();
        human.characteristic();
        human.mind();
        human.sleep();
        human.eat();
        
        System.out.println();
        
        System.out.println("Karakteristik Kucing : ");
        cat.walk();
        cat.characteristic();
        cat.eat();
        cat.sleep();
    }
    
}


