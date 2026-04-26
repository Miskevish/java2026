package Tarea_Numero_Uno;

public class CajaDeAhorro extends CuentaBancaria {

    public CajaDeAhorro(String titular, double saldo) {
        super(titular, saldo); // Llama al constructor del padre
    }

    @Override
    public void aplicarOperacionMensual() {
        double interes = saldo * 0.02; // 2%
        saldo += interes;
        System.out.println("[Caja de Ahorro] Interés aplicado: $" + String.format("%.2f", interes));
    }
}