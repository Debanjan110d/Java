public class for_each_loop {
    public static void main(String[] args) {
        float[] marks = { 45.6f, 78.9f, 12.4f, 98.7f, 56.2f, 34.1f, 67.5f, 89.0f, 23.4f, 90.1f };
        // For-Each loop is used to traverse array or collection
        // It will automatically fetch the elements of the array or collection
        // one by one and store in the variable element
        // We can then use the variable element to perform any operation
        for (float element : marks) {
            System.out.println(element);
        }
        System.out.println("Nomal Order");
        // Traverse the array in normal order
        System.out.println("Nomal Order:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // Traverse the array in reverse order
        System.out.println("Reverse Order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }

}
