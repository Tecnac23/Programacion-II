/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author carne
 */
public class PrincipalTP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mascota perrito = new Mascota();
        perrito.nombre = "Tom";
        perrito.especie ="Canis lupus familiaris";
        perrito.edad = 8;
        
        perrito.mostrarInfo();
        System.out.println("");
        perrito.cumplirAnios(1);
        perrito.mostrarInfo();
    } 
}
