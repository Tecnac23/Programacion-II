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
        
       Libro libro_A = new Libro();
        System.out.println(libro_A.getAnioPublicacion());
        libro_A.setAnioPublicacion((-1995));
        System.out.println(libro_A.getAnioPublicacion());
        libro_A.setAnioPublicacion((1889));
        System.out.println(libro_A.getAnioPublicacion());
        
        
        
       
    } 
}
