
package tp2;

import java.util.Scanner;
public class ejercicio11{
    
    static double descuento = 0.10, precioFinal, pagar;
    static int precio;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        pagar = calcularDescuentoEspecial(precio);
        
        System.out.println("EL total a pagar es de " + pagar + " pesos.");
     
           
    }
    
    
    static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = descuento;
  
        precioFinal= precio - precio*descuentoAplicado;
        
        return precioFinal;
        
       
    }   
    
    
}

