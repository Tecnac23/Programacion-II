/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;


public class Auto extends Vehiculo{
    private String cantidadPuertas;

    public Auto(String marca, String modelo, String cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Auto marca: " + super.getMarca());
        System.out.println("Auto modelo: " + super.getModelo());
        System.out.println("Cantidad de pueras: " + cantidadPuertas);
        
    }
    
}
