/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Takuma Sato", "033333352");
        Reserva res1 = new Reserva("20-9-2025", "21:00");
        
        res1.setCliente(cli1);
        res1.mostrarReserva();
        
    }
    
    
}
