package tudelft.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumPositivos() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.sumar(3, 4));
    }

    @Test
    public void testSumNegativos() {
        Calculadora calc = new Calculadora();
        assertEquals(-7, calc.sumar(-3, -4));
    }

    @Test
    public void testSumPositivoYNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.sumar(5, -4));
    }

    @Test
    public void testEvaluarNumPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals("Positivo", calc.evaluarNumero(10));
    }

    @Test
    public void testEvaluarNumNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals("Negativo", calc.evaluarNumero(-5));
    }

    @Test




    public void testEvaluarNumCero() {
        Calculadora calc = new Calculadora();
        assertEquals("Cero", calc.evaluarNumero(0));
    }

    @Test
    public void testEsParConNumPar() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.esPar(8));
    }

    @Test
    public void testEsParConNumImpar() {
        Calculadora calc = new Calculadora();
        assertFalse(calc.esPar(7));
    }
}
