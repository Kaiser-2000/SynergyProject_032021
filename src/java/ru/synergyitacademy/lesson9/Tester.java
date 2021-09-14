package ru.synergyitacademy.lesson9;


public class Tester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car.Human human = new Car.Human("Артём Ф. Ф.");
        Car car = new Car("Mercedes", "E63", human);
        Car.Human copyHuman = human;
        Car copyCar = car;
        Car.Human cloneHuman = human.clone();
        Car cloneCar = car.clone();
        System.out.println("Оригинал:");
        System.out.println("Водитель: " + human);
        System.out.println("Автомобиль: " + car);
        System.out.println(human.print());
        System.out.println(car.print());
        System.out.println("Копия:");
        System.out.println("Водитель: " + copyHuman);
        System.out.println("Автомобиль: " + copyCar);
        System.out.println(copyHuman.print());
        System.out.println(copyCar.print());
        System.out.println("Клон:");
        System.out.println("Водитель: " + cloneHuman);
        System.out.println("Автомобиль: " + cloneCar);
        System.out.println(cloneHuman.print());
        System.out.println(cloneCar.print());
        car.setBrand("Nisan");
        car.setModel("Sunny ");
        human.setNameDriver("Владимир П. В.");
        System.out.println("Объект:");
        System.out.println("Водитель: " + human);
        System.out.println("Автомобиль: " + car);
        System.out.println(car.print());
        System.out.println("Копия:");
        System.out.println("Водитель: " + copyHuman);
        System.out.println("Автомобиль: " + copyCar);
        System.out.println(copyCar.print());
        System.out.println("Клон:");
        System.out.println("Водитель: " + cloneHuman);
        System.out.println("Автомобиль: " + cloneCar);
        System.out.println(cloneCar.print());
    }
}