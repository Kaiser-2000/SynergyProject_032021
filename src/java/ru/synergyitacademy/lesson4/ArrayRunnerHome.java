package ru.synergyitacademy.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRunnerHome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayFibonacci = new int[30];
        arrayFibonacci[0] = 0;
        arrayFibonacci[1] = 1;
        int counter = 2;
        while (true) {
            System.out.println("Введите интересующий номер последовательности: ");
            String sNum = reader.readLine();
            if ("quit".equals(sNum)) {
                break;
            } else {
                int nNum = Integer.parseInt(sNum);
                if (counter < nNum) {
                    for (int i = counter; i < nNum; i++) {
                        arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
                    }
                    counter = nNum;
                }
                System.out.println(arrayFibonacci[nNum - 1]);
            }
        }
    }
}