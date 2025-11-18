/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio.Uni.Prof.Cur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author carne
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return Collections.unmodifiableList(profesores);
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }
    
    public void agregarProfesores(Profesor p){
        if(p != null){
            profesores.add(p);
        }
    }
    
    public void agregarCursos(Curso c){
        if(c != null){
            cursos.add(c);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profeEncontrado = null;
        if(codigoCurso != null && idProfesor != null){
            for(Profesor profesor : profesores){
                if(profesor.getId().equalsIgnoreCase(idProfesor)){
                    profeEncontrado = profesor;
                }
            }
            for(Curso curso : cursos){
                         if(curso.getCodigo().equalsIgnoreCase(codigoCurso)){
                            curso.setProfesor(profeEncontrado);    
                     }
                 }
            
        }
        
    }
    public Profesor buscarProfesorPorid(String id){
        if(id != null){
            for(Profesor profesor : profesores){
                if(profesor.getId().equalsIgnoreCase(id)){
                    return profesor;
                }
            }
        }
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        if(codigo != null){
            for(Curso curso : cursos){
                if(curso.getCodigo().equalsIgnoreCase(codigo)){
                    return curso;
                }
            }
        }
    }
    
    public void eliminarCurso(String codigo){
        if(codigo != null){
            for(Curso curso : cursos){
                if(curso.getCodigo().equalsIgnoreCase(codigo)){
                    cursos.remove(curso);
                }
            }  
        }
    }
    
    public void eliminarProfesor(String id){
        if(buscarProfesorPorid(id) != null && profesores.contains(buscarProfesorPorid(id))){
            profesores.remove(buscarProfesorPorid(id));
            if(buscarProfesorPorid(id).getCursos() == this){
                buscarProfesorPorid(id).
            }
        }
        
    }
}
