package org.example;

public class TemperatureConverter {
    private static final double ABSOLUTE_ZERO_IN_CELSIUS = -273.15;
    private static final double ABSOLUTE_ZERO_IN_FAHRENHEIT = -459.67;
    private static final double FAHRENHEIT_RATIO = 5.0 / 9;
    private static final double FAHRENHEIT_CELSIUS_OFFSET = 32;

    public double kelvinToCelsius(double kelvin) {
        return kelvin + ABSOLUTE_ZERO_IN_CELSIUS;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius - ABSOLUTE_ZERO_IN_CELSIUS;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_CELSIUS_OFFSET) * FAHRENHEIT_RATIO;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * (FAHRENHEIT_RATIO * -1) + FAHRENHEIT_CELSIUS_OFFSET;
    }

    public double kelvinToFahrenheit(double kelvin) {
        return kelvin * (FAHRENHEIT_RATIO * -1) + ABSOLUTE_ZERO_IN_FAHRENHEIT;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - ABSOLUTE_ZERO_IN_FAHRENHEIT) * FAHRENHEIT_RATIO;
    }
}