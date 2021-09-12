package ru.synergyitacademy.lesson7.subjects;

import ru.synergyitacademy.lesson7.athletes.Athlet;

public class Treadmill extends Barrier{
    private int treadmillLength;

    public Treadmill(String name, int treadmillLength) {
        super(name);
        this.treadmillLength = treadmillLength;
    }

    @Override
    public boolean action(Athlet athlet) {
        System.out.println("Длинна дорожки \"" + super.getName() + "\" составляет: " + this.treadmillLength + " м.");
        athlet.run();
        if (this.treadmillLength <= athlet.treadmillLength()) {
            System.out.println(athlet.nameAthlet() + " выполнил");
            return true;
        } else {
            System.out.println(athlet.nameAthlet() + " не выполнил");
            return false;
        }
    }
}
