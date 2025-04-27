package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 нь 6 байх ёстой");
    }

    @Test
    void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 нь -6 байх ёстой");
    }

    @Test
    void testAddPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(5.0, calc.add(2.0, 3.0), "2 + 3 нь 5 байх ёстой");
    }

    @Test
    void testAddNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(1.0, calc.add(4.0, -3.0), "4 + (-3) нь 1 байх ёстой");
    }
}
