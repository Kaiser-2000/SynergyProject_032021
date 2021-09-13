package ru.synergyitacademy.lesson8;

import ru.synergyitacademy.lesson8.corverters.*;

import java.util.Scanner;

public class Laucher8 {
    public static void main(String[] args) {

        double result;

        Scanner scan = new Scanner(System.in);

        Converter celsiusToFahrenheit = new CelsiusToFahrenheit();
        Converter celsiusToKelvin = new CelsiusToKelvin();

        Converter kelvinToFahrenheit = new KelvinToFahrenheit();
        Converter kelvinToCelsius = new KelvinToCelsius();

        Converter fahrenheitToKelvin = new FahrenheitToKelvin();
        Converter fahrenheitToCelsius = new FahrenheitToCelsius();


        while (true) {
            System.out.println("Выберите вариант конвертации");
            System.out.println("1 = celsius To Fahrenheit");
            System.out.println("2 = celsius To Kelvin");
            System.out.println("3 = kelvin To Fahrenheit");
            System.out.println("4 = kelvin To Celsius");
            System.out.println("5 = fahrenheit To Kelvin");
            System.out.println("6 = fahrenheit To Celsius");

            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Ведите число");
                    result = celsiusToFahrenheit.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Ведите число");
                    result = celsiusToKelvin.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Ведите число");
                    result = kelvinToFahrenheit.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Ведите число");
                    result = kelvinToCelsius.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 5:
                    System.out.println("Ведите число");
                    result = fahrenheitToKelvin.convert(scan.nextDouble());
                    System.out.println(result);
                    break;
                case 6:
                    System.out.println("Ведите число");
                    result = fahrenheitToCelsius.convert(scan.nextDouble());
                    System.out.println(result);
                    break;

            }
        }
    }
}