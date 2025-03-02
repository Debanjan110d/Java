public class method_overloading {
    static void fuu() {
        System.out.println("Good Morning");
    }

    static void fuu(int a) { // the int a here is called parameter
        System.out.println("Good Afternoon " + a);
    }

    public static void main(String[] args) {
        fuu();

        fuu(10);
        // Arguments are actual

    }
    // we can do not overloading doing just only changing the return type of the
    // method
    // Example:

    // static int fuu(int a) { // the int a here is called parameter
    // System.out.println("Good Afternoon " + a);
    // return 10;
    // }
    // This code will not work
}
