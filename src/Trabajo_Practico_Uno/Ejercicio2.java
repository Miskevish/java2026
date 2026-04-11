package Trabajo_Practico_Uno;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("EJERCICIO 2 - CALCULO DE PROMOCION");
        System.out.println("==========================================");

        System.out.print("Ingresa la nota del primer parcial: ");
        double primerParcial = teclado.nextDouble();

        System.out.print("Ingresa la nota del segundo parcial: ");
        double segundoParcial = teclado.nextDouble();

        System.out.print("Ingresa la nota del tercer parcial: ");
        double tercerParcial = teclado.nextDouble();

        double promedio = (primerParcial + segundoParcial + tercerParcial) / 3;

        System.out.println("Promedio obtenido: " + promedio);

        if (promedio >= 8) {
            System.out.println("Resultado: el alumno esta promocionado.");
        } else {
            System.out.println("Resultado: el alumno no esta promocionado.");
        }

        System.out.println();
    }
}