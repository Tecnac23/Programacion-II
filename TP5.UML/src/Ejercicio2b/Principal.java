/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Genero objetos para practicar
        Usuario usu1 = new Usuario("Melchor", "1");
        Celular celu1 = new Celular("ERREMANDIOCA32", "Yoni", "Crack");
        
        celu1.setUsuario(usu1);
        
        System.out.println(celu1.toString());
        System.out.println(usu1.toString());
        
        
    }
    
}
