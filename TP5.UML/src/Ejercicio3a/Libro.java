/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3a;

/**
 *
 * @author carne
 */
public class Libro {
    
    // Relación de asociación unidireccional Libro --> Autor
    
    private String titulo;
    private String isbn;
    private Autor autor;
    
    public Libro(String titulo, String isbn){
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor= " + autor.getNombre() + ", Nacionalidad: " + autor.getNacionalidad() + '}';
    }
    
    
}
