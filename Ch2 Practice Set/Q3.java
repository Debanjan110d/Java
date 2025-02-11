import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int user_input = 0;
        int given_number = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        user_input = sc.nextInt();

        if (user_input >= given_number) {
            System.out.println("You entered the correct number.");
        } else {
            System.out.println("You entered the wrong number.");
        }
        sc.close();

    }

}
