package ru.synergyitacademy.lesson5;

public class Runner {

    public static void main(String[] args) {
        int number = 5;
        int degree = 3;


        Matrix mA1 = new Matrix();
        Matrix mA2 = new Matrix();

        completionMatrix(mA1.getUserMatrix());
        completionMatrix(mA2.getUserMatrix());
        System.out.println("Размер матрицы А: " + mA1.getM() + " х " + mA1.getN());
        mA1.matrixPrint();
        System.out.println("Размер матрицы В: " + mA2.getM() + " х " + mA2.getN());
        mA2.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Сумма матриц А и В:");
        Matrix summaA = mA1.matrixAdd(mA2);
        summaA.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Разность матриц А и В:");
        Matrix deleteA = mA1.matrixDelete(mA2);
        deleteA.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Умножение матрицы А на число: " + number);
        Matrix multiplicationNumberA1 = mA1.matrixMultiplicationNumber(number);
        multiplicationNumberA1.matrixPrint();
        System.out.println("Умножение матрицы B на число: " + number);
        Matrix multiplicationNumberA2 = mA2.matrixMultiplicationNumber(number);
        multiplicationNumberA2.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Умножение матрицы А на матрицу В:");
        try {
            Matrix matrixMultiplicationA = mA1.matrixMultiplication(mA2);
            matrixMultiplicationA.matrixPrint();
        } catch (Exception e) {
            System.out.println("Ошибка! Число столбцов матрицы A:" + mA1.getM() + " не равно числу строк матрицы B: " + mA2.getN());
        }
        System.out.println("--------------------------------------------------------");

        System.out.println("Возведение в степень " + degree + " матрицы А:");
        Matrix matrixSquaringA1 = mA1.matrixSquaring(degree);
        matrixSquaringA1.matrixPrint();
        System.out.println("Возведение в степень " + degree + " матрицы В:");
        Matrix matrixSquaringA2 = mA2.matrixSquaring(degree);
        matrixSquaringA2.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Вычисление определителя матрицы А - 2х2");
        System.out.println(mA1.matrixDeterminant());
        System.out.println("Вычисление определителя матрицы B - 2х2");
        System.out.println(mA2.matrixDeterminant());


        Matrix mB1 = new Matrix();
        Matrix mB2 = new Matrix();

        completionMatrix(mB1.getUserMatrix());
        completionMatrix(mB2.getUserMatrix());
        System.out.println("Размер матрицы А: " + mB1.getM() + " х " + mB1.getN());
        mB1.matrixPrint();
        System.out.println("Размер матрицы В: " + mB2.getM() + " х " + mB2.getN());
        mB2.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Сумма матриц А и В:");
        Matrix summaB = mB1.matrixAdd(mB2);
        summaB.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Разность матриц А и В:");
        Matrix deleteB = mB1.matrixDelete(mB2);
        deleteB.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Умножение матрицы А на число: " + number);
        Matrix multiplicationNumberB1 = mB1.matrixMultiplicationNumber(number);
        multiplicationNumberB1.matrixPrint();
        System.out.println("Умножение матрицы B на число: " + number);
        Matrix multiplicationNumberB2 = mB2.matrixMultiplicationNumber(number);
        multiplicationNumberB2.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Умножение матрицы А на матрицу В:");
        try {
            Matrix matrixMultiplicationB = mB1.matrixMultiplication(mB2);
            matrixMultiplicationB.matrixPrint();
        } catch (Exception e) {
            System.out.println("Ошибка! Число столбцов матрицы A:" + mB1.getM() + " не равно числу строк матрицы B: " + mB2.getN());
        }
        System.out.println("--------------------------------------------------------");

        System.out.println("Возведение в степень " + degree + " матрицы А:");
        Matrix matrixSquaringB1 = mB1.matrixSquaring(degree);
        matrixSquaringB1.matrixPrint();
        System.out.println("Возведение в степень " + degree + " матрицы В:");
        Matrix matrixSquaringB2 = mB2.matrixSquaring(degree);
        matrixSquaringB2.matrixPrint();
        System.out.println("--------------------------------------------------------");

        System.out.println("Вычисление определителя матрицы А - 3х3");
        System.out.println(mB1.matrixDeterminant());
        System.out.println("Вычисление определителя матрицы B - 3х3");
        System.out.println(mB2.matrixDeterminant());

        System.out.println("Возврат единичной матрицы (через статичное поле и метод)");
        Matrix matrixUnit = Matrix.getMatrixUnit();
        matrixUnit.matrixPrint();
        System.out.println("--------------------------------------------------------");
    }


    public static int[][] completionMatrix(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = (int) (Math.random() * 10);
            }
        }
        return input;
    }
}