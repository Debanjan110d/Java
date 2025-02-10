public class increment_decrement_operators {
    public static void main(String[] args) {
        int x = 10;

        // Increment operator
        x++; // Post-increment: increases x by 1, now x is 11
        System.out.println("Post-increment: " + x);

        ++x; // Pre-increment: increases x by 1, now x is 12
        System.out.println("Pre-increment: " + x);

        // Decrement operator
        x--; // Post-decrement: decreases x by 1, now x is 11
        System.out.println("Post-decrement: " + x);

        --x; // Pre-decrement: decreases x by 1, now x is 10
        System.out.println("Pre-decrement: " + x);

    }
}
