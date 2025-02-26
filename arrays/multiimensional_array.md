### **Multidimensional Array in Java**

In Java, a **multidimensional array** is essentially an array of arrays. The most common type is a **2D array**, which represents a matrix.

---

### **Syntax for Declaring a Multidimensional Array**

```java
datatype[][] arrayName = new datatype[rows][columns];
```

OR

```java
datatype[][] arrayName = {
    {value1, value2},
    {value3, value4}
};
```

---

### **Example: 2D Array (Matrix)**

```java
public class MultiDimArrayExample {
    public static void main(String[] args) {
        // Declare and Initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements and printing the 2D array
        for (int i = 0; i < matrix.length; i++) { // Rows
            for (int j = 0; j < matrix[i].length; j++) { // Columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Output:**

```
1 2 3
4 5 6
7 8 9
```

---

### **Jagged Array (Irregular Multidimensional Array)**

A **jagged array** is an array where each row can have a different number of columns.

```java
public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare a jagged array
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Output:**

```
1 2
3 4 5
6
```

---

### **3D Array Example**

```java
public class ThreeDArrayExample {
    public static void main(String[] args) {
        int[][][] threeDArray = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }
        };

        // Access and print the 3D array
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
```

**Output:**

```
1 2
3 4

5 6
7 8
```

---

### **Key Points:**

✔ A multidimensional array is an array of arrays.  
✔ 2D arrays are commonly used for tables or matrices.  
✔ Jagged arrays allow different row lengths.  
✔ 3D arrays store data in a cube-like structure.

---
