package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.MULTIPLY, 2, 3), 0.01);
    }

    @Test
    public void testDiv() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.DIVIDE, 12, 2), 0.01);
    }
    @Test
    public void testSub() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.SUBTRACT, 13, 7), 0.01);
    }

    @Test


    public void tearDown() {
    }
}
