package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Testcalculadora {
    
    @Test
    public void test1() {
        assertEquals(3, Calculadora.nombreDigits(123));
        assertEquals(4, Calculadora.nombreDigits(1234));
        assertEquals(3, Calculadora.nombreDigits(-123));
        assertEquals(1, Calculadora.nombreDigits(000));
    }

    @Test
    public void test2() {
        assertEquals(6, Calculadora.sumaPrimersNumeros(3));
        assertEquals(15, Calculadora.sumaPrimersNumeros(5));
        assertEquals(21, Calculadora.sumaPrimersNumeros(6));
    }

    @Test
    public void test3() {
        assertEquals(6, Calculadora.calcularFactorial(3));
        assertEquals(120, Calculadora.calcularFactorial(5));
        assertEquals(1, Calculadora.calcularFactorial(0));
    }

    @Test
    public void test4() {
        assertEquals(27, Calculadora.calcularPotencia(3, 3));
        assertEquals(16, Calculadora.calcularPotencia(4, 2));
        assertEquals(1, Calculadora.calcularPotencia(5, 0));
    }

    @Test
    public void test5() {
        assertEquals(55, Calculadora.sumaQuadrats(5));
        assertEquals(385, Calculadora.sumaQuadrats(10));
        assertEquals(0, Calculadora.sumaQuadrats(0));
    }


}