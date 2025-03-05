import java.util.Scanner;

public class Q3_recursion {
    public static int natural_recursion(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + natural_recursion(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = natural_recursion(num);
        System.out.println("The sum of " + num + " natural numbers is: " + sum);
        sc.close();
    }
}
