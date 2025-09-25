/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3b;

/**
 *
 * @author carné
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Uso de las clases con objetos
        
        Editorial editorial1 = new Editorial("La Publicadora", "Salta 1991, Rosario");
        Libro libro1 = new Libro("Esa extraña Locura", "345678", editorial1);
        
        System.out.println(libro1.toString());
    }
    
}
