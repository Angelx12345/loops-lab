package programming.loops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas visibles del laboratorio. No las modifiques: el docente califica con estas y con otras
 * pruebas adicionales.
 */
class LoopsTest {

    // Parte A

    @Test
    @DisplayName("A1. La suma hasta 10 es 55")
    void sumToTen() {
        assertEquals(55, Loops.sumTo(10));
    }

    @Test
    @DisplayName("A2. 5! es 120")
    void factorialOfFive() {
        assertEquals(120L, Loops.factorial(5));
    }

    @Test
    @DisplayName("A3. 4721 tiene 4 dígitos")
    void countDigitsTypical() {
        assertEquals(4, Loops.countDigits(4721));
    }

    @Test
    @DisplayName("A4. Cuenta regresiva desde 3")
    void countdownFromThree() {
        assertEquals("3 2 1 ¡Despegue!", Loops.countdown(3));
    }

    // Parte B

    @Test
    @DisplayName("B1. Los dígitos de 4721 suman 14")
    void digitSumTypical() {
        assertEquals(14, Loops.digitSum(4721));
    }

    @Test
    @DisplayName("B2. 1234 al revés es 4321")
    void reverseTypical() {
        assertEquals(4321, Loops.reverse(1234));
    }

    @Test
    @DisplayName("B3. 17 es primo y 21 no")
    void isPrimeTypical() {
        assertTrue(Loops.isPrime(17));
        assertFalse(Loops.isPrime(21));
    }

    @Test
    @DisplayName("B4. MCD de 48 y 18 es 6")
    void gcdTypical() {
        assertEquals(6, Loops.gcd(48, 18));
    }

    @Test
    @DisplayName("B5. La tabla del 7 empieza con 7 x 1 = 7 y tiene 10 líneas")
    void multiplicationTableOfSeven() {
        String table = Loops.multiplicationTable(7);
        assertTrue(table.startsWith("7 x 1 = 7\n"));
        assertEquals(10, table.lines().count());
    }

    // Parte C

    @Test
    @DisplayName("C1. 28 es perfecto y 12 no")
    void isPerfectTypical() {
        assertTrue(Loops.isPerfect(28));
        assertFalse(Loops.isPerfect(12));
    }

    @Test
    @DisplayName("C2. 13 en binario es 1101")
    void toBinaryTypical() {
        assertEquals("1101", Loops.toBinary(13));
    }

    @Test
    @DisplayName("C3. Desde 6 se llega a 1 en 8 pasos")
    void collatzStepsTypical() {
        assertEquals(8, Loops.collatzSteps(6));
    }

    @Test
    @DisplayName("C4. Triángulo de 3 filas")
    void triangleOfThree() {
        assertEquals("*\n**\n***\n", Loops.triangle(3));
    }
}
