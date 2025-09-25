/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14b;

/**
 *
 * @author carne
 */
public class EditorVideo {
    
    public static void exportar(String formato, Proyecto proyecto){
        Render ren1 = new Render (formato);
        
        System.out.println(" El proyecto se llama "+ proyecto.getNombre()+ "y dura: "+ proyecto.getDuracionMin());
        System.out.println(" El formato del render es "+ "\"" + ren1.getFormato()+ "\"");
      
    }
    
}
