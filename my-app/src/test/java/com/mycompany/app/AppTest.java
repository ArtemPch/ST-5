package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testAverage1() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(15, sqrt.average(10, 20));
    }

    @Test
    void testAverage2() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(30, sqrt.average(20, 40));
    }

    @Test
    void testGood1() {
        Sqrt sqrt = new Sqrt(1);
        assertTrue(sqrt.good(9, 81));
    }

    @Test
    void testGood2() {
        Sqrt sqrt = new Sqrt(1);
        assertTrue(sqrt.good(8.99999999999999, 81));
    }

    @Test
    void testGood3() {
        Sqrt sqrt = new Sqrt(1);
        assertFalse(sqrt.good(8.5, 81));
    }

    @Test
    void testImprove1() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(4.5625, sqrt.improve(8, 9));
    }

    @Test
    void testImprove2() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(5.45, sqrt.improve(10, 9));
    }

    @Test
    void testIter() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(3.0, sqrt.iter(5, 9), 0.0000001);
    }

    @Test
    void testCalc1() {
        Sqrt sqrt = new Sqrt(9);
        assertEquals(3.0, sqrt.calc(), 0.0000001);
    }

    @Test
    void testCalc2() {
        Sqrt sqrt = new Sqrt(81);
        assertEquals(9.0, sqrt.calc(), 0.0000001);
    }
}
