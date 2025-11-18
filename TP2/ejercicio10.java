
package tp2;

import java.util.Scanner;





public class ejercicio10{
    
    static int stockActual,nuevoStock, cantidadVendida, cantidadRecibida, stockReal;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el stock actual (en unidades): ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida (en unidades): ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida (en unidades): ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        stockReal = actualizarStock(stockActual, cantidadVendida,cantidadRecibida);
        System.out.println("El stock actual es de " + stockReal + " unidades.");
           
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
  
        nuevoStock = (stockActual - cantidadVendida + cantidadRecibida);
        
        return nuevoStock;
        
       
    }   
    
    
}

