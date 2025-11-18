/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class PayPal implements Pago { 
    
    private String acceso;

    public PayPal(String acceso) {
        this.acceso = acceso;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }
    
    
    
    // clase que se encarga de pagar cuando no hay descuento
    @Override
    public void procesarPago(double total) {
        System.out.println("Procesando pago por PayPal de: $" + total);
    }
    
}
