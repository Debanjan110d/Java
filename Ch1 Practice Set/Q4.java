import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        float km = sc.nextFloat();
        float miles = km * 0.6214f;
        System.out.println(km + " kilometers is equal to " + miles + " miles");
        sc.close();
    }
}
