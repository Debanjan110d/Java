
/**
 * The Java program is a number guessing game where the player tries to guess a randomly generated
 * number within a specified range with a limited number of attempts.
 */
import java.util.Random; // Import Random class for random number generation
import java.util.Scanner; // Import Scanner class for user input

class GuessTheNumber {
    private int numberToGuess; // The number the player needs to guess
    private int maxNumber; // Maximum limit for the number to guess

    public GuessTheNumber(int maxNumber) {
        Random random = new Random(); // Create a Random object
        this.maxNumber = maxNumber; // Set the maximum limit
        this.numberToGuess = random.nextInt(maxNumber) + 1; // Generate a random number between 1 and maxNumber
    }

    public int getNumberToGuess() {
        return numberToGuess; // Return the number to guess
    }

    public int getMaxNumber() {
        return maxNumber; // Return the maximum limit
    }
}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input
        int maxNumber = 100; // Maximum number limit
        int maxTries = 10; // Maximum number of attempts
        int highestScore = 0; // Store the highest score

        boolean playAgain = true; // Flag to control the game loop

        while (playAgain) {
            GuessTheNumber guessGame = new GuessTheNumber(maxNumber); // Create a new game instance
            int numberToGuess = guessGame.getNumberToGuess(); // Get the number to guess
            int triesLeft = maxTries; // Set tries left to maxTries
            boolean hasWon = false; // Flag to check if player has won

            System.out.println("\n🎮 New Game Started!");
            System.out.println("Guess the number between 1 and " + maxNumber);
            System.out.println("You have " + maxTries + " tries.");

            while (triesLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt(); // Read player's guess
                triesLeft--; // Decrement tries left

                if (guess == numberToGuess) {
                    System.out.println("🎉 You won! The number was " + numberToGuess);
                    int score = triesLeft + 1; // Calculate score
                    System.out.println("Your score: " + score);
                    if (score > highestScore) {
                        highestScore = score; // Update highest score
                        System.out.println("🏆 New highest score!");
                    } else {
                        System.out.println("Highest score so far: " + highestScore);
                    }
                    hasWon = true; // Set hasWon to true
                    break; // Exit loop
                } else if (guess < numberToGuess) {
                    System.out.println("The number is higher than " + guess);
                } else {
                    System.out.println("The number is lower than " + guess);
                }

                System.out.println("Tries left: " + triesLeft); // Display tries left
            }

            if (!hasWon) {
                System.out.println("❌ You lost! The correct number was " + numberToGuess);
                System.out.println("Highest score so far: " + highestScore);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = input.next().toLowerCase(); // Read user's response
            playAgain = response.equals("yes") || response.equals("y"); // Update playAgain flag
        }

        System.out.println("\nThanks for playing! 👋");
        input.close(); // Close the Scanner
    }
}
