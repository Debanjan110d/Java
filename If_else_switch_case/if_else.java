import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        // using if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num < 10) {
            System.out.println("Number is less than 10");
        } else {
            System.out.println("Number is greater than 10");
        }

    }
}
