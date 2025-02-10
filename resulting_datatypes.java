public class resulting_datatypes {
    public static void main(String[] args) {
        // Resulting Datatypes after Arithmetic Operations

        // 1. byte + byte = int
        byte a = 10;
        byte b = 5;
        int c = a + b; // c is an int
        System.out.println("byte + byte = int: " + c);

        // 2. short + short = int
        short x = 10;
        short y = 5;
        int z = x + y; // z is an int
        System.out.println("short + short = int: " + z);

        // 3. int + int = int
        int p = 10;
        int q = 5;
        int r = p + q; // r is an int
        System.out.println("int + int = int: " + r);

        // 4. long + long = long
        long s = 10L;
        long t = 5L;
        long u = s + t; // u is a long
        System.out.println("long + long = long: " + u);

        // 5. float + float = float
        float v = 10.0f;
        float w = 5.0f;
        float o = v + w; // o is a float
        System.out.println("float + float = float: " + o);

        // 6. double + double = double
        double m = 10.0;
        double n = 5.0;
        double d = m + n; // d is a double
        System.out.println("double + double = double: " + d);

        // 7. int + double = double
        int i = 10;
        double j = 5.0;
        double k = i + j; // k is a double
        System.out.println("int + double = double: " + k);

        // 8. int + float = float
        int l = 10;
        float mm = 5.0f;
        float nn = l + mm; // nn is a float
        System.out.println("int + float = float: " + nn);

        // 9. long + float = float
        long oo = 10L;
        float pp = 5.0f;
        float qq = oo + pp; // qq is a float
        System.out.println("long + float = float: " + qq);

        // 10. double + float = double
        double rr = 10.0;
        float ss = 5.0f;
        double tt = rr + ss; // tt is a double
        System.out.println("double + float = double: " + tt);

    }
}
