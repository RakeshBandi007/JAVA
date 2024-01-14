import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithScore {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Prompt the user if they want to play another round
        Scanner scanner = new Scanner(System.in);
        int totalRounds = 0;
        int roundsWon = 0;

        boolean playAgain = true;

        while (playAgain) {
            int roundsWonInCurrentGame = playGame(random, scanner);

            // Update the total rounds and rounds won
            totalRounds++;
            roundsWon += roundsWonInCurrentGame;

            // Display the current score
            System.out.println("Current Score - Rounds Won: " + roundsWon + " / Total Rounds: " + totalRounds);

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();

            // Check if the user wants to play again
            playAgain = playAgainInput.equals("yes");
        }

        // Display the final score
        System.out.println("Final Score - Rounds Won: " + roundsWon + " / Total Rounds: " + totalRounds);

        // Close the scanner
        scanner.close();
    }

    private static int playGame(Random random, Scanner scanner) {
        // Define the range
        int min = 1;
        int max = 100;

        // Generate a random number within the specified range
        int randomNumber = random.nextInt((max - min) + 1) + min;

        // Set the maximum number of attempts
        int maxAttempts = 5;
        int attempts = 0;

        boolean correctGuess = false;

        // Continue until the user guesses the correct number or runs out of attempts
        while (!correctGuess && attempts < maxAttempts) {
            System.out.println("Guess the number between " + min + " and " + max + ": ");

            // Read the user's input
            int userGuess = scanner.nextInt();

            // Increment the attempts counter
            attempts++;

            // Compare the user's guess with the generated number and provide feedback
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                correctGuess = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        // Display the result of the current round
        if (correctGuess) {
            System.out.println("You won this round!");
            return 1; // Return 1 to indicate a round won
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            return 0; // Return 0 to indicate a round lost
        }
    }
}
