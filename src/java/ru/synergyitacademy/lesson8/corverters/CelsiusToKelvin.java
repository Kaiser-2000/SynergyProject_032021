package ru.synergyitacademy.lesson8.corverters;

public class CelsiusToKelvin implements Converter {
    @Override
    public double convert(double result) {
        return result = result + 273.15;
    }
}
