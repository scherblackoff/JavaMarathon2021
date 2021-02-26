package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] matrix = new int[length];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(11);
        }
        int countGreaterThanEight = 0;
        int countEqualsOne = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;
        System.out.println();
        for (int number:
             matrix) {
            System.out.print(number + " ");
            if (number > 8){
                countGreaterThanEight++;
            }
            if (number == 1){
                countEqualsOne++;
            }
            if (number%2==0){
                countEven++;
            }else{
                countOdd++;
            }
            sum += number;
        }
        System.out.println("\n\nИнформация о массиве" +
                "\nДлина: " + matrix.length +
                "\nКоличество элементов больших чем 8: " + countGreaterThanEight +
                "\nКоличество элементов равных 1: " + countEqualsOne +
                "\nКоличество четных элементов: " + countEven +
                "\nКоличество нечетных элементов: " + countOdd +
                "\nСумма всех элеметов: " + sum
        );
        scanner.close();
    }
}
