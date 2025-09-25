/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio9b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Asociación unidireccional CitaMédica --> Profesional
       
       Profesional prof1 = new Profesional("Henry Jeckyll", "Generalista");
       CitaMedica cita1 = new CitaMedica("26-06-2026", "1:30 AM");
       
       cita1.setProfesional(prof1);
       System.out.println(cita1.toString());
    }
    
    
}
