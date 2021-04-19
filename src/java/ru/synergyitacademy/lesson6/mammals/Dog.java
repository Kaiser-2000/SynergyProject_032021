package ru.synergyitacademy.lesson6.mammals;

public class Dog extends Mammals {
    private String voice = "Гавкать";

    public Dog(String animal) {
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