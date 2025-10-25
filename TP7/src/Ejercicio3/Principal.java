/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        //ArrayList<Empleado> empleados = new Empleado<>();  Me da un error cuando creo qesta sentencia
        
        EmpleadoPlanta ep1 = new EmpleadoPlanta("Jorge", "Gordillo", "Planta");
        EmpleadoPlanta ep2 = new EmpleadoPlanta("Alejandro", "Montenegro", "Planta");
        EmpleadoPlanta et1 = new EmpleadoPlanta("Nelson", "Gutierrez", "Temporal");
        EmpleadoPlanta et2 = new EmpleadoPlanta("Oscar", "Ruggeri", "Temporal");
        
//        empleados.add(ep1);
//        empleados.add(ep2);
//        empleados.add(et1);
//        empleados.add(et2);
        
        System.out.println("El empleado "+ ep1 + "cobra" + ep1.calcularSueldo(ep1));
        System.out.println("El empleado "+ ep2 + "cobra" + ep2.calcularSueldo(ep2));
        System.out.println("El empleado "+ et1 + "cobra" + ep1.calcularSueldo(et1));
        System.out.println("El empleado "+ et2 + "cobra" + ep1.calcularSueldo(et2));
        
        
    }
    
}
