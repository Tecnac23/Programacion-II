         /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Agregación FirmaDigital --> Ususario
        
        Usuario usu1 = new Usuario("Milton Casco", "soymilton@river.mundial");
        FirmaDigital lafirma = new FirmaDigital("0cc175b9c0f1b6a831c399e269772661", "06-06-2026", usu1);
        
        System.out.println(lafirma.toString());
    }
    
}
