package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkTriangleCase1() {
        int a = 0;
        int b = 1;
        int c = 1;

        String expected = "không phải là tam giác";
        String result = TriangleClassifier.checkTriangle(a, b, c);

        assertEquals(expected, result);
    }

    @Test
    void checkTriangleCase2() {
        int a = 1;
        int b = -2;
        int c = 1;

        String expected = "không phải là tam giác ";
        String result = TriangleClassifier.checkTriangle(a, b, c);

        assertEquals(expected, result);

    }
    @Test
    void checkTriangleCase3() {
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "không phải là tam giác ";
        String result = TriangleClassifier.checkTriangle(a, b, c);

        assertEquals(expected, result);
    }
        @Test
    void checkTriangleCase4() {
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "là tam giác thương";
        String result = TriangleClassifier.checkTriangle(a, b, c);

        assertEquals(expected, result);

    }     @Test
    void checkTriangleCase5() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "là tam giác cân";
        String result = TriangleClassifier.checkTriangle(a, b, c);

        assertEquals(expected, result);

    } @Test
    void checkTriangleCase6() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "là tam giác cân";
        String result = TriangleClassifier.checkTriangle(a, b, c);

        assertEquals(expected, result);

    }

}
