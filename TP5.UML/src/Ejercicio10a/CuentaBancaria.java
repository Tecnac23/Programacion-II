/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10a;

/**
 *
 * @author carne
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion){
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
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

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave.getCodigo()+ ", última modificación: "+clave.getUltimaModificacion() + '}';
    }
    
    
}
