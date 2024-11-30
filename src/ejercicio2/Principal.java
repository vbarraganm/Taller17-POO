
package ejercicio2;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorros(200000);
        
        cuenta.depositar(300000);
        cuenta.retirar(100000);
        System.out.println(cuenta);
    }
}
