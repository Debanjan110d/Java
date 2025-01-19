
// Scanner class
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        // The Scanner object sc is created to read input from the standard input stream
        // (System.in), which is typically the keyboard
        Scanner sc = new Scanner(System.in);// Read form the keyboard "System.in" is a standard input stream
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        System.out.println("Enter Number 3");
        float c = sc.nextFloat();
        float sum = a + b + c;
        System.out.println("Sum of three numbers is: " + sum);
        System.out.println("Sum of three numbers is: " + (a + b + c));
        // nextBoolean() method
        System.out.println("Enter a boolean value: ");
        boolean val = sc.nextBoolean();
        System.out.println("You entered: " + val);
        // nextLine() method
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        // hasNext() method
        System.out.println("Has next int? " + sc.hasNextInt());
        System.out.println("Has next float? " + sc.hasNextFloat());
        System.out.println("Has next boolean? " + sc.hasNextBoolean());
        System.out.println("Has next line? " + sc.hasNextLine());
        // close() method
        sc.close();
    }
}
// THis is optional if you do not want to get a litle line under scanner class
// you can use this . This is bascically a try-catch error method
// Without these the code will also work
// but if you are using this in a big project you should use this to avoid
// errors
// You should use this

// try (Scanner sc = new Scanner(System.in)) {
// System.out.println("Enter Number 1");
// int a = sc.nextInt();
// System.out.println("Enter Number 2");
// int b = sc.nextInt();
// System.out.println("Enter Number 3");
// int c = sc.nextInt();
// int sum = a + b + c;
// System.out.println("Sum of three numbers is: " + sum);
// }