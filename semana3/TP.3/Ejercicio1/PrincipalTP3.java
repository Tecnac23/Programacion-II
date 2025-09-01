/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author carne
 */
public class PrincipalTP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre = "Ignacio";
        estudiante1.apellido = "Carné";
        estudiante1.curso= "Programación2";
        estudiante1.calificacion = 93.5;
        
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(2);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo();
       
    }
    
}
