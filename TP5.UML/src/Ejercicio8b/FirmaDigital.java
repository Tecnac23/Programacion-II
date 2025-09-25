/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8b;

/**
 *
 * @author carne
 */
public class FirmaDigital {
    
    private String codigo;
    private String fecha;
    private Usuario usuario;
    
    public FirmaDigital(String codigo, String fecha, Usuario usuario){
        this.codigo =  codigo;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigo=" + codigo + ", fecha=" + fecha + ", usuario= " + usuario.getNombre()+ ", email Ususario= "+ usuario.getEmail()+ '}';
    }
    
    

    
}
