/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4b;

/**
 *
 * @author carné
 */
public class Banco {
    private String nombre;
    private String cuit;
    
    public Banco(String nombre, String cuit){
        this.cuit = cuit;
        this.nombre = nombre;
    }                                      

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    
}
