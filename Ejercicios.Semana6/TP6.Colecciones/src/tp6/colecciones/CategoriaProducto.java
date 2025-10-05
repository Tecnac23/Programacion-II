/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.colecciones;

/**
 *
 * @author carne
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"), 
    ELECTRONICA("Dispositivos electr�nicos"), 
    ROPA("Prendas de vestir"), 
    HOGAR("Art�culos para el hogar");
    
    private final String descripcion;

    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
 