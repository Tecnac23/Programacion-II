/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9a;

/**
 *
 * @author carne
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    
    public CitaMedica(String fecha, String hora){
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    public void mostrarInformacion(){
        System.out.println("Fecha cita: "+ fecha);
        System.out.println("HOra cita: "+ hora);
        System.out.println("Nombre paciente: "+paciente.getNombre() );
        System.out.println("Obra social paciente: "+ paciente.getObraSocial());
    }
}
