package ru.synergyitacademy.lesson7.athletes;

public class Cat implements Athlet {
    private String name;
    private int distance;
    private int height;

    public Cat(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + " пробежал " + this.distance + " м.");
    }
    @Override
    public int treadmillLength() {
        return this.distance;
    }
    @Override
    public void jump() {
        System.out.println("Кот " + this.name + " прыгнул на " + this.height + " м.");
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
