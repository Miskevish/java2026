package Tarea_Numero_Uno;

public abstract class CuentaBancaria {

    // Atributos comunes a TODAS las cuentas
    protected String titular;
    protected double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodo ABSTRACTO: cada cuenta lo implementa a su manera

    public abstract void aplicarOperacionMensual();

    // Metodo CONCRETO: igual para todas las cuentas
    public void mostrarEstado() {
        System.out.println("=== Cuenta de: " + titular + " ===");
        System.out.printf("Saldo actual: $%.2f%n", saldo);
    }

    // Getters
    public String getTitular() { return titular; }
    public double getSaldo()   { return saldo;   }
}