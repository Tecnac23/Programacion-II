/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio14b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dependencia de creación EditorVideo crea a un objeto de la clase Render
        Proyecto proyecto1 = new Proyecto("Aprender a programar", "Mucho tiempo");
        
        EditorVideo editor1 = new EditorVideo();
        
        editor1.exportar("El render que sea", proyecto1);
    }
    
}
