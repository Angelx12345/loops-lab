package programming.loops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas ocultas para calificar: casos extremos (0, 1, negativos, valores grandes).
 * Se copian en src/test/java del proyecto del estudiante.
 */
class LoopsHiddenTest {

    @Test
    @DisplayName("A1. Suma hasta 1, 0 y negativos")
    void sumToEdges() {
        assertEquals(1, Loops.sumTo(1));
        assertEquals(0, Loops.sumTo(0));
        assertEquals(0, Loops.sumTo(-5));
        assertEquals(5050, Loops.sumTo(100));
    }

    @Test
    @DisplayName("A2. 0!, 1! y 20!")
    void factorialEdges() {
        assertEquals(1L, Loops.factorial(0));
        assertEquals(1L, Loops.factorial(1));
        assertEquals(2432902008176640000L, Loops.factorial(20));
    }

    @Test
    @DisplayName("A3. El 0 tiene un dígito; los negativos no cuentan el signo")
    void countDigitsEdges() {
        assertEquals(1, Loops.countDigits(0));
        assertEquals(1, Loops.countDigits(7));
        assertEquals(3, Loops.countDigits(-450));
        assertEquals(10, Loops.countDigits(2147483647));
    }

    @Test
    @DisplayName("A4. Cuenta regresiva desde 1 y desde 0")
    void countdownEdges() {
        assertEquals("1 ¡Despegue!", Loops.countdown(1));
        assertEquals("¡Despegue!", Loops.countdown(0));
        assertEquals("5 4 3 2 1 ¡Despegue!", Loops.countdown(5));
    }

    @Test
    @DisplayName("B1. Dígitos de 0, de un negativo y de 999999")
    void digitSumEdges() {
        assertEquals(0, Loops.digitSum(0));
        assertEquals(9, Loops.digitSum(-405));
        assertEquals(54, Loops.digitSum(999999));
    }

    @Test
    @DisplayName("B2. Ceros al final, un dígito y el 0")
    void reverseEdges() {
        assertEquals(21, Loops.reverse(120));
        assertEquals(7, Loops.reverse(7));
        assertEquals(0, Loops.reverse(0));
        assertEquals(503, Loops.reverse(305));
    }

    @Test
    @DisplayName("B3. 0, 1 y 2; cuadrados de primos; un primo grande")
    void isPrimeEdges() {
        assertFalse(Loops.isPrime(0));
        assertFalse(Loops.isPrime(1));
        assertTrue(Loops.isPrime(2));
        assertFalse(Loops.isPrime(49));
        assertFalse(Loops.isPrime(-7));
        assertTrue(Loops.isPrime(7919));
    }

    @Test
    @DisplayName("B4. Orden de los argumentos, coprimos e iguales")
    void gcdEdges() {
        assertEquals(6, Loops.gcd(18, 48));
        assertEquals(1, Loops.gcd(17, 5));
        assertEquals(9, Loops.gcd(9, 9));
        assertEquals(5, Loops.gcd(5, 25));
    }

    @Test
    @DisplayName("B5. Tabla completa del 3")
    void multiplicationTableOfThree() {
        String expected = "3 x 1 = 3\n3 x 2 = 6\n3 x 3 = 9\n3 x 4 = 12\n3 x 5 = 15\n"
                + "3 x 6 = 18\n3 x 7 = 21\n3 x 8 = 24\n3 x 9 = 27\n3 x 10 = 30\n";
        assertEquals(expected, Loops.multiplicationTable(3));
    }

    @Test
    @DisplayName("C1. 6 y 496 son perfectos; 1 y 0 no")
    void isPerfectEdges() {
        assertTrue(Loops.isPerfect(6));
        assertTrue(Loops.isPerfect(496));
        assertFalse(Loops.isPerfect(1));
        assertFalse(Loops.isPerfect(0));
        assertFalse(Loops.isPerfect(27));
    }

    @Test
    @DisplayName("C2. Binario de 0, 1, 8 y 255")
    void toBinaryEdges() {
        assertEquals("0", Loops.toBinary(0));
        assertEquals("1", Loops.toBinary(1));
        assertEquals("1000", Loops.toBinary(8));
        assertEquals("11111111", Loops.toBinary(255));
    }

    @Test
    @DisplayName("C3. Desde 1 hay 0 pasos; desde 27, 111")
    void collatzStepsEdges() {
        assertEquals(0, Loops.collatzSteps(1));
        assertEquals(1, Loops.collatzSteps(2));
        assertEquals(111, Loops.collatzSteps(27));
    }

    @Test
    @DisplayName("C4. Triángulos de 0 y 1 filas")
    void triangleEdges() {
        assertEquals("", Loops.triangle(0));
        assertEquals("*\n", Loops.triangle(1));
        assertEquals("*\n**\n***\n****\n*****\n", Loops.triangle(5));
    }
}
