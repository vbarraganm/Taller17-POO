
package ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    
    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }
    
    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
