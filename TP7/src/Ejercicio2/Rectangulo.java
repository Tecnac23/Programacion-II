
package Ejercicio2;

public class Rectangulo extends Figura {
    
    private double ladoMayor;
    private double ladoMenor;

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    
    

    public Rectangulo(double ladoMayor, double ladoMenor, String nombre) {
        super(nombre);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("Area de la figura " + this.getNombre() + " es: " + ladoMayor*ladoMenor);
    
    }
}
