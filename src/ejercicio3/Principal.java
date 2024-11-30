
package ejercicio3;

public class Principal {

    public static void main(String[] args) {
        Transporte bici = new Bicicleta();
        Transporte coche = new Coche();
        
        bici.acelerar();
        bici.frenar();
        System.out.println("*****");
        coche.acelerar();
        coche.frenar();
    }
}
