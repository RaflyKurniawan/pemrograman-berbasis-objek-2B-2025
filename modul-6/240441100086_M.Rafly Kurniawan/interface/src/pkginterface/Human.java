/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Rafly
 */
public class Human extends LivingThing implements Mamalia, Minds{
    @Override
    public void walk(){
        System.out.println("Manusia berjalan dengan dua kaki");
    }
    
    @Override
    public void characteristic(){
        System.out.println("Manusia itu berdarah panas dan juga melahirkan");
    }
    
    @Override
    public void mind(){
        System.out.println("Manusia selain mempunyai otak juga mempunyai akal");
    }
}
