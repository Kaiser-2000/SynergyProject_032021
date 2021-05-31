package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class Lesson_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println("введите количество чисел на вывод");
        int number = sc.nextInt();
        System.out.println(n0 + " ");
        System.out.println(n1 + " ");
        for (int i = 3; i <= number; i++) {
            n2 = n0 + n1;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
