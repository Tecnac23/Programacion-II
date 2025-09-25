/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5a;

/**
 *
 * @author carne
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    
    public Computadora(String marca, String numeroSerie, String modelo, String chipset){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        //this.placaMadre = new PlacaMadre(modelo, chipset);
        this.placaMadre = null;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }
    
    public void mostrarEstado(){
        System.out.println("La marca de la computadora es: "+ marca);
        System.out.println("El numero de serie es: "+ numeroSerie);
        System.out.println("Los datos de la placa madre son: ");
        //System.out.println("   Modelo: "+ placaMadre.getModelo());
        //System.out.println("   Chipset: "+ placaMadre.getChipset() ); 
        System.out.println(placaMadre);
    }   
    
}
