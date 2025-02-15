
public class Q4 {
    public static void main(String[] args) {
        String str = "Hello   World";
        if (str.contains("  ") || str.contains("   ")) {
            System.out.println("String contains 2 or 3 spaces");
        } else {
            System.out.println("String does not contain 2 or 3 spaces");
        }
    }
}
