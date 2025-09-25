/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7b;

import Ejercicio7a.Motor;

/**
 *
 * @author carne
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    
    public Vehiculo(String patente, String modelo){
        this.modelo = modelo;
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor!=null && conductor.getMov()!= this)
        conductor.setMov(this);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", conductor=" + conductor.getNombre()+ '}';
    }
    
    
    
}
