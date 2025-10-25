/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Circulo c1 = new Circulo(12.6, "Plato");
        Circulo c2 = new Circulo(3.0, "Mango sartén");
        Rectangulo r1 = new Rectangulo(23,16,"Fuente lasagna");
        Rectangulo r2 = new Rectangulo(32,47,"Monitor");
        
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);
        
        for (Figura f : figuras){
            f.calcularArea();
        }
        
    }
    
}
