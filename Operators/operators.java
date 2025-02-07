public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        int c = a + b; // addition
        System.out.println(c);

        int d = a - b; // subtraction
        System.out.println(d);

        int e = a * b; // multiplication
        System.out.println(e);

        float f = (float) a / b; // division
        System.out.println(f);

        int g = a % b; // modulus
        System.out.println(g);

        // Relational Operators
        boolean h = a == b; // equal to
        System.out.println(h);

        boolean i = a != b; // not equal to
        System.out.println(i);

        boolean j = a > b; // greater than
        System.out.println(j);

        boolean k = a < b; // less than
        System.out.println(k);

        boolean l = a >= b; // greater than or equal to
        System.out.println(l);

        boolean m = a <= b; // less than or equal to
        System.out.println(m);

        // Logical Operators
        boolean n = (a > b) && (a < b); // logical and
        System.out.println(n);

        boolean o = (a > b) || (a < b); // logical or
        System.out.println(o);

        boolean p = !(a > b); // logical not
        System.out.println(p);

        // Assignment Operators
        int q = 10;
        q += 5; // addition assignment
        System.out.println(q);

        q -= 5; // subtraction assignment
        System.out.println(q);

        q *= 5; // multiplication assignment
        System.out.println(q);

        q /= 5; // division assignment
        System.out.println(q);

        q %= 5; // modulus assignment
        System.out.println(q);

        // Unary Operators
        int r = 10;
        r++; // increment
        System.out.println(r);

        r--; // decrement
        System.out.println(r);

        // Ternary Operator
        int s = 10;
        int t = (s > 5) ? 10 : 20; // ternary operator
        System.out.println(t);

    }
}
