package Tarea_Numero_Uno;

public class Main {
    public static void main(String[] args) {

        // Creamos una cuenta de cada tipo
        CajaDeAhorro ahorro       = new CajaDeAhorro("Ana García", 10000);
        CuentaCorriente corriente = new CuentaCorriente("Carlos López", 5000);
        CuentaInversion inversion = new CuentaInversion("María Pérez", 20000, 0.03); // 3%

        // Procesamos todas las cuentas
        CuentaBancaria[] cuentas = { ahorro, corriente, inversion };

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.mostrarEstado();
            cuenta.aplicarOperacionMensual(); // Polimorfismo en acción
            cuenta.mostrarEstado();
            System.out.println();
        }
    }
}