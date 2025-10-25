/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

public class Circulo extends Figura{
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    
    
    @Override
    public void calcularArea(){
        
        System.out.println("El área del círculo de radio " + this.radio + " es: " + (radio*radio)*3.14);
        
    }
}
