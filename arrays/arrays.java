package arrays;

class arrays {

    public static void main(String[] args) {

        // There are three main ways to create an array in Java:

        // Declare an integer array named 'marks' and allocate memory for 5 integers.
        // The array 'marks' can hold 5 integer values, and each element is initialized
        // to 0 by default.
        int[] marks = new int[5];// Declaration + memory allocation

        // Or

        // int [] marks; This is declaration
        // marks = new int[5]; This is memory allocation

        // OR
        // int[] marks = { 10, 20, 30, 40, 50 }; Declereation + Initialization

        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;
        // marks[6] = 50; Throws an Error as the size of the array is 5

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}