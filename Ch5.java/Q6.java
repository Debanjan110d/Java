import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int num2 = num;
        int fact = 1;
        while (num >= 1) {
            fact = fact * num;
            num--;
        }
        System.out.println("The factorial of " + num2 + " is " + fact);
        sc.close();

    }
}
