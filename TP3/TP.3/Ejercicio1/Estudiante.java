/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author carne
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println("Los datos del estudiante son: ");
        System.out.print("Nombre: " + nombre + "\n" + 
                "Apellido: " + apellido + "\n" +  "Curso: " 
                + curso + "\n" + "calificación: " + 
                calificacion + "\n");
        
        
    }
    
    void subirCalificacion(double puntos){
        calificacion += puntos;
        
    }
    
    void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
 
}
