
public class Q1 {
    public static void main(String[] args) {
        float[] arr = { 1.1f, 2.2f, 3.3f, 4.4f };
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            // sum += arr[i];
            // or
            sum = sum + arr[i];

        }
        System.out.println("The sum is: " + sum);
    }
}
