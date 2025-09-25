/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Propietario prop1 = new Propietario("Alcor Noke", "321");
        Computadora compu1 = new Computadora("Asus", "45456");
        
        compu1.setPropietario(prop1);
        compu1.mostrarInfo();
        System.out.println(" ");
        prop1.mostrarInfo();
        
        
    }
    
}
