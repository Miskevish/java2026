package Trabajo_Practico_Tres.Ejercicio4;

public class TermostatoInteligente implements ConectableWiFi {

    @Override
    public void conectarWiFi(String red) {
        System.out.println("Termostato inteligente conectado a la red WiFi: " + red);
    }
}