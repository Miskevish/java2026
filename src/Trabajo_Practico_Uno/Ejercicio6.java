package Trabajo_Practico_Uno;

import java.util.Scanner;

public class Ejercicio6 {

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("EJERCICIO 6 - CLASIFICADOR DE TRIANGULOS");
        System.out.println("==========================================");

        System.out.print("Ingresa la cantidad de triangulos a analizar: ");
        int cantidadTriangulos = teclado.nextInt();

        int cantidadEquilateros = 0;
        int cantidadIsosceles = 0;
        int cantidadEscalenos = 0;

        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println();
            System.out.println("Triangulo " + i);

            System.out.print("Ingresa el lado 1: ");
            int lado1 = teclado.nextInt();

            System.out.print("Ingresa el lado 2: ");
            int lado2 = teclado.nextInt();

            System.out.print("Ingresa el lado 3: ");
            int lado3 = teclado.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Resultado: es un triangulo equilatero.");
                cantidadEquilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Resultado: es un triangulo isosceles.");
                cantidadIsosceles++;
            } else {
                System.out.println("Resultado: es un triangulo escaleno.");
                cantidadEscalenos++;
            }
        }

        System.out.println();
        System.out.println("Resumen final de triangulos:");
        System.out.println("Equilateros: " + cantidadEquilateros);
        System.out.println("Isosceles: " + cantidadIsosceles);
        System.out.println("Escalenos: " + cantidadEscalenos);

        if (cantidadEquilateros < cantidadIsosceles && cantidadEquilateros < cantidadEscalenos) {
            System.out.println("El tipo de triangulo con menor cantidad es: equilatero.");
        } else if (cantidadIsosceles < cantidadEquilateros && cantidadIsosceles < cantidadEscalenos) {
            System.out.println("El tipo de triangulo con menor cantidad es: isosceles.");
        } else if (cantidadEscalenos < cantidadEquilateros && cantidadEscalenos < cantidadIsosceles) {
            System.out.println("El tipo de triangulo con menor cantidad es: escaleno.");
        } else {
            System.out.println("No hay un unico tipo con menor cantidad. Hubo empate.");
        }

        System.out.println();
    }
}