import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your income: ");
        String incomeStr = scanner.nextLine();

        double income;
        if (incomeStr.endsWith("L")) {
            income = Double.parseDouble(incomeStr.replace("L", "")) * 1_00_000;
        } else {
            income = Double.parseDouble(incomeStr);
        }

        double tax = 0;

        if (income <= 2_50_000) {
            tax = 0;
        } else if (income <= 10_00_000) {
            tax = 0.05 * (income - 2_50_000);
        } else if (income <= 15_00_000) {
            tax = 0.05 * (10_00_000 - 2_50_000) + 0.10 * (income - 10_00_000);
        } else if (income <= 50_00_000) {
            tax = 0.05 * (10_00_000 - 2_50_000) + 0.10 * (15_00_000 - 10_00_000) + 0.15 * (income - 15_00_000);
        } else {
            tax = 0.05 * (10_00_000 - 2_50_000) + 0.10 * (15_00_000 - 10_00_000) + 0.15 * (50_00_000 - 15_00_000)
                    + 0.25 * (income - 50_00_000);
        }

        System.out.println("Your income tax is: " + tax);

        scanner.close();
    }
}
