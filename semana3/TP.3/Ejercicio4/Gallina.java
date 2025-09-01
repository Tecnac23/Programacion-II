/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author carne
 */
public class Gallina {
    private int  edad, huevosPuestos, idGallina;

//    public int getIdGallina() {
//        return idGallina;
//    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    
    
    void ponerHuevo(int puesta){
        huevosPuestos += puesta;
        
    }
    
    void envejecer(int n){
        edad += n;    
    }
    
    void mostrarEstado(){
        
        System.out.println("edad: " + getEdad());
        System.out.println("La cantidad de huevos puestos es: " + getHuevosPuestos());
        
        
    }
 
    
}
