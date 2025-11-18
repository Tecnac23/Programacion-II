/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;


public class Cliente implements Notificable{ 
    private String nombre;
    private String apellido;
    private String nro_telefono;

    public Cliente(String nombre, String apellido, String nro_telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro_telefono = nro_telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNro_telefono() {
        return nro_telefono;
    }

    public void setNro_telefono(String nro_telefono) {
        this.nro_telefono = nro_telefono;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviar por whatsapp al número " + nro_telefono);
        System.out.println("Notificación para " + nombre + " " + apellido + ": " + mensaje);
    }
}
