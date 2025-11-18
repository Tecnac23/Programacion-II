/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio.Uni.Prof.Cur;

import java.util.List;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancio 3 profesores
        Profesor profe1 = new Profesor("001", "Porthos", "Estadística");
        Profesor profe2 = new Profesor("002", "Athos", "Bases de datos");
        Profesor profe3 = new Profesor("003", "Aramis", "Programación");
        
        // Instancio 5 cursos
        Curso curso1 = new Curso("11", "Bases de datos");
        Curso curso2 = new Curso("12", "Estadística");
        Curso curso3 = new Curso("13", "Progamación");
        Curso curso4 = new Curso("14", "Inglés");
        Curso curso5 = new Curso("15", "Legales");
        
        // Instancio 1 universidad
        Universidad uni = new Universidad("Del conocimento nuevo");
        
        // Agrego Profesores a la unversidad uni
        uni.agregarProfesores(profe1);
        uni.agregarProfesores(profe2);
        uni.agregarProfesores(profe3);
        
        // Agrego cursos a la universidad uni
        uni.agregarCursos(curso1);
        uni.agregarCursos(curso2);
        uni.agregarCursos(curso3);
        uni.agregarCursos(curso4);
        uni.agregarCursos(curso5);
        
        // Muestro Profesores y  Cursos de la uni
        List<Profesor> lista = uni.getProfesores();
        System.out.println(lista);
          
        // asigno Profesor a curso
        uni.asignarProfesorACurso("11", "001");
      
        // buscar un profesor por su id
        uni.buscarProfesorPorid("001");
        
        // buscar un curso por su código
        uni.buscarCursoPorCodigo("11");
        
        // no me salieron los métodos asignar profesor a curso
        // eliminar Profesor
        
        
        
        
        
    }
    
}
