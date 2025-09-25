/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5b;

/**
 *
 * @author carne
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;
    
    public Propietario(String nombre, String dni){
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora!= null && computadora.getPropietario()!= this){
            computadora.setPropietario(this);
            
        }
    }
    public void mostrarInfo(){
        System.out.println("Propietario: " + nombre+ ", DNI: "+ dni);
        System.out.println("Computadora: " + computadora.getMarca()+ ", Numero de Serie: "+ computadora.getNumeroSerie());
    
    }
}