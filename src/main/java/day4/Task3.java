package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[][] matrix = new int[12][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51);
                if (matrix[i][j] - 10 < 0){
                    System.out.print(matrix[i][j] + "  ");
                }else{
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        int maxSum = 0;
        int maxI = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumLine = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumLine += matrix[i][j];
            }
            if (sumLine >= maxSum){
                maxSum = sumLine;
                maxI = i;
            }
        }
        System.out.println("Максимальная сумма в строке под индексом " + maxI);
    }
}
