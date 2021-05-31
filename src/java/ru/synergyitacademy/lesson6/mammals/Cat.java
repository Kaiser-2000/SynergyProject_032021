package ru.synergyitacademy.lesson6.mammals;

public class Cat extends Mammals {
    private String voice = "Мяукать";

    public Cat(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + " она умеет " + voice;
    }
}