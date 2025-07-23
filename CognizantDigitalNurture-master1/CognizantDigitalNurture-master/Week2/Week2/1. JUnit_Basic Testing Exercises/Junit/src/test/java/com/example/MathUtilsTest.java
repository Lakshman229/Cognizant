<<<<<<< HEAD
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertNotEquals(1, mathUtils.subtract(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, mathUtils.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testIsEven() {
        assertTrue(mathUtils.isEven(4));
        assertFalse(mathUtils.isEven(5));
    }
}
=======
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertNotEquals(1, mathUtils.subtract(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, mathUtils.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testIsEven() {
        assertTrue(mathUtils.isEven(4));
        assertFalse(mathUtils.isEven(5));
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
