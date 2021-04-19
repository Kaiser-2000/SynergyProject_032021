package ru.synergyitacademy.lesson6.mammals;

public class Bear extends Mammals {
    private String voice = "Реветь";

    public Bear(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + " он умеет " + voice;
    }
}