/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13b;

/**
 *
 * @author carne
 */
public class GeneradorQR {
    
    
    public static void generar(String valor, String nombre, String email){
        Usuario usuario1 = new Usuario(nombre, email);
        
        CodigoQR codigo1 = new CodigoQR(valor);
        System.out.println("Nombre usuario= "+ usuario1.getNombre()+ "; email= "+ usuario1.getEmail());
        System.out.println("El valor del codigo QR= "+ codigo1.getValor());
    }
    
    
}
