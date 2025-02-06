import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();// to get full name
        System.out.println("Hello " + name);
        sc.close();

        String name2;
        System.out.println("Enter your name: ");
        // Scanner sc = new Scanner(System.in);
        name2 = sc.next();// to get first part of it (it does not takes any spaces as input)
        System.out.println("Hello " + name2);
        sc.close();

    }
}