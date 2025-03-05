public class Q5 {
    // Recursive method to find the nth Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1)
            return n; // Base cases
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int n = 7; // Example input
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        // Output: Fibonacci number at position 7 is: 13
    }
}
