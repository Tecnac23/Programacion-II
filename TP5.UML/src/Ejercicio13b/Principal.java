/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio13b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dependencia de creación GeneradorQR.generar(String, Usuario usuario)
        
        GeneradorQR generador1 = new GeneradorQR();
        
        // no se si funcona asi, ya que en la practica se nombra
        GeneradorQR.generar("No lo tengo claro, todavia", "Pomelo", "estrellade@rock.com");
        
        // o se utiliza asi, como se muestra en un video
        generador1.generar("No lo tengo claro, todavia", "Pomelo", "estrellade@rock.com");

        // ¿Cual es la diferencia entre las dos lla madas a generar()
    }
    
}
