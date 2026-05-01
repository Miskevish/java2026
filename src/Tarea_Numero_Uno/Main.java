package Tarea_Numero_Uno;

public class Main {
    public static void main(String[] args) {

        CajaDeAhorro ahorro       = new CajaDeAhorro("Ana García", 10000);
        CuentaCorriente corriente = new CuentaCorriente("Carlos López", 5000);
        CuentaInversion inversion = new CuentaInversion("María Pérez", 20000, 0.03); // 3%

        CuentaBancaria[] cuentas = { ahorro, corriente, inversion };

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.mostrarEstado();
            cuenta.aplicarOperacionMensual(); // Polimorfismo
            cuenta.mostrarEstado();
            System.out.println();
        }
    }
}

//interfaces Calculable y dentro un metodo que se llame calcular(int num, int num 2)
// simular erencias multiples usando varias interfaces; que es herencia, que es un objeto,
// java acepta o no herencias multiples