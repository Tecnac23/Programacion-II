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
        
       NaveEspacial lanave = new NaveEspacial();
       
       lanave.setNombre("lanave");
 
       lanave.avanzar(60);
       lanave.recargarCombustible(100);
       lanave.avanzar(120);
       lanave.mostrarEstado();
       
    } 
}
