/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2a;

/**
 *
 * @author carne
 */
public class Celular {
    // Relación de agregación con Bateria
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    
    
    public Celular (String imei, String marca, String modelo, Bateria bateria){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria.getModelo()+ " " + bateria.getCapacidad() + " mA de capacidad"  + '}';
    }
 }
    
