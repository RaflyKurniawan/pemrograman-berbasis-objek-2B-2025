/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Rafly
 */
public abstract class LivingThing {
    public void eat(){
        System.out.println("Dimakan");
    }
    
    public void sleep(){
        System.out.println("Tertidur");
    }
    
    public abstract void walk();
}
