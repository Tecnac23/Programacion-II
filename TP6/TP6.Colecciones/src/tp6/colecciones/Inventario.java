/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.colecciones;

import java.util.ArrayList;

/**
 *
 * @author carne
 */
public class Inventario {
    private ArrayList<Producto> productos; // Asosciación de clase Inventario con Producto

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        if(p != null && !productos.contains(p)){
            this.productos.add(p);     
        }  
    }
    
    public void listarProductos(){
        if(productos.isEmpty()){
            System.out.println("No hay productos para mostrar.");
        } else {
            for (Producto producto : productos) {
                 producto.mostrarInfo(); 
            }
          } 
        }
    
    public void buscarProductoPorId(String id){
        Producto encontrarProducto = null;
        int i = 0;
        while(i < productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)){
            i ++;
        }
        if(i < productos.size()){
            encontrarProducto = this.productos.get(i);
            encontrarProducto.mostrarInfo();
        }else{
            System.out.println("El id ingresado no corresponde a un producto en la lista");
        }
        
        
    }
    
    public void eliminarProducto(String id){
        if(id != null){
            int i = 0;
            while(i < productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)){
                i++;  
            }
            if(i < productos.size()){
                Producto productoABorrar = productos.get(i);
                productos.remove(productoABorrar);
                System.out.println("!Se ha borrado de la lista al producto con id = " + productoABorrar.getId() + ", "+productoABorrar.getNombre()+ "!");
            }
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        if(id != null){
            int i = 0;
            while(i < productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)){
                i++;
            }
            if(i < productos.size()){
                productos.get(i).setCantidad(nuevaCantidad);    
            }
            System.out.println("Se ha actualizado el stock de " + productos.get(i).getNombre() + "; Nueva cantidad = " + nuevaCantidad + " unidades.");
        }   
    }
    
    public void filtarPorCategoria(CategoriaProducto categoria){
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCategoria() == categoria){
                productos.get(i).mostrarInfo();
            }
        }

    }
    
    public void obtenerTotalStock(){
        int acumulador = 0;
        for(Producto producto : productos){
            acumulador += producto.getCantidad();
        }
        System.out.println("El stock total disponible es = " + acumulador + " unidades.");   
    }
    
    public Producto obtenerProductoConMayorStock(){
            int stock = 0;
            Producto p = null;
            for(Producto producto : productos){
                if(producto.getCantidad() > stock){
                    stock = producto.getCantidad();
                    p = producto;
                }
            }
            return p;   
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        for(Producto p : productos){
            if(p.getPrecio() > min && p.getPrecio()< max ){
                p.mostrarInfo();
            }   
        }
    }
    
    public void mostrarCategoriasDisponibles(){
        CategoriaProducto[] categoria = CategoriaProducto.values();
        for (CategoriaProducto categoria1 : categoria) {
            System.out.println(categoria1 + "(" + categoria1.getDescripcion() + ")"); 
        }
    }
}