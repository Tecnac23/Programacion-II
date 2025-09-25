/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banco nacion = new Banco("Banco Nación", "30-23232323-9");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("23232323", "5-5-5000", nacion);
        
        tarjeta1.mostarEstado();
    }
    
}
