public class ScoringAndRoundSummary {
    public static void main(String[] args) {
        int roundsWon = 0;

        if (correctGuess) {
            System.out.println("You won this round!");
            roundsWon++;
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + mysteryNumber);
        }

        System.out.println("Your Score - Rounds Won: " + roundsWon);
    }
}
