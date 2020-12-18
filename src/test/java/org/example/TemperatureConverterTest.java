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
}