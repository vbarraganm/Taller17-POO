
package ejercicio3;

public class Bicicleta extends Transporte {
    @Override
    public void acelerar() {
        System.out.println("La bicicleta pedalea y acelera.");
    }
    
    @Override
    public void frenar() {
        System.out.println("La bicicleta ha frenado.");
    }
}
