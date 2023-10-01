package org.example;

public class PlacaDeVideo extends ComputadorDecorator {

    public PlacaDeVideo(Computador computador) {
        super(computador);
    }

    public float getCustoAdicional() {
        return 300.0f;
    }

    public String getNomeComponente() {
        return "Placa de Vídeo 4GB";
    }
}