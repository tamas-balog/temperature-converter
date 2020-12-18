package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
    TemperatureConverter converter;

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
        Assertions.assertEquals((-32) * 5.0 / 9, converter.fahrenheitToCelsius(0));
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
        Assertions.assertEquals(459.67 * 5.0 / 9, converter.fahrenheitToKelvin(0));
    }
}