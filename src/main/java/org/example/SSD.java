package org.example;

public class SSD extends ComputadorDecorator {

    public SSD(Computador computador) {
        super(computador);
    }

    public float getCustoAdicional() {
        return 150.0f;
    }

    public String getNomeComponente() {
        return "SSD 256GB";
    }
}