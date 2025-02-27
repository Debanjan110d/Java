public class Q3 {
    public static void main(String[] args) {
        float[] arr = { 1.1f, 2.2f, 3.3f, 4.4f };
        float avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        avg = avg / arr.length;
        System.out.println("The average is: " + avg);

    }
}
