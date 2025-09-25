/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio12a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Relación de asociación unidereccional Impuesto --> Contribuyente
        Contribuyente cont1 = new Contribuyente("Notorio Pago", "23-56565-989");
        Impuesto inmobiliario1 = new Impuesto(30000);
        
        inmobiliario1.setCont(cont1);
        inmobiliario1.mostrarDatos();
    }
    
}
