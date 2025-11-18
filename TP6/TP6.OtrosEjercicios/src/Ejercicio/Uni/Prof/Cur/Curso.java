/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio.Uni.Prof.Cur;

/**
 *
 * @author carne
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p){
        if(this.profesor == profesor){
            return;
        }
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = profesor;
        
        if(profesor != null && !profesor.getCursos().contains(p)){
            profesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre curso " + nombre);
        System.out.println("Código curso " + codigo);
        System.out.println("Nombre profesor " + profesor.getNombre());
    }
    
    
    
    
}
