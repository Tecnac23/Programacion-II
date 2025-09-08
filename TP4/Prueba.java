/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.TP4;

import java.util.Scanner;

/**
 *
 * @author carné
 */
public class Prueba {
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado(1, "Juan", "Oficina", 1000000);
        Empleado empleado2 = new Empleado("Pedro", "Planta");
        Empleado empleado3 = new Empleado("Pablo", "Planta");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(Empleado.mostrarTotalEmpleados());
        System.out.println(" ");
        
        empleado1.actualizarSalario(20000.0);
        empleado2.actualizarSalario(5);
        empleado3.actualizarSalario(5);
        System.out.println(" ");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(Empleado.mostrarTotalEmpleados());
        
        
        
       
    } 
    
}
