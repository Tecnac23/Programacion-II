/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Relacion de Asociacion bidireccional entre CuentaBancaria --> Titular
        
        CuentaBancaria cuenta1 = new CuentaBancaria("00212151", 125455.3);
        Titular titular1 = new Titular("Enzo Perez", "31652985");
        
        titular1.setCuenta(cuenta1);
        
        System.out.println(titular1.toString());
        System.out.println(cuenta1.toString());
        
    }
    
}
