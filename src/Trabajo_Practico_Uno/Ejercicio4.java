package Trabajo_Practico_Uno;

import java.util.Scanner;

public class Ejercicio4 {

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("EJERCICIO 4 - CLASIFICACION POR TRIMESTRE");
        System.out.println("==========================================");

        System.out.print("Ingresa el dia: ");
        int dia = teclado.nextInt();

        System.out.print("Ingresa el mes: ");
        int mes = teclado.nextInt();

        System.out.print("Ingresa el anio: ");
        int anio = teclado.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al primer trimestre.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al segundo trimestre.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al tercer trimestre.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " pertenece al cuarto trimestre.");
        } else {
            System.out.println("El mes ingresado no es valido.");
        }

        System.out.println();
    }
}