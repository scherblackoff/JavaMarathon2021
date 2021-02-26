package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Введите делимое: ");
            double dividend = scanner.nextDouble();
            System.out.print("Введите делитель(если желаете завершить введите 0): ");
            double divider = scanner.nextDouble();
            if (divider == 0){
                break;
            }
            System.out.println(dividend / divider);
        }
        scanner.close();
    }
}
