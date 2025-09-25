/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6a;

/**
 *
 * @author carne
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    
    public Reserva(String fecha, String hora){
        this.fecha = fecha;
        this.hora = hora;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente mesa) {
        this.cliente = mesa;
    }
    
    public void mostrarReserva(){
        System.out.println("La hora de la reserva es: " + hora );
        System.out.println("La fecha es: " + fecha );
        System.out.println("El cliente es: " + cliente );
    }
    
}
