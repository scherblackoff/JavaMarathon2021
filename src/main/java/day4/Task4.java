package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[] matrix = new int[100];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(10001);
        }
        int maxSum = 0;
        int startMaxSum = 0;
        int countSum = 3;
        for (int i = 0; i < matrix.length - countSum; i++) {
            int sum = 0;
            for (int j = 0; j < countSum; j++) {
                sum += matrix[i + j];
            }
            if (sum > maxSum){
                maxSum = sum;
                startMaxSum = i;
            }
        }
        System.out.println(maxSum + " \n" + startMaxSum);
    }
}
