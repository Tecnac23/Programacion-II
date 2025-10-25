/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;

public class Principal {

   
    public static void main(String[] args) {
        ArrayList<Animal> animales = new Animal<> (); // vuelve a dar este error, no sé por qué.
        
        animales.add(Tom);
        animales.add(Perci);
        animales.add(Josefa);
        
        
        Perro Tom = new Perro();
        Gato Perci = new Gato();
        Vaca Josefa = new Vaca();
        
        Tom.hacerSonido();
        Perci.hacerSonido();
        Josefa.hacerSonido();
        
        
    }
    
}
