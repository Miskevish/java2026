package Trabajo_Practico_Dos;

public class Reloj {

    // Atributos
    private int hora;
    private int minutos;
    private int segundos;

    // Metodo para establecer la hora
    public void establecerHora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Metodo para mostrar la hora
    public void mostrarHora() {
        System.out.println("Hora actual: " + hora + ":" + minutos + ":" + segundos);
    }

    // Metodo para avanzar un segundo
    public void avanzarSegundo() {
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}