package day0;

public class Task1 {
    public static void main(String[] args) {
        String one = "one";
        String two = "two";
        String three = "three";
        System.out.println(one + " " + two + " " + three);
        int x = 5;
        System.out.println(one + " " + two + " " + three + " " + x);

        int value = 0;
        while (value < 10){
             System.out.println(value++);
         }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}