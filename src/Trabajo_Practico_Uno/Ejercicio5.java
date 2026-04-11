package Trabajo_Practico_Uno;

import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("EJERCICIO 5 - UBICACION DE UN PUNTO EN EL PLANO");
        System.out.println("==========================================");

        System.out.print("Ingresa el valor de x: ");
        int x = teclado.nextInt();

        System.out.print("Ingresa el valor de y: ");
        int y = teclado.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el tercer cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto se encuentra en el cuarto cuadrante.");
        } else {
            System.out.println("El punto esta sobre un eje, no pertenece a ningun cuadrante.");
        }

        System.out.println();
    }
}