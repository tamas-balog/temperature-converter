package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TemperatureConverterTest {
    TemperatureConverter converter;
    private static final int ROUND_PLACES = 8;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    public void test0KelvinToCelsius() {
        Assertions.assertEquals(-273.15, converter.kelvinToCelsius(0));
    }

    @Test
    public void test0CelsiusToKelvin() {
        Assertions.assertEquals(273.15, converter.celsiusToKelvin(0));
    }

    @Test
    public void test0FahrenheitToCelsius() {
        Assertions.assertEquals(-17.77777778, round(converter.fahrenheitToCelsius(0), ROUND_PLACES));
    }

    @Test
    public void test0CelsiusToFahrenheit() {
        Assertions.assertEquals(32, converter.celsiusToFahrenheit(0));
    }

    @Test
    public void test0KelvinToFahrenheit() {
        Assertions.assertEquals(-459.67, converter.kelvinToFahrenheit(0));
    }

    @Test
    public void test0FahrenheitToKelvin() {
        Assertions.assertEquals(255.37222222, round(converter.fahrenheitToKelvin(0), ROUND_PLACES));
    }

    @Test
    public void test451FahrenheitToCelsius() {
        Assertions.assertEquals(232.77777778, round(converter.fahrenheitToCelsius(451), ROUND_PLACES));
    }

    @Test
    public void testRealNumberKelvinToFahrenheit() {
        Assertions.assertEquals(-59.4, round(converter.kelvinToFahrenheit(222.37222222), ROUND_PLACES));
    }

    @Test
    void shouldThrowExceptionIfSmallerThanAbsoluteZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> converter.kelvinToCelsius(-1));
    }

    @Test
    void shouldThrowExceptionIfResultIsSmallerThanAbsoluteZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> converter.celsiusToKelvin(-278.15));
    }

    public static double round(double number, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = BigDecimal.valueOf(number);
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}