import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        int a, b = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();

        System.out.println("Even numbers are: ");

        while (i <= a) {
            System.out.println(i);
            b += i;
            i += 2;

        }
        System.out.println("The sum of even numbers is: " + b);
        sc.close();
    }
}
