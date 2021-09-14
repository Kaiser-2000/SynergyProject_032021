package ru.synergyitacademy.lesson8.converters.impl;

import ru.synergyitacademy.lesson8.converters.Converter;

public class CelsiusToKelvin implements Converter {
    @Override
    public double convert(double result) {
        return result = result + 273.15;
    }
}
