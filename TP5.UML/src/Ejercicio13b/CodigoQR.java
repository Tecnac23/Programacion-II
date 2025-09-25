/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13b;

/**
 *
 * @author carne
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void mostrarInformacion(){
        System.out.println("Valor QR= "+"\""+ valor+ "\"");
        System.out.println("Nombre usuario= "+usuario.getNombre()+ "; email usuario= "+ usuario.getEmail());
    
    }
    
}
