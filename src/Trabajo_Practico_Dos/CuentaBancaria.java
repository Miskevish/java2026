package Trabajo_Practico_Dos;

public class CuentaBancaria {

    // Atributos
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Metodo para depositar dinero
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se deposito: " + monto);
    }

    // Metodo para retirar dinero
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiro: " + monto);
        } else {
            System.out.println("Error: saldo insuficiente.");
        }
    }

    // Metodo para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }
}