/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author carne
 */
public class FormatException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre comillas (como si fuera un dato de tipo String): ");
        String entrada = input.nextLine(); // lo que ingrese el usuario entre comillas será tomado como un valor de tipo String

        try {
            int nro = Integer.parseInt(entrada); // trata de convertir un tipo de dato String a entero
            System.out.println("El número es: " + nro);

        } catch (NumberFormatException ne) {
            System.out.println("Error!, no puede convertirse a tipo de dato entero. / " + ne.getMessage());
        }

        System.out.println("Gracias");
    }

}


