/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1a;

/**
 *
 * @author carne
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato){
        this.fechaEmision = fechaEmision;
        this.numero = numero;
        this.foto = new Foto(imagen, formato);
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void mostrarInfo(){
        System.out.println("Los datos del pasaporte son: ");
        System.out.println("Número de pasaporte: " + numero);
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Foto: " + foto.getImagen() + foto.getFormato());
    }
    
    
}
