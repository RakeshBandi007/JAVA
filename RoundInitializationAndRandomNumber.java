import java.util.Random;

public class RoundInitializationAndRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int mysteryNumber = random.nextInt(100) + 1;
    }
}
