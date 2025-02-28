public class methods_in_java {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Method Invocation using object
        int sum = sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // createing new object
        methods_in_java obj_to_divide = new methods_in_java();
        int result = obj_to_divide.divide(num2, num1);
        System.out.println("The division of " + num2 + " and " + num1 + " is: " + result);
    }
}
