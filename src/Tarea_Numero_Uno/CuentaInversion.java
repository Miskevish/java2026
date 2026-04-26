package Tarea_Numero_Uno;

public class CuentaInversion extends CuentaBancaria {

    private double tasaComision; // Variable: depende de la inversión

    public CuentaInversion(String titular, double saldo, double tasaComision) {
        super(titular, saldo);
        this.tasaComision = tasaComision;
    }

    @Override
    public void aplicarOperacionMensual() {
        double comision = saldo * tasaComision;
        saldo -= comision;
        System.out.printf("[Cuenta Inversión] Comisión (%.0f%%): $%.2f%n",
                tasaComision * 100, comision);
    }
}