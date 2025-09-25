/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5b;

import Ejercicio5a.PlacaMadre;

/**
 *
 * @author carne
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    
    public Computadora(String marca, String numeroSerie){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
    }    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora()!=this){
            propietario.setComputadora(this);
            
        }
    }
    public void mostrarInfo(){
        System.out.println("Compu:" + marca + ", número de Serie: "+ numeroSerie);
        System.out.println("Propietario:" + propietario.getNombre()+ ", DNI: "+ propietario.getDni());
    }
    
 }
    
   
