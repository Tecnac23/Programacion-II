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
        
        Gallina gala = new Gallina();
        Gallina gali = new Gallina();
        
        gala.ponerHuevo(gala.getHuevosPuestos(2));
        gala.mostrarEstado();
        gali.ponerHuevo(gali.getHuevosPuestos(6));
     
    } 
}
