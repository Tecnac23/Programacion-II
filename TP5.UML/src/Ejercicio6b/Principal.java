/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6b;

/**
 *
 * @author carné
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesaA = new Mesa(1,6);
        Reserva res1 = new Reserva("6-6-2026", "22:00", mesaA);
        
        System.out.println(res1.toString());
        
    }
    
}
