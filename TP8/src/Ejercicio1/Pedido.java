/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Pedido implements Pagable{
    
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "En proceso";
        this.cliente = cliente;
    }

    
    
    public void agregarPedido(Producto p){
        if(productos.contains(p)){
            System.out.println("El producto " + p + " ya fue agregado");
            
    }else{
            productos.add(p);
            System.out.println("Se agregó al carrito " + p.getNombre() + "; costo $ " + p.getPrecio());
        }
        
    }
    
    @Override
    public double calcularTotal(){
        double total = 0;
        for(Producto p : productos ){
            total += p.getPrecio();
        }
        return total;
        
    }
    
    public void cambiarEstado(String estadoFinal) {
        this.estado = estadoFinal;
        // Notificar al cliente cuando cambia el estado
        cliente.notificar("El pedido cambió a estado: " + estadoFinal);
    }
    
    
    
}
