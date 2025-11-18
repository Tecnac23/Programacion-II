/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author carne
 */
public class Mascota {
    private String nombre;
    private String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("El nombre de la mascota es " + nombre + ".");
        System.out.println("Tom tiene " + edad + " años de edad.");
        System.out.println("Tom pertenece a la especia "+ especie);
             
    }
    void cumplirAnios(int anios){
        edad += anios;
        System.out.println("Tom actualizó su edad");
        
    }
    
}
