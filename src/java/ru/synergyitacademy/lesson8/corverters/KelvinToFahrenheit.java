package ru.synergyitacademy.lesson8.corverters;

public class KelvinToFahrenheit implements Converter {
    @Override
    public double convert(double result) {
        return result = 9.0 / 5.0 * (result - 273.15) + 32.0;
    }
}

