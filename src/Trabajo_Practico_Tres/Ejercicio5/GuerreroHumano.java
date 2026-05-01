package Trabajo_Practico_Tres.Ejercicio5;

public class GuerreroHumano extends PersonajeJugable {

    public GuerreroHumano(int x, int y, int vida) {
        super(x, y, vida);
    }

    @Override
    public void dibujar() {
        System.out.println("Guerrero Humano dibujado en pantalla.");
    }
}