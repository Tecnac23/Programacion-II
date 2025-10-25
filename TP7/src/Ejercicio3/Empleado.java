/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public abstract class Empleado {
    
    private String nombre;
    private String apellido;
    private String tipoEmpleado;

    public Empleado(String nombre, String apellido, String tipoEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", tipoEmpleado=" + tipoEmpleado + '}';
    }
   
    public double calcularSueldo(Empleado e){
        if(e instanceof EmpleadoPlanta){
            return 1200000.0;
        }else if(e instanceof EmpleadoTemporal){
            return 800000.0;    
        }else{
            return 0.0;
        }
    }
    
}
