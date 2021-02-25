package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;
        System.out.print("Введите х: ");
        double x = scanner.nextDouble();
        if (x >= 5.0){
            y = (x * x - 10.0) / (x + 7.0);
        }else if (x < 5.0 && x > -3.0){
            y = (x + 3.0) * (x * x - 2.0);
        }else {
            y = 420.0;
        }
        System.out.println("y = " + y);
    }
}
