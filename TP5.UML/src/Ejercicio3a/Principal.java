/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo objetos para practicar
        Autor autor1 = new Autor("Joseph Conrad", "Polaco");
        Libro libro1 = new Libro("Victoria", "2345");
        
        libro1.setAutor(autor1);
        System.out.println(libro1.toString());
    }
    
}
