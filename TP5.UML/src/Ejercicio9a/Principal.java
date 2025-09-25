/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio9a;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Asociación unidireccional CitaMedica --> Paciente
        
        Paciente paciente1 = new Paciente("Gandalf el Gris", "La mágica");
        CitaMedica cita1 = new CitaMedica("26-06-2026", "16:21");
        
        cita1.setPaciente(paciente1);
        cita1.mostrarInformacion();
    }
    
}
