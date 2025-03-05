import java.util.Scanner;

public class Q1 {
    public static void multiplication(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "x" + i + "=" + (a * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        multiplication(num);
        sc.close();
    }
}
