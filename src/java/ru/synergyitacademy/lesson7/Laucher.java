package ru.synergyitacademy.lesson7;

import ru.synergyitacademy.lesson7.athletes.Athlet;
import ru.synergyitacademy.lesson7.athletes.Cat;
import ru.synergyitacademy.lesson7.athletes.Human;
import ru.synergyitacademy.lesson7.athletes.Robot;
import ru.synergyitacademy.lesson7.subjects.Barrier;
import ru.synergyitacademy.lesson7.subjects.Treadmill;
import ru.synergyitacademy.lesson7.subjects.Wall;

import java.util.Random;


public class Laucher {
    public static void main(String [] args){
        Barrier[] barrier = new Barrier[9];
        barrier[0] = new Treadmill("Treadmill 1", 30);
        barrier[1] = new Wall("Wall 1", 2);
        barrier[2] = new Treadmill("Treadmill 2", 20);
        barrier[3] = new Wall("Wall 2", 3);
        barrier[4] = new Treadmill("Treadmill 3", 30);
        barrier[5] = new Wall("Wall 3", 1);
        barrier[6] = new Treadmill("Treadmill 4", 10);
        barrier[7] = new Wall("Wall 4 ", 4);
        barrier[8] = new Treadmill("Treadmill 5", 15);

        Athlet[] athlet = new Athlet[9];
        Random random = new Random();
        athlet[0] = new Human("h1", random.nextInt(100),random.nextInt(20));
        athlet[1] = new Human("h2", random.nextInt(100),random.nextInt(20));
        athlet[2] = new Human("h3", random.nextInt(100),random.nextInt(20));
        athlet[3] = new Cat("c1", random.nextInt(100),random.nextInt(20));
        athlet[4] = new Cat("c2", random.nextInt(100),random.nextInt(20));
        athlet[5] = new Cat("c3", random.nextInt(100),random.nextInt(20));
        athlet[6] = new Robot("r1", random.nextInt(100),random.nextInt(20));
        athlet[7] = new Robot("r2", random.nextInt(100),random.nextInt(20));
        athlet[8] = new Robot("r3", random.nextInt(100),random.nextInt(20));
        for (int x = 0; x < athlet.length; x++) {
            boolean winner = true;
            for (int y = 0; y < barrier.length; y++) {
                winner = barrier[y].action(athlet[x]);
                if (!winner) {
                    break;
                }
            }
            if (winner) {
                System.out.println("Спортсмен " + athlet[x].nameAthlet() + " справился");
            } else {
                System.out.println("Спортсмен " + athlet[x].nameAthlet() + " провалился");
            }
            System.out.println();
        }
    }
}