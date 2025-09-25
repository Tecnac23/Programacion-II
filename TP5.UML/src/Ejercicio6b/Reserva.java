/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6b;

/**
 *
 * @author carne
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    
    public Reserva(String fecha, String hora, Mesa mesa){
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa Nº/capacidad= " + mesa.getNumero() +"/" + mesa.getCapacidad()+ '}';
    }
    
    
    
    
}
