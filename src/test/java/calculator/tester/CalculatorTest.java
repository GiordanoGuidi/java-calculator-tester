package calculator.tester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5.0f,calculator.add(2.0f,3.0f));
        assertEquals(2.6f,calculator.add(1.2f,1.4f));
        assertEquals(0.0f,calculator.add(1.0f,-1.0f));
    }

    @Test
    void substract() {
        Calculator calculator = new Calculator();
        assertEquals(5.0f,calculator.substract(7.0f,2.0f));
        assertEquals(8.8f,calculator.substract(10.0f,1.2f));
        assertEquals(-2.0f,calculator.substract(10.0f,12.0f));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        assertEquals(4.0f,calculator.divide(16.0f,4.0f));
        assertEquals(5.0f,calculator.divide(50.0f,10.0f));
        assertEquals(1.0f,calculator.divide(50.0f,50.0f));
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.multiply(2.0f,4.0f));
        assertEquals(5,calculator.multiply(2.5f,2.0f));
        assertEquals(5,calculator.multiply(2.5f,2.0f));

    }
}