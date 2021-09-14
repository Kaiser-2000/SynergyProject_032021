package ru.synergyitacademy.lesson8.converters.impl;

import ru.synergyitacademy.lesson8.converters.Converter;

public class KelvinToCelsius implements Converter {
    @Override
    public double convert(double result) {
        return result = result - 273.15;
    }
}

