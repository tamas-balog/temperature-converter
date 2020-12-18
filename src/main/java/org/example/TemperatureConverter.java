package org.example;

public class TemperatureConverter {
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius*9/5+32;
    }
}
