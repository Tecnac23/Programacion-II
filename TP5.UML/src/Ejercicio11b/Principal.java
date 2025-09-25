/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11b;

/**
 *
 * @author carné
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dependenca de uso Reproductor usa Cancion
        
        Cancion cancion1 = new Cancion("Juan y José");
        
        Reproductor.reproducir(cancion1);
    }
    
}
