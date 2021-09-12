
package ru.synergyitacademy.lesson7.athletes;

public class Human implements Athlet {
    private String name;
    private int distance;
    private int height;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        System.out.println("Human " + this.name + " пробежал " + this.distance + " м.");
    }
    @Override
    public int treadmillLength() {
        return this.distance;
    }
    @Override
    public void jump() {
        System.out.println("Human " + this.name + " прыгнул на " + this.height + " м.");
    }

    @Override
    public int wallHeight() {
        return this.height;
    }

    @Override
    public String nameAthlet() {
        return this.name;
    }
}