import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial velocity (u): ");
        double u = sc.nextDouble();
        System.out.println("Enter final velocity (v): ");
        double v = sc.nextDouble();
        System.out.println("Enter acceleration (a): ");
        double a = sc.nextDouble();
        System.out.println("Enter distance (s): ");
        double s = sc.nextDouble();

        double result = (v * v - u * u) / (2 * a * s);
        System.out.println("The result of the equation v^2 - u^2 / 2as is: " + result);
        sc.close();

    }

}
