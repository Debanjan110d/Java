import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the star triangle: ");
        int size = sc.nextInt();
        int i = 0;
        while (i < size) {
            int j = 0;
            while (j < size - i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
