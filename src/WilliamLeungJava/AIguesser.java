package WilliamLeungJava;

import java.util.Scanner;

public class AIguesser {
    public static void AIguessLinear(int guess){
        int AIguess = 0;
       for(int x=0;guess!= AIguess;x++){
           AIguess = AIguess + 1;
           }
           System.out.println("Your number is "+ AIguess +" and it took me "+AIguess +" tries");
    }
    public static void AIguessBinary(int guess,int min,int max){
        int AIguess = 50;
        for(int x=0;guess!=AIguess;x++){
            if (AIguess<guess){
                min = AIguess;
                AIguess = max - (min/2);
            }
            if (AIguess>guess){
                max = AIguess;
                AIguess = 
            }

        }
    }
    public static void RandomGuess(String[] args) {
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