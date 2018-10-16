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
    public static void AIguessBinary(int min,int max){
        int AIguess = max/2;
        System.out.println("Is your number "+AIguess+"? Please reply higher,lower or correct");
        Scanner input = new Scanner(System.in);
        String userinput = input.nextLine();
        int x = 0;
        for (x =0;(!(userinput.equals("correct")));x++) {
            if (userinput.equals("higher")) {
                min = AIguess;
                AIguess = (max + min) / 2;
                System.out.println("Is the value " + AIguess + "?");
                userinput = input.nextLine();
            }
            if (userinput.equals("lower")) {
                max = AIguess;
                AIguess = (max + min) / 2;
                System.out.println("Is the value " + AIguess + "?");
                userinput = input.nextLine();
            }
        }
         System.out.println("Your number is "+AIguess+" and it took me "+(x+1)+" tries");
        }
    public static void RandomGuess() {
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