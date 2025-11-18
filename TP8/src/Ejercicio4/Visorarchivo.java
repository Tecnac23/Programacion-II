/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author carne
 */
public class Visorarchivo {
    
    public void leerArchivo(String ruta) throws FileNotFoundException, IOException {
        File miarchivo = new File(ruta); 
        BufferedReader lb = new BufferedReader(new FileReader(miarchivo));
        System.out.println(lb.readLine());
    }
    
}    
  
