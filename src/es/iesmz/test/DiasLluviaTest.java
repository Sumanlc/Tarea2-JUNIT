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
    public void testRegistrarDiaDiaInvalido(){
        DiasLluvia d3 = new DiasLluvia();
        boolean resultado = d3.registrarDia(32,4,true);
        assertNotEquals(true,resultado);
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
        boolean resultado = d5.consultarDia(32, 4);
        assertNotEquals(true, resultado);
    }
    @Test
    public void testConsultarDiaNoLluvia() {
        DiasLluvia d6 = new DiasLluvia();
        d6.registrarDia(15, 4, false);
        boolean resultado = d6.consultarDia(15, 4);
        assertEquals(false, resultado);
    }
    @Test
    public void testContarDiasLluviososSinRegistro() {
        DiasLluvia d7 = new DiasLluvia();
        int numDiasLluvia = d7.contarDiasLluviosos();
        assertEquals(0, numDiasLluvia);
    }
    @Test
    public void testContarDiasLluviososVariosDias() {
        DiasLluvia d8 = new DiasLluvia();
        d8.registrarDia(10, 3, true);
        d8.registrarDia(15, 4, true);
        d8.registrarDia(20, 5, true);
        int numDiasLluvia = d8.contarDiasLluviosos();
        assertEquals(3, numDiasLluvia);
    }
    @Test
    public void testContarDiasLluviososAnioIncompleto() {
        DiasLluvia d9 = new DiasLluvia();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 31; j++) {
                if (Math.random() > 0.5) {
                    d9.registrarDia(j, i, true);
                }
            }
        }
        int resultado = d9.contarDiasLluviosos();
        assertNotEquals(365, resultado);
    }
    @Test
    public void testTrimestreLluviosoUnDiaEnTrimestre1() {
        DiasLluvia d10 = new DiasLluvia();
        d10.registrarDia(15, 1, true);
        int trimestre = d10.trimestreLluvioso();
        assertEquals(1, trimestre);
    }







}