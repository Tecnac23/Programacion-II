/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bat1 = new Bateria("Super", 450);
        Celular cel1 = new Celular("FDF453F4", "Sancho", "Panza", bat1);
        
        System.out.println(cel1.toString());
        
    
        
        
    }
    
}
