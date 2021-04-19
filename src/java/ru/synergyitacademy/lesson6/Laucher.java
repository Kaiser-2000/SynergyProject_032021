package ru.synergyitacademy.lesson6;

import ru.synergyitacademy.lesson6.mammals.*;

import java.util.ArrayList;
import java.util.List;

public class Laucher {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Cat("Кошка"));
        animalsList.add(new Dog("Сабака"));
        animalsList.add(new Cow("Корова"));
        animalsList.add(new Bear("Медведь"));
        animalsList.add(new Squirrel("Белка"));
        for (Animal animal : animalsList) {
            animal.voice();
        }
    }
}