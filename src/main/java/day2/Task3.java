package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное число: ");
        int a = scanner.nextInt();
        System.out.print("Ввведите конеченое число: ");
        int b = scanner.nextInt();
        if (a < b){
            while (a < b){
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.println(a);
                }
                a ++;
            }
        }else{
            System.out.println("Некорректный ввод");
        }
    }
}
