package es.iesmz.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {
    @Test
    public void testRegistrarDiaValido(){
        DiasLluvia d1 = new DiasLluvia();
        boolean resultado = d1.registrarDia(15,4,true);
        assertEquals(true,resultado);
    }

    @Test
    public void testRegistrarDiaMesInvalido() {
        DiasLluvia d2 = new DiasLluvia();
        boolean resultado = d2.registrarDia(15, 13, true);
        assertEquals(false, resultado);
    }

    @Test
    public void testConsultarDiaValido() {
        DiasLluvia d3 = new DiasLluvia();
        d3.registrarDia(15, 4, true);
        boolean resultado = d3.consultarDia(15, 4);
        assertEquals(true, resultado);
    }

    @Test
    public void testConsultarDiaMesInvalido() {
        DiasLluvia d4 = new DiasLluvia();
        d4.registrarDia(15, 4, true);
        boolean resultado = d4.consultarDia(15, 13);
        assertEquals(false, resultado);
    }

    @Test
    public void testConsultarDiaDiaInvalido() {
        DiasLluvia d5 = new DiasLluvia();
        d5.registrarDia(15, 4, true);
        boolean resultado = d5.consultarDia(32, 4);
        assertEquals(false, resultado);
    }

}