package org.example;

public abstract class ComputadorDecorator implements Computador {

    private Computador computador;

    public ComputadorDecorator(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public abstract float getCustoAdicional();

    public float getCusto() {
        return this.computador.getCusto() + this.getCustoAdicional();
    }

    public abstract String getNomeComponente();

    public String getComponentes() {
        return this.computador.getComponentes() + ", " + this.getNomeComponente();
    }
}