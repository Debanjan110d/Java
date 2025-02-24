### **Arrays in Java – Examples & Methods with Explanation**

Arrays in Java are used to store multiple values of the same type in a single variable. They are **fixed in size** and **zero-indexed** (i.e., indexing starts from 0). Java provides various methods to manipulate arrays, including built-in methods from the `Arrays` class.

---

## **1. Declaring & Initializing Arrays**

### **1.1 Single-Dimensional Array**

```java
// Declaration
int[] numbers;  // Preferred way
int numbers2[]; // Valid but not preferred

// Initialization
numbers = new int[5];  // Array of size 5

// Declaration + Initialization
int[] arr = {10, 20, 30, 40, 50};

// Accessing elements
System.out.println(arr[0]); // Output: 10

// Modifying an element
arr[2] = 100;
System.out.println(arr[2]); // Output: 100
```

---

### **1.2 Multi-Dimensional Array**

```java
// Declaration and Initialization of 2D Array
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing elements
System.out.println(matrix[1][2]); // Output: 6

// Modifying elements
matrix[2][1] = 20;
System.out.println(matrix[2][1]); // Output: 20
```

---

### **2. Looping Through Arrays**

#### **2.1 Using `for` Loop**

```java
int[] arr = {10, 20, 30, 40, 50};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

#### **2.2 Using `for-each` Loop**

```java
for (int num : arr) {
    System.out.println(num);
}
```

---

### **3. Array Methods (Using `Arrays` Class)**

The `java.util.Arrays` class provides utility methods for working with arrays.

#### **3.1 `Arrays.toString()` – Convert Array to String**

```java
import java.util.Arrays;

int[] arr = {10, 20, 30, 40, 50};
System.out.println(Arrays.toString(arr)); // Output: [10, 20, 30, 40, 50]
```

---

#### **3.2 `Arrays.sort()` – Sorting an Array**

```java
import java.util.Arrays;

int[] numbers = {5, 2, 8, 1, 3};
Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 5, 8]
```

---

#### **3.3 `Arrays.fill()` – Fill an Array with a Specific Value**

```java
import java.util.Arrays;

int[] arr = new int[5];
Arrays.fill(arr, 7);

System.out.println(Arrays.toString(arr)); // Output: [7, 7, 7, 7, 7]
```

---

#### **3.4 `Arrays.copyOf()` – Copy an Array**

```java
import java.util.Arrays;

int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, 3);

System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3]
```

---

#### **3.5 `Arrays.copyOfRange()` – Copy a Range from an Array**

```java
import java.util.Arrays;

int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOfRange(original, 1, 4);

System.out.println(Arrays.toString(copy)); // Output: [2, 3, 4]
```

---

#### **3.6 `Arrays.binarySearch()` – Search for an Element (Requires Sorted Array)**

```java
import java.util.Arrays;

int[] arr = {10, 20, 30, 40, 50};
int index = Arrays.binarySearch(arr, 30);

System.out.println(index); // Output: 2
```

---

#### **3.7 `Arrays.equals()` – Compare Two Arrays**

```java
import java.util.Arrays;

int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
int[] arr3 = {4, 5, 6};

System.out.println(Arrays.equals(arr1, arr2)); // Output: true
System.out.println(Arrays.equals(arr1, arr3)); // Output: false
```

---

#### **3.8 `Arrays.asList()` – Convert Array to List**

```java
import java.util.Arrays;
import java.util.List;

String[] names = {"Alice", "Bob", "Charlie"};
List<String> nameList = Arrays.asList(names);

System.out.println(nameList); // Output: [Alice, Bob, Charlie]
```

---

### **4. Finding Maximum and Minimum in an Array**

```java
import java.util.Arrays;

int[] numbers = {10, 5, 8, 30, 2};

// Sorting the array
Arrays.sort(numbers);

int min = numbers[0]; // First element is min
int max = numbers[numbers.length - 1]; // Last element is max

System.out.println("Min: " + min); // Output: Min: 2
System.out.println("Max: " + max); // Output: Max: 30
```

---

### **5. Finding the Sum and Average of an Array**

```java
int[] numbers = {10, 20, 30, 40, 50};

int sum = 0;
for (int num : numbers) {
    sum += num;
}

double average = (double) sum / numbers.length;

System.out.println("Sum: " + sum);       // Output: Sum: 150
System.out.println("Average: " + average); // Output: Average: 30.0
```

---

### **6. Reversing an Array**

```java
import java.util.Arrays;

int[] arr = {1, 2, 3, 4, 5};
int n = arr.length;

// Swapping elements to reverse the array
for (int i = 0; i < n / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
}

System.out.println(Arrays.toString(arr)); // Output: [5, 4, 3, 2, 1]
```

---

### **7. Checking if an Array Contains an Element**

```java
int[] arr = {10, 20, 30, 40, 50};
int target = 30;
boolean found = false;

for (int num : arr) {
    if (num == target) {
        found = true;
        break;
    }
}

System.out.println(found ? "Element found" : "Element not found"); // Output: Element found
```

---

### **8. Removing an Element from an Array (Creating a New Array)**

```java
import java.util.Arrays;

int[] arr = {10, 20, 30, 40, 50};
int removeIndex = 2;

int[] newArr = new int[arr.length - 1];

for (int i = 0, j = 0; i < arr.length; i++) {
    if (i != removeIndex) {
        newArr[j++] = arr[i];
    }
}

System.out.println(Arrays.toString(newArr)); // Output: [10, 20, 40, 50]
```

---

### **Conclusion**

Java arrays are useful data structures with many built-in methods for manipulation. However, they have a **fixed size**, so for dynamic resizing, consider using **ArrayList** from `java.util`.

---
