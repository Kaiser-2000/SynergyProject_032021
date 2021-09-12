package ru.synergyitacademy.lesson7.subjects;

import ru.synergyitacademy.lesson7.athletes.Athlet;

public class Wall extends Barrier {
    private int wallHeight;

    public Wall(String name, int wallHeight) {
        super(name);
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean action(Athlet athlet) {
        System.out.println("Высота барьера \"" + super.getName() + "\" составляет: " + this.wallHeight + " м.");
        athlet.jump();
        if (this.wallHeight <= athlet.wallHeight()) {
            System.out.println(athlet.nameAthlet() + " перепрыгнул");
            return true;
        } else {
            System.out.println(athlet.nameAthlet() + " не перепрыгнул");
            return false;
        }
    }
}