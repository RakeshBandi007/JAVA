import java.util.Random;
import java.util.Scanner;

public class BasicNumberGuesser {
    public static void main(String[] args) {
        Random random = new Random();
        int mysteryNumber = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean correctGuess = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Number Guesser Game!");
        System.out.println("I've selected a number between 1 and 100. Can you guess it?");

        while (!correctGuess && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == mysteryNumber) {
                System.out.println("Congratulations! You guessed it!");
                correctGuess = true;
            } else if (playerGuess < mysteryNumber) {
                System.out.println("Nice try, but your guess is too low. Try again.");
            } else {
                System.out.println("Close, but your guess is too high. Try again.");
            }

            attempts++;
        }

        if (!correctGuess) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + mysteryNumber);
        }

        scanner.close();
    }
}
