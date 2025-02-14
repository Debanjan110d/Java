import java.util.Scanner;

public class srings {

    public static void main(String[] args) {
        // String name = new String("Debanjan");

        // Or

        String name = "Debanjan";
        System.out.print("The name is : ");
        System.out.println(name);

        int a = 10;
        float b = 10.0f;
        System.out.printf("The value of a is %d and b is %f", a, b);
        System.out.println();// Used just to create a gap
        // or
        System.out.format("The value of a is %d and b is %f", a, b);

        System.out.println();// Used just to create a gap

        // To take input as a string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name2 = sc.nextLine();
        System.out.println("Hello " + name2);
        sc.close();
    }

}
