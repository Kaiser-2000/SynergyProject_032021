package ru.synergyitacademy.lesson6.mammals;

import ru.synergyitacademy.lesson6.Animal;

public class Mammals extends Animal {
    private String type = " млекопитающие";

    public Mammals(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + type;
    }
}