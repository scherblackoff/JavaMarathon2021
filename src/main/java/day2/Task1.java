package day2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        while (isContinue) {
            System.out.print("Введите количество этажей в доме: ");
            int floors = scanner.nextInt();
            if (floors < 0) {
                System.out.println("Такого дома не может существовать");
            } else if (floors < 5) {
                System.out.println("Данный дом является малоэтажным");
            } else if (floors < 9) {
                System.out.println("Данный дом является среднеэтажный");
            } else {
                System.out.println("Данный дом является многоэтажным");
            }
            System.out.println("Желаете повторить? 1 - да / 2 - нет");
            int answer = scanner.nextInt();
            isContinue = answer == 1;
        }
    }
}
