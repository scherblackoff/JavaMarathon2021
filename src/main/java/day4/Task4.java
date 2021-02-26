package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[] matrix = new int[10];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(10001);
        }
        int maxSum = 0;
        int startMaxSum = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            int sum = matrix[i - 1] + matrix[i] + matrix[i + 1];
            if (sum > maxSum){
                maxSum = sum;
                startMaxSum = i - 1;
            }
        }
        System.out.println(maxSum + " \n" + startMaxSum);
    }
}
