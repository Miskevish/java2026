package Trabajo_Practico_Dos;

public class Empleado {

    // Atributos
    private int legajo;
    private String nombre;
    private double salario;

    // Atributo estático (compartido por todos)
    private static int contadorEmpleados = 0;

    // Constructor
    public Empleado(String nombre, double salario) {
        contadorEmpleados++;
        this.legajo = contadorEmpleados; // legajo único automático
        this.nombre = nombre;
        this.salario = salario;
    }

    // Aumento por porcentaje
    public void aumentarSalarioPorcentaje(double porcentaje, String motivo) {
        double aumento = salario * porcentaje / 100;
        salario += aumento;
        System.out.println("Aumento aplicado (" + motivo + "): +" + aumento);
    }

    // Aumento por monto fijo
    public void aumentarSalarioMonto(double monto, String motivo) {
        salario += monto;
        System.out.println("Aumento aplicado (" + motivo + "): +" + monto);
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

    // Metodo estático para cantidad total
    public static int obtenerCantidadEmpleados() {
        return contadorEmpleados;
    }
}