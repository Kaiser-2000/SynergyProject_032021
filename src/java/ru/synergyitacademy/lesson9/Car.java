package ru.synergyitacademy.lesson9;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private Human human;

    public Car(String brand, String model, Human human) {
        this.brand = brand;
        this.model = model;
        this.human = human;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        Human newHuman = new Human(human.nameHuman);
        newCar.setHuman(newHuman);
        return newCar;
    }

    public String print() {
        return "Car{" +
                "brend='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", human='" + human.nameHuman + '\'' +
                '}';
    }

    public static class Human implements Cloneable {
        private String nameHuman;

        public Human(String nameHuman) {
            this.nameHuman = nameHuman;
        }

        public void setNameDriver(String namehuman) {
            this.nameHuman = namehuman;
        }

        public Human clone() throws CloneNotSupportedException {
            return (Human) super.clone();
        }

        public String print() {
            return "Human{" +
                    "namehuman='" + nameHuman + '\'' +
                    '}';
        }
    }
}