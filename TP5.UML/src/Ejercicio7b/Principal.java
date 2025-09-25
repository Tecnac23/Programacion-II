/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo movil1 = new Vehiculo("TRE1234567", "Sedán");
        Conductor piloto1 = new Conductor("Junafer Quintero", "No_tiene");
        
        piloto1.setMov(movil1);
        
        System.out.println(piloto1.toString());
        System.out.println(movil1.toString());
        
        
    }
    
}
