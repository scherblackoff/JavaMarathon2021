package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[] matrix = new int[100];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(10001);
        }
        int max = 0;
        int min = 10000;
        int countMultipleOfTen = 0;
        int sumMultipleOfTen = 0;
        for (int number:
             matrix) {
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
            if (number % 10 == 0){
                countMultipleOfTen++;
                sumMultipleOfTen += number;
            }
        }
        System.out.println("\n\nИнформация о массиве" +
                "\nМаксимальное число: " + max +
                "\nМинимальное число: " + min +
                "\nКоличество чисел кратных 10: " + countMultipleOfTen +
                "\nСумма чисел кратных 10: " + sumMultipleOfTen
        );
    }
}
