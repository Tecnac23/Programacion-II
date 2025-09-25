/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor1 = new Motor("1.6 H4M", "A1234");
        Vehiculo mov1 = new Vehiculo("KFR 236", "Sandero", motor1);
        
        System.out.println(mov1.toString());
    }
    
}
