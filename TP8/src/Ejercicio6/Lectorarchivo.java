/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Lectorarchivo {
    
    public void leerArchivo(String ruta)  {
        File miarchivo = new File(ruta); 
        
        try (BufferedReader lb = new BufferedReader(new FileReader(miarchivo));){
            // al encerrar los recursos abiertos dentro de los paréntesis, no hace falta la clausula finlly para cerrar el recurso.
            
            System.out.println(lb.readLine());
        } catch (IOException io){
            System.out.println("Error de tipo in/out " + io.getMessage());
            
        }
           
        
    }
    
}
