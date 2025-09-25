/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7b;

/**
 *
 * @author carne
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo mov;
    
    public Conductor(String nombre, String licencia){
        this.licencia = licencia;
        this.nombre =  nombre;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getMov() {
        return mov;
    }

    public void setMov(Vehiculo mov) {
        this.mov = mov;
        if(mov!= null && mov.getConductor()!= this){
            mov.setConductor(this);       
        }
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + ", mov=" + mov.getPatente() + '}';
    }
    
    
    
    
    
}
