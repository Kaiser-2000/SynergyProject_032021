package ru.synergyitacademy.lesson8.converters.impl;

import ru.synergyitacademy.lesson8.converters.Converter;

public class FahrenheitToCelsius implements Converter {
    @Override
    public double convert(double result) {
        return result = 5.0 / 9.0 * (result - 32.0);
    }
}

