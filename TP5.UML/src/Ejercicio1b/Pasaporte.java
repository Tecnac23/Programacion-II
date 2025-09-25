/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1b;

import Ejercicio1a.Foto;

/**
 *
 * @author carne
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision){
        this.fechaEmision = fechaEmision;
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte()!= this){
            titular.setPasaporte(this);
            
        }
    }
    
    
    
  
    
    
}
