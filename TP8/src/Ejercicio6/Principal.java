/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

import Ejercicio4.Visorarchivo;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lectorarchivo va = new Lectorarchivo();
      
        va.leerArchivo("..");  //Ruta inexistente para generar el error
            
    }
    
}
