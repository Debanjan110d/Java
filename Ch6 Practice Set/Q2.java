public class Q2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == 4) {
                isPresent = true;
                break;
            }
        }
        if (isPresent) {
            System.out.println("The number 4 is present in the array");
        } else {
            System.out.println("The number 4 is not present in the array");
        }
    }
}
