package org.example;

public class TemperatureConverter {
    private static final double ABSOLUTE_ZERO_IN_CELSIUS = -273.15;
    private static final double ABSOLUTE_ZERO_IN_FAHRENHEIT = -459.67;
    private static final double FAHRENHEIT_RATIO = 5.0 / 9;
    private static final double FAHRENHEIT_CELSIUS_OFFSET = 32;

    public double kelvinToCelsius(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Argument is smaller than absolute zero");
        }
        return kelvin + ABSOLUTE_ZERO_IN_CELSIUS;
    }

    public double celsiusToKelvin(double celsius) {
        double result = celsius - ABSOLUTE_ZERO_IN_CELSIUS;
        if (result < 0) {
            throw new IllegalArgumentException("Argument is smaller than absolute zero");
        }
        return result;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        if (fahrenheit < ABSOLUTE_ZERO_IN_FAHRENHEIT) {
            throw new IllegalArgumentException("Argument is smaller than absolute zero");
        }
        return (fahrenheit - FAHRENHEIT_CELSIUS_OFFSET) * FAHRENHEIT_RATIO;
    }

    public double celsiusToFahrenheit(double celsius) {
        if (celsius < ABSOLUTE_ZERO_IN_CELSIUS) {
            throw new IllegalArgumentException("Argument is smaller than absolute zero");
        }
//        return kelvinToFahrenheit(celsiusToKelvin(celsius));
        return celsius * Math.pow(FAHRENHEIT_RATIO, -1) + FAHRENHEIT_CELSIUS_OFFSET;
    }

    public double kelvinToFahrenheit(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Argument is smaller than absolute zero");
        }
        return kelvin * Math.pow(FAHRENHEIT_RATIO, -1) + ABSOLUTE_ZERO_IN_FAHRENHEIT;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        double result = (fahrenheit - ABSOLUTE_ZERO_IN_FAHRENHEIT) * FAHRENHEIT_RATIO;
        if (result < 0) {
            throw new IllegalArgumentException("Argument is smaller than absolute zero");
        }
        return result;
    }
}