package homework.LoopHomeWork.java;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {



    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(50);

        int answer;
        int guess = 0;
        final int max = 50;
        int attempts = 0;

        Scanner number = new Scanner(System.in);
        System.out.println("Guess number from 1 and 50. You have 10 attempts!");
        answer = random.nextInt(max) + 1;

        while (guess != answer && attempts < 10) {
            guess = number.nextInt();
            attempts++;
            if (guess > answer) {
                System.out.println("Too high. Try again!");
                System.out.println("This was your " + attempts + " attempt.\n");
            } else if (guess < answer) {
                System.out.println("Too low. Try again!");
                System.out.print("This was your " + attempts + " attempt.\n");
            } else if (guess == answer) {
                System.out.println("Congrats! You guested the number :)");
            }

            if (attempts == 10) {
                System.out.println("You have used all 10 attempts!");
                System.out.println("\nCorrect number was: " + answer);
            }
        }
    }
}





