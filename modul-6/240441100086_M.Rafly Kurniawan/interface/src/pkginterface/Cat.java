/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Rafly
 */
public class Cat extends LivingThing implements Mamalia  {
    @Override
    public void walk(){
        System.out.println("Kucing berjalan dengan empat kaki");
    }
    
    @Override
    public void characteristic(){
        System.out.println("Kucing itu mamalia, kucing berdarah panas dan menyusui");
    }
    
}
