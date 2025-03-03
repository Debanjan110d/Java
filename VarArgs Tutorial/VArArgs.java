
public class VArArgs {
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    // NINJA WAY
    /**
     * This method takes variable number of arguments and returns their sum.
     * This is done by using varargs (...) which allows us to pass any number
     * of arguments to the method.
     * 
     * @param arr
     *            int... is a varargs which allows us to pass any number of
     *            arguments to the method.
     * @return int sum of all the elements in the array
     */

    public static int sum(int... arr) {
        int sum = 0;
        // iterate over all the elements in the array
        for (int i : arr) {
            // add each element to the sum
            sum += i;
        }
        // return the final sum
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());// It will not through any error
        System.out.println("The Sum of 2 and 3 is: " + sum(2, 3));
        System.out.println("The Sum of 2 and 3 and 4 is: " + sum(2, 3, 4));
        System.out.println("The Sum of 2 and 3 and 4 and 5 is: " + sum(2, 3, 4, 5));
    }
}
