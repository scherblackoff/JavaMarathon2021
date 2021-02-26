package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isProceed = true;
        while(isProceed){
            System.out.println("Напишите город, а мы вам скажем где он находится.\nДля окончания игры введите STOP");
            String city = scanner.nextLine();
            switch (city){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Данный город находится в России");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Данный город находится в Италии");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Данный город находится в Англии");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Данный город находится в Германии");
                    break;
                case "STOP":
                    isProceed = false;
                    break;
                default:
                    System.out.println("Уххххххх.... такой город нам не известен");
            }
        }
        scanner.close();
    }
}
