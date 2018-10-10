package WilliamLeungJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        double x = Math.random();
        int random = (int) (x * 11);
        System.out.println("Guess a number 1-10");
        Scanner input = new Scanner(System.in);
        while (!(input.nextInt() == random)) {
            System.out.println("Try again");
        }
        System.out.println("Congrats you did it!");
    }
}