/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10b;

import Ejercicio10a.ClaveSeguridad;

/**
 *
 * @author carne
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this){
            titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + titular.getNombre()+ ", DNI= "+ titular.getDni() + '}';
    }
    
    
    
    
    
}
