import java.util.Scanner;

public class Q8 {
    static void reverse_design_recursion(int n) {
        if (n > 0) {
            reverse_design_recursion(n - 1);
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        reverse_design_recursion(num);
        sc.close();
    }
}
