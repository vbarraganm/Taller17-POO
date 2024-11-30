
package ejercicio2;

public abstract class CuentaBancaria {
    protected double saldo;
    
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public abstract void retirar(double monto);
    
    public void depositar(double monto) {
        saldo += monto;
    }
    
    public double consultarSaldo(){
        return saldo;
    }
    
    @Override
    public String toString() {
        return "Saldo actual: " + saldo;
    }
}
