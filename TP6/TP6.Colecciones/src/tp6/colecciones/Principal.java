/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6.colecciones;

/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo el inventario que es un array list que contiene productos de tipo Producto
        Inventario productos = new Inventario();
        
        // Creo objetos de tipo Producto
        //Producto TVsmart = new Producto("1", "TV TCL32\"", 500000, 5, CategoriaProducto.HOGAR);
        //Producto golosina = new Producto("2", "Turrón de maní", 500, 60, CategoriaProducto.ALIMENTOS);
        Producto monitor = new Producto("3", "Monitor Asus27\"", 250000, 2, CategoriaProducto.ELECTRONICA);
        Producto pcorto = new Producto("4", "Pantalón corto tipo short", 30000, 12, CategoriaProducto.ROPA);
        Producto remeraMangaCorta = new Producto("5", "Remera Topper algodón", 32000, 50, CategoriaProducto.ROPA);
        Producto cereal = new Producto("6", "Avena tradicional Quaker", 2000, 41, CategoriaProducto.ALIMENTOS);
        Producto magiclick = new Producto("7", "Magic click \"Doble chispa\"", 1500, 5, CategoriaProducto.HOGAR);
        
        
        // Agrego los productos al ArrayList productos de dos maneras distintas
        //productos.agregarProducto(TVsmart);
        productos.agregarProducto(new Producto("1", "TV TCL32\"", 500000, 5, CategoriaProducto.HOGAR));
        productos.agregarProducto(new Producto("2", "Turrón de maní", 500, 60, CategoriaProducto.ALIMENTOS));
        productos.agregarProducto(monitor);
        productos.agregarProducto(pcorto);
        productos.agregarProducto(remeraMangaCorta);
        productos.agregarProducto(cereal);
        productos.agregarProducto(magiclick);
        
        // listo los productos contenidos en el array
        System.out.println("Lista de productos");
        productos.listarProductos();
        System.out.println("-----------------");
        
        // busco producto por número de id
        System.out.println("Producto por id");
        productos.buscarProductoPorId("3");
        System.out.println("-----------------");
        
        // elimino producto por id
        System.out.println("Eliminar el producto con id=2");
        productos.eliminarProducto("2");
        productos.buscarProductoPorId("2"); // Busco producto por el id borrado
        productos.listarProductos(); // Listo los productos para chequear que realmente está borrado el que tiene id = 2
        System.out.println("-----------------");
        
        // actualizo stock del producto con id 4
        System.out.println("Actualizar stock producto con id=4");
        productos.actualizarStock("4", 21);
        productos.buscarProductoPorId("4");
        System.out.println("-----------------");
        
        // filtro por categoria
        System.out.println("Filtar por categoria \"Ropa\"");
        productos.filtarPorCategoria(CategoriaProducto.ROPA);
        System.out.println("-----------------");
        
        
        /* muestro el total de stock disponible
        * el producto con id 2 fue eliminado, pormlo tanto no suma
        * el stock del producto con id 4 fue acualizado a 21
        */
        System.out.println("Mostrar el stock total");
        productos.obtenerTotalStock();  
        System.out.println("-----------------");                             
        
        
        // obtenerProductoConMayorStock()
        System.out.println("Obtener el producto con mayor stock y mostrarlo");
        Producto productoMayorStock = productos.obtenerProductoConMayorStock();
        productoMayorStock.mostrarInfo();
        System.out.println("-----------------");         
        
        // filtrar productos cuyo valor está entre 1000 y 3000 pesos
        System.out.println("Productos con precio entre 1000 y 3000");
        productos.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("-----------------");  
        
        // Se nuestran las categorias disponibles y sus descripciones
        System.out.println("Categorias disponibles y descripción");
        productos.mostrarCategoriasDisponibles();
        
        
                
          
        
        
        
        
        
        
      
       
}
    
}