import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Computer Programming: ");
        float subject1 = sc.nextFloat();

        System.out.print("Enter marks for Data Structures: ");
        float subject2 = sc.nextFloat();

        System.out.print("Enter marks for Computer Organization: ");
        float subject3 = sc.nextFloat();

        System.out.print("Enter marks for Algorithms: ");
        float subject4 = sc.nextFloat();

        float total = subject1 + subject2 + subject3 + subject4;
        float percentage = (total / 400) * 100;

        boolean passedEachSubject = subject1 > 33 && subject2 > 33 && subject3 > 33 && subject4 > 33;
        boolean passedOverall = percentage > 33;

        System.out.println("\n--- Result Card ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + subject1 + ", " + subject2 + ", " + subject3 + ", " + subject4);
        System.out.println("Total: " + total + "/400");
        System.out.println("Percentage: " + percentage + "%");

        if (passedEachSubject && passedOverall) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        sc.close();
    }
}
