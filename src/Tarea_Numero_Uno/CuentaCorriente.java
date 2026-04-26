package Tarea_Numero_Uno;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void aplicarOperacionMensual() {
        double comision = saldo * 0.05; // 5% de comisión
        saldo -= comision; // Resta (puede quedar negativo)
        System.out.println("[Cuenta Corriente] Comisión cobrada: $" + String.format("%.2f", comision));
    }
}