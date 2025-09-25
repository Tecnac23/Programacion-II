/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancio un Pasaporte
        Pasaporte pass1 = new Pasaporte("ARG340", "15-9-2025", "miimagen", ".jpg");
        
        pass1.mostrarInfo();
    }
    
}
