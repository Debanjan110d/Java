package Rock_Paper_Scesior;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scesior2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("How many rounds would you like to play? (1, 3, 5, 7, 9, 11, 13): ");
        int totalRounds = scanner.nextInt();

        while (totalRounds < 1 || totalRounds > 13 || totalRounds % 2 == 0) {
            System.out.println("Please enter an odd number between 1 and 13: ");
            totalRounds = scanner.nextInt();
        }

        int userWins = 0;
        int computerWins = 0;

        for (int round = 0; round < totalRounds; round++) {
            System.out.println(
                    "Round " + (round + 1) + ": Enter your choice (1 for rock, 2 for paper, 3 for scissors): ");
            int userChoice = scanner.nextInt() - 1;

            while (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 1 for rock, 2 for paper, 3 for scissors: ");
                userChoice = scanner.nextInt() - 1;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            String userChoiceStr = choices[userChoice];

            System.out.println("You chose: " + userChoiceStr);
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice == computerIndex) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerIndex == 2) ||
                    (userChoice == 1 && computerIndex == 0) ||
                    (userChoice == 2 && computerIndex == 1)) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }
        }

        System.out.println("\nFinal Score:");
        System.out.println("You: " + userWins);
        System.out.println("Computer: " + computerWins);

        if (userWins > computerWins) {
            System.out.println("Congratulations, you are the champion!");
        } else {
            System.out.println("Computer is the champion!");
        }

        scanner.close();
    }
}
