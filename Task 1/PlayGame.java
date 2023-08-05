package Task1;

import java.util.Scanner;

public class PlayGame extends NumberUtils {
    private static final int start = 0;
    private static final int end = 100;
    private static final int maxAttempts = 10;
    private static int score = 0;


    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Scanner sc=new Scanner(System.in);
        boolean playAgain=true;
        while (playAgain) {
            int randomNumber = randomGenerator(start, end);
            for (int attempts = 1; attempts <= maxAttempts; attempts++) {
                int guessedNumber = acceptUserGuess();
                String result = printResult(randomNumber,guessedNumber);
                if (result.equals("Correct")) {
                    score++;
                    System.out.println("Correct answer");
                    break;
                } else {
                    System.out.println(result);
                    if(attempts==maxAttempts){
                        System.out.println("Ran out of attempts");
                        break;
                    }
                }
            }
            while(true) {
                System.out.println("Do you want to play again?");
                String input = sc.next().toLowerCase();
                if (input.equals("no")) {
                    System.out.println("Your score was "+score);
                    playAgain=false;
                    break;
                }
                else if (input.equals("yes")) {
                    break;
                }
                else {
                    System.out.println("Invalid input. Please enter yes or no");
                }
            }
        }
    }
}
