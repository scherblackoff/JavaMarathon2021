package day2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное число: ");
        int a = scanner.nextInt();
        System.out.print("Ввведите конеченое число: ");
        int b = scanner.nextInt();
        if (a < b){
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Некорректный ввод");
        }
    }
}
