package Trabajo_Practico_Uno;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("EJERCICIO 1 - EVALUACION DE UNA NOTA");
        System.out.println("==========================================");

        System.out.print("Vamos a ver como te fue. Ingresa la nota: ");
        int nota = teclado.nextInt();

        if (nota < 4) {
            System.out.println("Resultado: desaprobaste la materia.");
        } else if (nota == 10) {
            System.out.println("Resultado: aprobaste con sobresaliente!");
        } else {
            System.out.println("Resultado: aprobaste la materia.");
        }

        System.out.println();
    }
}