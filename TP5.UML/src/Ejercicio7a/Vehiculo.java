/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7a;

/**
 *
 * @author carne
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    
    public Vehiculo(String patente, String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor tipo/Nº serie= " + motor.getTipo()+" / "+motor.getNumeroSerie()  + '}';
    }
    
    
    
}
