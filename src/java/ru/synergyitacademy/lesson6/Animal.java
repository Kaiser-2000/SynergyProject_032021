package ru.synergyitacademy.lesson6;

public class Animal {
    private String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    public void voice() {
        System.out.println(toString());
    }

    public String toString() {
        return " это " + animal;
    }
}