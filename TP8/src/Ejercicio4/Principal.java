/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;


import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author carné
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Visorarchivo va = new Visorarchivo();
      
        try {
            va.leerArchivo("..");
        } catch (FileNotFoundException fnf) {
            System.out.println("No se encuentra el archivo");
          
        } catch (IOException io){
            System.out.println("Error de IO");
        }
            
    }
}
