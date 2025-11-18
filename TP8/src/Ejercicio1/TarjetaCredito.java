/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class TarjetaCredito implements PagoConDescuento {
    
    // esta clase se encarga de los pagos cuando hay descuento
    
    private String nombre_tarjeta;

    public TarjetaCredito(String nombre_tarjeta) {
        this.nombre_tarjeta = nombre_tarjeta;
    }
    
    public void TarjetaCredito(String nombre_tarjeta) {
        this.nombre_tarjeta = nombre_tarjeta;
    }

    @Override
    public double aplicarDescuento(double total) {
        System.out.println("Se aplica un 5% de descuento por pago con tarjeta " + nombre_tarjeta);
        return total - (total * 0.05);
    }

    @Override
    public void procesarPago(double total) {
        System.out.println("El total a abonar es de: $" + total );
    }
    
}
