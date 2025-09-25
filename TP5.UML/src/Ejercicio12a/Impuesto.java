/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12a;

/**
 *
 * @author carne
 */
public class Impuesto {
    private double monto;
    private Contribuyente cont;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getCont() {
        return cont;
    }

    public void setCont(Contribuyente cont) {
        this.cont = cont;
    }
    
    public void mostrarDatos(){
        System.out.println("Monto del impuesto es de " + monto + " pesos y el Contribuyente es "+ cont.getNombre());
    }
}
