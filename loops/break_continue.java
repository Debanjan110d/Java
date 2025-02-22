public class break_continue {
    public static void main(String[] args) {
        // Break and continue with loops
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exit the loop if i is equal to 5
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip the current iteration if i is equal to 5
            }
            System.out.println(i);
        }

    }
}
