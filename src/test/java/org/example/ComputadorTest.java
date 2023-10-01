package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveRetornarCustoComputadorBase() {
        Computador pc = new ComputadorBase();

        assertEquals(500.0f, pc.getCusto());
    }

    @Test
    void deveRetornarCustoComputadorComMemoriaExtra() {
        Computador pc = new MemoriaExtra(new ComputadorBase());

        assertEquals(600.0f, pc.getCusto());
    }

    @Test
    void deveRetornarCustoComputadorComSSD() {
        Computador pc = new SSD(new ComputadorBase());

        assertEquals(650.0f, pc.getCusto());
    }

    @Test
    void deveRetornarCustoComputadorComPlacaDeVideo() {
        Computador pc = new PlacaDeVideo(new ComputadorBase());

        assertEquals(800.0f, pc.getCusto());
    }

    @Test
    void deveRetornarCustoComputadorComMemoriaExtraEPlacaDeVideo() {
        Computador pc = new MemoriaExtra(new PlacaDeVideo(new ComputadorBase()));

        assertEquals(900.0f, pc.getCusto());
    }

    @Test
    void deveRetornarCustoComputadorComSSDEPlacaDeVideo() {
        Computador pc = new SSD(new PlacaDeVideo(new ComputadorBase()));

        assertEquals(950.0f, pc.getCusto());
    }

    @Test
    void deveRetornarCustoComputadorComTodosComponentes() {
        Computador pc = new MemoriaExtra(new SSD(new PlacaDeVideo(new ComputadorBase())));

        assertEquals(1050.0f, pc.getCusto());
    }

    @Test
    void deveRetornarComponentesComputador() {
        Computador pc = new ComputadorBase();

        assertEquals("Computador Base", pc.getComponentes());
    }

    @Test
    void deveRetornarComponentesComputadorComMemoriaExtra() {
        Computador pc = new MemoriaExtra(new ComputadorBase());

        assertEquals("Computador Base, Memória Extra 8GB", pc.getComponentes());
    }

    @Test
    void deveRetornarComponentesComputadorComSSD() {
        Computador pc = new SSD(new ComputadorBase());

        assertEquals("Computador Base, SSD 256GB", pc.getComponentes());
    }

    @Test
    void deveRetornarComponentesComputadorComPlacaDeVideo() {
        Computador pc = new PlacaDeVideo(new ComputadorBase());

        assertEquals("Computador Base, Placa de Vídeo 4GB", pc.getComponentes());
    }

    @Test
    void deveRetornarComponentesComputadorComTodosComponentes() {
        Computador pc = new MemoriaExtra(new SSD(new PlacaDeVideo(new ComputadorBase())));

        assertEquals("Computador Base, Placa de Vídeo 4GB, SSD 256GB, Memória Extra 8GB", pc.getComponentes());
    }

}