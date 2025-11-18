/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio.Biblioteca;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author carne
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void agregarLibros(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros(){
        for(Libro libro : libros){
            libro.mostrarInfo();
        }
    }
    
    public void buscarLibroPorIsbn(String isbn){
        if(isbn != null){
            for(Libro libro : libros){
                if(libro.getIsbn().equalsIgnoreCase(isbn)){
                    System.out.println("El libro buscado es: ");
                    libro.mostrarInfo();  
                }
            }
        }         
    }
    
    public void eliminarLibro(String isbn){
        if (isbn != null){
            for(Libro libro : libros){
                if(libro.getIsbn().equalsIgnoreCase(isbn)){
                    libros.remove(libro); 
                }
            }
        }
    }
    
    public int obtenerCantidadLibros(){
        int contador = 0;
        for (Libro libro : libros) {
            contador += 1;
        }
return contador;
    }
    
    public void filtarLibrosPorAnio(int anio){
        for(Libro libro : libros){
            if(libro.getAnioPublicacion() == anio){
                libro.mostrarInfo();
            }
        }
        
        
    }
    
    public void mostrarAutoresDisponibles(){
        for(Libro libro : libros){
            System.out.println("Autor: " + libro.getAutor().getNombre());
        }
    }
}
