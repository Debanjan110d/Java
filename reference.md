Let's go through each part in detail, explaining how Java handles different data types and references, along with additional examples for better understanding.

---

## **1. Primitive Data Types**

**Concept:**  
Primitive data types in Java (like `int`, `double`, `char`, `boolean`) are stored directly in memory, meaning each variable holds its own value. When you assign one primitive variable to another, a new copy is created.

### **Example 1: Primitive Data Type Assignment**

```java
public class PrimitiveExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1; // num2 gets a copy of num1

        num2 = 20; // Changing num2 does not affect num1

        System.out.println("num1 = " + num1); // Output: 10
        System.out.println("num2 = " + num2); // Output: 20
    }
}
```

**Explanation:**

-  `num2 = num1;` copies the value of `num1` into `num2`.
-  Changing `num2` later does not affect `num1` because they are stored separately.

### **Example 2: Primitive Data Inside Methods**

```java
public class PrimitiveMethodExample {
    public static void changeValue(int x) {
        x = 50;
    }

    public static void main(String[] args) {
        int num = 10;
        changeValue(num);
        System.out.println("num = " + num); // Output: 10
    }
}
```

**Key Point:**  
Since Java passes primitives **by value**, the `changeValue()` method does not modify the original variable.

---

## **2. Object References**

**Concept:**  
In Java, objects (like `String`, `Integer`, `ArrayList`, and custom objects) are stored in **heap memory**, and variables store a reference (or memory address) to the object. When assigning an object to another variable, both variables refer to the same object.

### **Example 1: String References**

```java
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1; // Both str1 and str2 refer to "Hello"

        str2 = "Goodbye"; // str2 now refers to a new string, but str1 remains "Hello"

        System.out.println("str1 = " + str1); // Output: Hello
        System.out.println("str2 = " + str2); // Output: Goodbye
    }
}
```

**Explanation:**

-  Strings are **immutable**, meaning any modification creates a new object.
-  `str2 = "Goodbye";` makes `str2` point to a new string, but `str1` remains unchanged.

### **Example 2: Changing Mutable Objects**

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ObjectReferenceExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = person1; // Both person1 and person2 refer to the same object

        person2.name = "Bob"; // Modifying person2 also changes person1

        System.out.println("person1 name: " + person1.name); // Output: Bob
        System.out.println("person2 name: " + person2.name); // Output: Bob
    }
}
```

**Key Takeaways:**

-  Objects are mutable unless explicitly made immutable.
-  Assigning an object reference (`person2 = person1;`) does **not** create a new object.
-  Modifying `person2.name` affects `person1.name` since both reference the same memory location.

---

## **3. Arrays and Their References**

**Concept:**  
Arrays in Java behave like objects. Assigning an array reference to another variable means both variables point to the **same memory location**.

### **Example 1: Array References**

```java
public class ArrayReferenceExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // Both arr1 and arr2 refer to the same array

        arr2[0] = 10; // Changing arr2 affects arr1

        System.out.println("arr1[0] = " + arr1[0]); // Output: 10
        System.out.println("arr2[0] = " + arr2[0]); // Output: 10
    }
}
```

**Key Takeaways:**

-  Unlike primitives, assigning an array to another variable does **not** create a new copy.
-  To create a **new array copy**, use `clone()`:
   ```java
   int[] arr2 = arr1.clone();
   ```

### **Example 2: Passing Arrays to Methods**

```java
public class ArrayMethodExample {
    public static void changeArray(int[] array) {
        array[0] = 99; // This will modify the original array
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        changeArray(numbers);

        System.out.println(numbers[0]); // Output: 99
    }
}
```

**Key Point:**

-  Arrays are **passed by reference**, so modifications inside a method affect the original array.

---

## **4. ArrayLists and Their References**

**Concept:**  
ArrayLists, like arrays, store objects in **heap memory**, and assigning one `ArrayList` to another means both variables refer to the same object.

### **Example 1: ArrayList References**

```java
import java.util.ArrayList;

public class ArrayListReferenceExample {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = list1; // Both list1 and list2 refer to the same list

        list2.set(0, 10); // Changing list2 affects list1

        System.out.println("list1.get(0) = " + list1.get(0)); // Output: 10
        System.out.println("list2.get(0) = " + list2.get(0)); // Output: 10
    }
}
```

**Solution: Creating an Independent Copy**

```java
ArrayList<Integer> list2 = new ArrayList<>(list1);
```

This ensures `list2` gets a new copy, preventing unintended modifications.

### **Example 2: Passing ArrayLists to Methods**

```java
public class ArrayListMethodExample {
    public static void modifyList(ArrayList<Integer> list) {
        list.add(99);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        modifyList(numbers);

        System.out.println(numbers); // Output: [1, 2, 99]
    }
}
```

**Key Point:**

-  **Lists are passed by reference**, so changes inside a method affect the original list.

---

## **Summary**

| Data Type      | Behavior                                              | Example                       |
| -------------- | ----------------------------------------------------- | ----------------------------- |
| **Primitive**  | Stored separately, copying creates a new value        | `int num2 = num1;` (New copy) |
| **String**     | Immutable, modifying creates a new object             | `str2 = "Goodbye";`           |
| **Objects**    | Reference-based, modifying one affects all references | `person2.name = "Bob";`       |
| **Arrays**     | Reference-based, modifying one affects all references | `arr2[0] = 10;`               |
| **ArrayLists** | Reference-based, modifying one affects all references | `list2.set(0, 10);`           |

---

## **Final Thoughts**

-  **Use `clone()` or `new` to create independent copies** for arrays and lists.
-  **Be mindful of passing objects to methods**, as changes persist.
-  **Strings behave differently** due to immutability.
-  **Reference types share memory**, unlike primitives.

---
