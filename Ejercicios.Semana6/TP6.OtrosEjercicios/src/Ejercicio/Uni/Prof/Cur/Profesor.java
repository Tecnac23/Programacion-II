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
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void agregarCurso(Curso curso){
        if(curso != null && !cursos.contains(curso)){
            cursos.add(curso);
            if(curso.getProfesor() != this){
                curso.setProfesor(this);
            }
                    
        }
    }
    
    public void eliminarCurso(Curso curso){
        if(curso != null && cursos.contains(curso)){
            cursos.remove(curso);
            if(curso.getProfesor() == this){
                curso.setProfesor(null);
            }
        }
    }
    
    public void mostrarInfo(){
        System.out.println("id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
    
    
}
