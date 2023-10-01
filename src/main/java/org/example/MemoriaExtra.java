package org.example;

public class MemoriaExtra extends ComputadorDecorator {

    public MemoriaExtra(Computador computador) {
        super(computador);
    }

    public float getCustoAdicional() {
        return 100.0f;
    }

    public String getNomeComponente() {
        return "Memória Extra 8GB";
    }
}
