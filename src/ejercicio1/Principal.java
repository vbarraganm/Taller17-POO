
package ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Figura circulo = new Circulo(10);
        Figura rectangulo = new Rectangulo(4,8);
        
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
