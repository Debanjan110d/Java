public class logical_operators {
    public static void main(String[] args) {
        // Relational Operators
        int a = 5;
        int b = 10;

        boolean isEqual = (a == b); // equal to (true if both values are equal)
        System.out.println("a == b: " + isEqual);

        boolean isNotEqual = (a != b); // not equal to (true if both values are not equal)
        System.out.println("a != b: " + isNotEqual);

        boolean isGreater = (a > b); // greater than (true if a is greater than b)
        System.out.println("a > b: " + isGreater);

        boolean isLess = (a < b); // less than (true if a is less than b)
        System.out.println("a < b: " + isLess);

        boolean isGreaterOrEqual = (a >= b); // greater than or equal to (true if a is greater than or equal to b)
        System.out.println("a >= b: " + isGreaterOrEqual);

        boolean isLessOrEqual = (a <= b); // less than or equal to (true if a is less than or equal to b)
        System.out.println("a <= b: " + isLessOrEqual);

    }
}
