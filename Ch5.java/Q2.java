import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        a = sc.nextInt();
        System.out.println("Even numbers are: ");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                b += i;
                // or
                // b = b + i;
            }
        }
        System.out.println("The sum of even numbers is: " + b);
        sc.close();
    }
}
