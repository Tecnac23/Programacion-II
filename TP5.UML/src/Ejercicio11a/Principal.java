/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11a;

/**
 *
 * @author carné
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Relación de Asociación Cancion --> Titulo
        Artista artista1 = new Artista("Joan Manuel Serrat", "Nova");
        Cancion cancion1 = new Cancion("Juan y José");
        
        cancion1.setArtista(artista1);
        
        cancion1.mostarInforamcion();
    }
    
}
