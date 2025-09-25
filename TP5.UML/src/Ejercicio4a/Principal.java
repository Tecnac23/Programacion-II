/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("343434", "23-4-2350");
        Cliente cliente1 = new Cliente("José Carlos Trellez", "43434343434");
        
        cliente1.setTarjetaDeCredito(tarjeta1);
        
        
        
    }
    
}
