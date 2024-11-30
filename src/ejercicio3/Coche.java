
package ejercicio3;

public class Coche extends Transporte {
    @Override
    public void acelerar() {
        System.out.println("El coche avanza y acelera.");
    }
    
    @Override
    public void frenar() {
        System.out.println("El coche ha frenado.");
    }
}
