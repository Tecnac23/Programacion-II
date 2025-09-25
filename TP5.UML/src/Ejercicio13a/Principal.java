/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio13a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Relacion de asociación CodigoQR --> Usuario
        Usuario usuario1 = new Usuario("Axel Heyst", "isla@pacifico.com");
        CodigoQR codigo1 = new CodigoQR("Gracias....vuelvan pronto");
        
        codigo1.setUsuario(usuario1);
        codigo1.mostrarInformacion();
    }
    
}
