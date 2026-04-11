package Trabajo_Practico_Uno;

import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("EJERCICIO 3 - CANTIDAD DE DIGITOS");
        System.out.println("==========================================");

        System.out.print("Ingresa un numero positivo entre 1 y 99: ");
        int numero = teclado.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El numero tiene un digito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero tiene dos digitos.");
        } else {
            System.out.println("Ups, el numero ingresado esta fuera del rango pedido.");
        }

        System.out.println();
    }
}