/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creo un cliente
        Cliente cliente = new Cliente("Ignacio", "Carné", "123");
        
        // paso el cliente al pedido
        Pedido pedido = new Pedido(cliente);

        
        // la clase Pedido tieneuna lista de productos y agrego 2 productos
        pedido.agregarPedido(new Producto("Mouse Asus TUF M4", 80000));
        pedido.agregarPedido(new Producto("Teclado Asus rog strix scope RX", 221000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // se paga con tarjeta
        TarjetaCredito pagarConTarjeta = new TarjetaCredito("Roja");
        double montoConDescuento = pagarConTarjeta.aplicarDescuento(pedido.calcularTotal());
        pagarConTarjeta.procesarPago(montoConDescuento);
        
        // se paga con Paypal
        PayPal pagarConPayPal = new PayPal("Accesor1");
        double monto = pedido.calcularTotal();
        pagarConPayPal.procesarPago(monto);
        
        

        // cambio de estado
        pedido.cambiarEstado("Enviado");
    }
}
    

