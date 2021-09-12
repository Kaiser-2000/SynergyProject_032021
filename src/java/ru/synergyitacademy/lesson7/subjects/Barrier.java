package ru.synergyitacademy.lesson7.subjects;

import ru.synergyitacademy.lesson7.athletes.Athlet;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean action(Athlet athlet);


}