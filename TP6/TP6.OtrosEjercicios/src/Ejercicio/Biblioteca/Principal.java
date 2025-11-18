/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio.Biblioteca;



/**
 *
 * @author carne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo Biblioteca
        Biblioteca popular = new Biblioteca("Popular");
        
       // agrego libros a la coleccion de libros
        popular.agregarLibros("1516", "Los tres mosqueteros", 1844, new Autor("1","Alejandro Dumas", "Francia"));
        popular.agregarLibros("1517", "Veinte años después", 1845, new Autor("1","Alejandro Dumas", "Francia"));
        popular.agregarLibros("1518", "EL bizconde de Bragelonne", 1850, new Autor("1","Alejandro Dumas", "Francia"));
        popular.agregarLibros("1519", "El conde de Montecristo", 1846, new Autor("1","Alejandro Dumas", "Francia"));
        popular.agregarLibros("1520", "La dama de las camelias", 1848, new Autor("2","Alejandro Dumas (hijo)", "Francia"));
        
        // listo los libros que contiene la biblioteca
        popular.listarLibros();
        System.out.println("");
        
        // busco libro por número isbn
        popular.buscarLibroPorIsbn("1520");
        System.out.println("");
       
        // no funciona el método eliminar libro y no encuentro el error
        //popular.eliminarLibro("1517");
//        popular.listarLibros();
        
        // mustra la cantidad de libros que tiene la Biblioteca
        System.out.println("Hay " + popular.obtenerCantidadLibros()+ " libros en la Biblioteca Popular");
        System.out.println("--------------");
        System.out.println("");
        
        // filtro libro por anio de publicación
        popular.filtarLibrosPorAnio(1848);
        System.out.println("");
        
        // se muestran los autores que tiene la biblioteca
        popular.mostrarAutoresDisponibles();
        
        
        
   }
}   

