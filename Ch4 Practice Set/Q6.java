import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website:");
        String website = sc.nextLine();

        if (website.endsWith(".com")) {
            System.out.println("It is a commercial website.");
        } else if (website.endsWith(".org")) {
            System.out.println("It is an Organizational website.");
        } else if (website.endsWith(".edu")) {
            System.out.println("It is an Educational website.");
        } else if (website.endsWith(".in")) {
            System.out.println("It is an Indian website.");
        } else {
            System.out.println("It is an unknown website.");
        }
        sc.close();
    }
}
