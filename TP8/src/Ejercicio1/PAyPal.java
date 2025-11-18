/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class PAyPal implements Pago { 
    // clase que se encarga de pagar cuando no hay descuento
    @Override
    public void procesarPago(double total) {
        System.out.println("Procesando pago por PayPal de: $" + total);
    }
    
}
