package ru.synergyitacademy.lesson8.corverters;

public class CelsiusToFahrenheit implements Converter {

    @Override
    public double convert(double result) {
        return result = 9.0 / 5.0 * result + 32.0;
    }
}
