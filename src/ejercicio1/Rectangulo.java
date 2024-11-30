
package ejercicio1;

public class Rectangulo extends Figura {
    private double ancho;
    private double longitud;
    
    public Rectangulo(double ancho, double longitud) {
        this.ancho = ancho;
        this.longitud = longitud;
    }
    
    @Override
    public double calcularArea() {
        return ancho * longitud;
    }
}
