/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Composicion enntre clases CuentaBancaria --> ClaveSaldo
        
        CuentaBancaria cuenta1 = new CuentaBancaria("00112212121255464654", 2356.54, "elcodigodavinci", "26-06-2026");
        
        System.out.println(cuenta1.toString());
       
    }
    
}
