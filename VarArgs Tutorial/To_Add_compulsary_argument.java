
public class To_Add_compulsary_argument {

    public static int sum(int x, int... arr) {// x is a compulsory argument
        int sum = x;
        // iterate over all the elements in the array
        for (int i : arr) {
            // add each element to the sum
            sum += i;
        }
        // return the final sum
        return sum;
    }

    public static void main(String[] args) {
        // System.out.println(sum());// It will through an error
        System.out.println("The Sum of 2 and 3 is: " + sum(2, 3));
        System.out.println("The Sum of 2 and 3 and 4 is: " + sum(2, 3, 4));
        System.out.println("The Sum of 2 and 3 and 4 and 5 is: " + sum(2, 3, 4, 5));
    }
}
