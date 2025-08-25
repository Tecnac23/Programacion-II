/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTP2;

import java.util.Scanner;

/**
 *
 * @author carne
 */
public class Ejercicio12{
    
    // static double costoEnvio;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int peso;
        String zona;
        double precioProducto;
        
        System.out.print("Ingrese el peso del paquete en Kg: ");
        peso = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional ó Internacional): ");
        zona = input.nextLine();
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        calcularTotalCompra(precioProducto, costoEnvio(peso, zona));
  
}
    
    static void calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalAPagar;
        
        totalAPagar = precioProducto + costoEnvio;
        
        System.out.println("El total a pagar es " + totalAPagar + " pesos.");
               
    }
    
    static double costoEnvio(double peso, String zona){
        
        String nacional = "Nacional";
        double costoEnvio = 0;
        String internacional = "Internacional";
        
        if(zona.equalsIgnoreCase(internacional)){
            costoEnvio = peso*10;
        }else if (zona.equalsIgnoreCase(nacional)){
            costoEnvio = peso*5;   
        }
        return costoEnvio;
    }
        
    
}
