package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtils {

    public static int randomGenerator(int start, int end) {
        return (int) (Math.random() * (end - start) + start);
    }

    public static int acceptUserGuess() {
        System.out.println("Enter your guess");
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            return acceptUserGuess();
        }
    }

    public static String printResult(int randomNumber, int userGuess) {
        if (randomNumber == userGuess) {
            return "Correct";
        } else if (userGuess < randomNumber) {
            return "Too Low"+randomNumber;
        } else {
            return "Too High" +randomNumber;
        }
    }
}
