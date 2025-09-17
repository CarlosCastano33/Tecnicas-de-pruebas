package com.tecnicasdepruebas.demo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculadora calculator = new Calculadora();

    @Test
    void testOperarSumaConInput() {
        String input = "+\n3\n4\n"; // simulamos escribir +, 3, 4
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Calculadora calc = new Calculadora();
        float resultado = calc.operar();

        assertEquals(7, resultado);
    }

    @Test
    void testOperarRestaConInput() {
        String input = "-\n10\n6\n"; // operador -, luego 10 y 6
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Calculadora calc = new Calculadora();
        float resultado = calc.operar();

        assertEquals(4, resultado);
    }

    @Test
    void testOperarMultiplicacionConInput() {
        String input = "*\n5\n3\n"; // operador *, luego 5 y 3
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Calculadora calc = new Calculadora();
        float resultado = calc.operar();

        assertEquals(15, resultado);
    }

    @Test
    void testOperarDivisionConInput() {
        String input = "/\n10\n2\n"; // operador /, luego 10 y 2
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Calculadora calc = new Calculadora();
        float resultado = calc.operar();

        assertEquals(5.0, resultado);
    }

}
