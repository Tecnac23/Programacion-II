/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nro1, nro2, r;  /*en un primer intento declaré las variables 
                            como double pero no funciona. El catch no toma la excepción*/
        System.out.print("Ingrese el número dividendo: ");
        nro1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el número divisor: ");
        nro2= Integer.parseInt(input.nextLine());
        
   
        try {
        r = nro1/nro2;
        System.out.println("El resultado de la división es: " + r);
        
        }catch(ArithmeticException ar) {
            
            System.out.println("Error!, no se puede dividir por cero " + ar.getMessage());
           
        }finally{
            System.out.println("Siempre el núemro divisor debe ser diferente de cero");
}
       
       
    
    }
    
}
