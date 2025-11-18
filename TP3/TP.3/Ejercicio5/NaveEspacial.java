/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author carne
 */
public class NaveEspacial {
    
    static private String nombre;
    static private double combustible = 50.0;

    public static void setNombre(String nombre) {
        NaveEspacial.nombre = nombre;
    }
    
    public static String getNombre() {
        return nombre;
    }
     
    static void despegar(){
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("¡¡Despegue!!");
              
    }
    
    static void avanzar(double distancia){
        if (combustible >= distancia){
            System.out.println("La nave ha avanzado " + distancia + " kilómetros.");
            combustible -= distancia;
        }else System.out.println("Combustible insuficiente para avanzar");
        
        
    }
    
    static void recargarCombustible(double cantidad){   // tengo la duda si este 
                                                        // método podría ser un setter 
                                                        // de combustible.*\
        if((cantidad > 0) && (cantidad + combustible) < 200){
            
            combustible += cantidad;
            System.out.println("Se ha recargado combustible");
            
        }
       
    }
    
    static void mostrarEstado(){
        if(combustible > 0){
            despegar(); 
        }
        
        System.out.println("El nombre de la nave espacial es: " + "\"" +getNombre()+ "\"");
        System.out.println("Combustible= " + combustible + " litros.");
        
        
    }
    
}
