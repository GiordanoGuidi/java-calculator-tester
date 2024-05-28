package calculator.tester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5.0f,calculator.add(2,3));
        assertEquals(2.6f,calculator.add(2.6f,0));
        assertEquals(0.0f,calculator.add(1,-1));
        assertNotEquals(2.3f,calculator.add(1.5f,1));
    }

    @Test
    void substract() {
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.substract(7,2));
        assertEquals(10,calculator.substract(10,0));
        assertEquals(-2,calculator.substract(10,12));
        assertNotEquals(-2,calculator.substract(11,12));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.divide(16.0f,4));
        assertEquals(5,calculator.divide(50,10));
        assertEquals(1,calculator.divide(50,50));
        assertNotEquals(1,calculator.divide(50,5));
        assertThrows(ArithmeticException.class,()-> calculator.divide(2f,0f));
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.multiply(2,4));
        assertEquals(5,calculator.multiply(2.5f,2));
        assertEquals(5,calculator.multiply(2.5f,2));
        assertNotEquals(8,calculator.multiply(2.5f,2));
    }
}