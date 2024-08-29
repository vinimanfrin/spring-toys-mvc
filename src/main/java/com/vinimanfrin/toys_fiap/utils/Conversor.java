package com.vinimanfrin.toys_fiap.utils;

public class Conversor {

    public static Double long2Double(Long value) {
        return value.doubleValue() / 100;
    }

    public static Long double2Long(Double value) {
        return Math.round(value * 100);
    }
}
