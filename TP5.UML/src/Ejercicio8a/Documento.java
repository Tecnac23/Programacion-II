/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8a;

/**
 *
 * @author carne
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    
    public Documento(String titulo, String contenido, String codigo, String fecha){
        this.contenido = contenido;
        this.titulo = titulo;
        this.firma = new FirmaDigital(codigo, fecha);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", Código hash= " + firma.getCodigo()+ ", fecha= "+ firma.getFecha() + '}';
    }
    
    
    
    
}
