package Trabajo_Practico_Dos;

public class Main {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" TRABAJO PRACTICO N°2 - POO EN JAVA");
        System.out.println(" Prueba de clases y objetos");
        System.out.println("==============================================");
        System.out.println();

        // ---------------------------
        // PRUEBA: CALCULADORA
        // ---------------------------
        System.out.println("=== PRUEBA: CALCULADORA ===");

        Calculadora calculadora = new Calculadora();

        double suma = calculadora.sumar(5, 3);
        double resta = calculadora.restar(10, 4);
        double multiplicacion = calculadora.multiplicar(2, 6);
        double division = calculadora.dividir(10, 2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

        System.out.println();

        // ---------------------------
        // PRUEBA: RELOJ
        // ---------------------------
        System.out.println("=== PRUEBA: RELOJ ===");

        Reloj miReloj = new Reloj();

        miReloj.establecerHora(10, 30, 45);
        miReloj.mostrarHora();

        miReloj.avanzarSegundo();
        miReloj.mostrarHora();

        System.out.println();

        // ---------------------------
        // PRUEBA: CUENTA BANCARIA
        // ---------------------------
        System.out.println("=== PRUEBA: CUENTA BANCARIA ===");

        CuentaBancaria miCuenta = new CuentaBancaria("12345", "Nico", 1000);

        miCuenta.depositar(500);
        miCuenta.retirar(200);

        double saldoActual = miCuenta.consultarSaldo();
        System.out.println("Saldo actual: " + saldoActual);

        miCuenta.retirar(2000);

        System.out.println();

        // ---------------------------
        // PRUEBA: LIBRO
        // ---------------------------
        System.out.println("=== PRUEBA: LIBRO ===");

        Libro miLibro = new Libro("El Señor de los Anillos", "Tolkien", "123456789");

        miLibro.mostrarInformacion();

        miLibro.prestar();
        miLibro.mostrarInformacion();

        miLibro.devolver();
        miLibro.mostrarInformacion();

        System.out.println();

        // ---------------------------
        // PRUEBA: EMPLEADOS
        // ---------------------------
        System.out.println("=== PRUEBA: EMPLEADOS ===");

        Empleado emp1 = new Empleado("Nico", 1000);
        Empleado emp2 = new Empleado("Ana", 1200);

        emp1.mostrarInformacion();
        System.out.println();

        emp1.aumentarSalarioPorcentaje(10, "Buen desempeño");
        emp1.mostrarInformacion();

        System.out.println();

        emp2.aumentarSalarioMonto(500, "Ajuste salarial");
        emp2.mostrarInformacion();

        System.out.println();

        System.out.println("Cantidad total de empleados: " + Empleado.obtenerCantidadEmpleados());

        System.out.println();
        System.out.println("==============================================");
        System.out.println(" Fin del programa");
        System.out.println("==============================================");
    }
}