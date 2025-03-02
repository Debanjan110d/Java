import java.util.ArrayList;

public class changing {

    // Example of changing a primitive data type
    public static void primitiveDataTypeExample() {
        int num1 = 10;
        int num2 = num1; // num2 gets a copy of num1

        num2 = 20; // Changing num2 does not affect num1
        System.out.println("Primitive Data Type Example:");
        System.out.println("num1 = " + num1); // Still 10
        System.out.println("num2 = " + num2); // Changed to 20
        System.out.println();
    }

    // Example of changing an object reference
    public static void objectReferenceExample() {
        String str1 = "Hello";
        String str2 = str1; // Both point to "Hello"

        str2 = "Goodbye"; // str2 now points to a new string, str1 remains "Hello"
        System.out.println("Object Reference Example:");
        System.out.println("str1 = " + str1); // Still "Hello"
        System.out.println("str2 = " + str2); // "Goodbye"
        System.out.println();
    }

    // Example of changing an array (mutable reference type)
    public static void arrayReferenceExample() {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1; // Both refer to the same array

        arr2[0] = 10; // Modifying arr2 also affects arr1
        System.out.println("Array Reference Example:");
        System.out.println("arr1[0] = " + arr1[0]); // Changed to 10
        System.out.println("arr2[0] = " + arr2[0]); // Also 10
        System.out.println();
    }

    // Example of changing an ArrayList (mutable reference type)
    public static void arrayListReferenceExample() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = list1; // Both refer to the same list

        list2.set(0, 10); // Modifying list2 also affects list1
        System.out.println("ArrayList Reference Example:");
        System.out.println("list1.get(0) = " + list1.get(0)); // Changed to 10
        System.out.println("list2.get(0) = " + list2.get(0)); // Also 10
        System.out.println();
    }

    public static void main(String[] args) {
        primitiveDataTypeExample();
        objectReferenceExample();
        arrayReferenceExample();
        arrayListReferenceExample();
    }
}
