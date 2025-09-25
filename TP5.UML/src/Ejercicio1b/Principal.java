/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1b;

/**
 *
 * @author carné
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancio titulares para hacer pruebas
        Titular pers1 = new Titular("Ignacio Carné" , "25002007");
        Titular pers2 = new Titular("María Perez", "28986988");
        
        // Instancio pasaportes para hacer pruebas
        Pasaporte pass1 = new Pasaporte("A323", "15-9-2025");
        Pasaporte pass2 = new Pasaporte("B789", "11-9-2025");
        
        
        // Agrego acciones de prueba
        
        // le asigno un pasaporte a pers1
        pers1.setPasaporte(pass1);
        //pass1.setTitular(pers1);
        
        // Con la asignación anterior y por la validación de los setters, obtengo las dos impresones
        System.out.println(pers1.getPasaporte().getNumero());
        System.out.println(pass1.getTitular().getNombre());
    }
    
}
