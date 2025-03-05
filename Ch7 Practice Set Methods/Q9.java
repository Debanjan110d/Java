import java.util.Scanner;

public class Q9 {
    public static void celciusToFahrenheit(int celcius) {
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(celcius + " degree celcius is equal to " + fahrenheit + " degree fahrenheit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius: ");
        int celcius = sc.nextInt();
        celciusToFahrenheit(celcius);
        sc.close();
    }
}
