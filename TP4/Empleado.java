/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.TP4;

/**
 *
 * @author carné
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int contador = 1000; // variable creada para generar id automático
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id= id;
        setNombre(nombre);
        setPuesto(puesto);
        this.salario = salario;
        totalEmpleados ++ ;
    }
    
    public Empleado(String nombre, String puesto){
        this(idAutomatico(), nombre, puesto, 1020000);
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;    
        }    
    }

    public void setPuesto(String puesto) {
        if((puesto.equalsIgnoreCase("Oficina"))|| (puesto.equalsIgnoreCase("Planta"))){
            this.puesto = puesto;
        }       
    }

    
    // Método para generar ID automático
    static int idAutomatico(){
        return contador++;
    }
    
    // Actualiza el salario a los empleados de planta
    public void actualizarSalario(int porcentaje){
        salario = salario + (salario*(porcentaje/100.0)); 
        
    }
    
    // Actualiza el salario a los empleados de oficina
    public void actualizarSalario(double cantidad){
        salario = salario + cantidad;
    }

    @Override
    public String toString(){
        return "id: "+ id +" "+ "Nombre: " + nombre +" "+ "Puesto: " + puesto +" "+ "Salario: " + salario + " pesos.";   
    }
    
    static int mostrarTotalEmpleados(){
        return getTotalEmpleados();
    }
    
    
    
}
