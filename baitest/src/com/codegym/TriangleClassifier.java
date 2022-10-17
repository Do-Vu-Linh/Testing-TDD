package com.codegym;

public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (Math.abs(a - b) < c && c < a + b) {
            if (a == c && a == b) {
                return "là tam giác đều";
            } else if (a == c || a == b || b == c) {
                return "là tam giác cân";

            } else {
                return "là tam giác thương";
            }
        } else {
            return "không phải là tam giác ";
        }


    }
}
