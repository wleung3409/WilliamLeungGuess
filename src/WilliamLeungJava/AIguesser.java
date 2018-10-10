package WilliamLeungJava;

public class AIguesser {
    public static void AIguesser(int guess){
        int AIguess = 0;
        while (AIguess<guess){
            AIguess= AIguess +10;
        }
        if (AIguess==guess){
            System.out.println("Easy");
        }
    }
}
