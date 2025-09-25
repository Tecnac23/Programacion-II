/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2b;

import Ejercicio2a.Bateria;

/**
 *
 * @author carne
 */
public class Celular {
    
    // Relación de asociación bidireccional con Usuario
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    
    
    public Celular (String imei, String marca, String modelo){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
        
    
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", usuario= " + usuario.getNombre()+ " Dni: " + usuario.getDni() + '}';
    }

    
    
}
