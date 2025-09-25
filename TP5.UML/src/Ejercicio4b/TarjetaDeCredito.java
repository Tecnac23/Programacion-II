/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4b;

import Ejercicio4a.Cliente;

/**
 *
 * @author carne
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void mostarEstado(){
        System.out.println("Número de tarjeta: "+ numero );
        System.out.println("Fecha de vencimiento: "+ fechaVencimiento );
        System.out.println("Banco/cuit: "+ banco.getNombre()+ " / "+banco.getCuit() );
    }
}
