/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio12b;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dependencia de Uso Calculadora --> Impuesto
        Impuesto impuesto1 = new Impuesto(30000);
        Calculadora.calcular(impuesto1);
    }
    
}
