import java.util.Scanner;

public class Q6 {
    static double avg(int... a) {// Take a as an array
        double sum = 0;
        for (int i : a) {// For each element in the array
            sum += i;
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The average of the elements is: " + avg(arr));
        sc.close();

    }
}
