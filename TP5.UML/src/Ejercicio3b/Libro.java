/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3b;

import Ejercicio3a.Autor;

/**
 *
 * @author carne
 */
public class Libro {
    // Relación de agregación Libro --> Editorial
    
    private String titulo;
    private String isbn;
    private Editorial editorial;
    
    public Libro(String titulo, String isbn, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void setAutor(Editorial editorial){
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", editorial= " + editorial.getNombre() + ", dirección: " + editorial.getDireccion() + '}';
    }
    
    
}
