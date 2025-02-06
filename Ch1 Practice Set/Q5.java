import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // Give the Number to check what type of number it is(Interger or Float)
        System.out.println("Give the Number to check: ");
        Scanner sc = new Scanner(System.in);
        // Simple way
        System.out.println("Is it Integer or Float? " + sc.hasNextInt());
        System.out.println("Is it Integer or Float? " + sc.hasNextFloat());

        // I am making it a little bit complex

        // Check if input is an integer
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("It is an Integer:");
        }
        // Check if input is a float (including decimal numbers)
        else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            System.out.println("It is a Float:");
        }
        // If input is neither an int nor a float
        else {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        // Close the scanner to avoid resource leaks
        sc.close();

    }
}
