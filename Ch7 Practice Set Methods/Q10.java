import java.util.Scanner;

public class Q10 {
    static void sum(int a) {
        int x = 0;
        for (int i = 0; i <= a; i++) {
            x += i;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sum(num);
        sc.close();

    }
}
