### **Java Data Types: Complete Comparison Table** 🚀

In Java, data types are divided into **Primitive** and **Non-Primitive** types.

-  **Primitive Data Types**: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`
-  **Non-Primitive Data Types**: `String`, `Array`, `Class`, `Interface`, etc.

---

## **📌 Primitive Data Types Comparison Table**

| Data Type     | Size                   | Default Value | Range                 | Example                     | Use Case                                                |
| ------------- | ---------------------- | ------------- | --------------------- | --------------------------- | ------------------------------------------------------- |
| **`byte`**    | 1 byte (8-bit)         | `0`           | -128 to 127           | `byte b = 100;`             | When memory is limited (e.g., file handling, streaming) |
| **`short`**   | 2 bytes (16-bit)       | `0`           | -32,768 to 32,767     | `short s = 20000;`          | Useful for saving memory in large arrays                |
| **`int`**     | 4 bytes (32-bit)       | `0`           | -2³¹ to 2³¹-1         | `int num = 123456;`         | Default choice for whole numbers                        |
| **`long`**    | 8 bytes (64-bit)       | `0L`          | -2⁶³ to 2⁶³-1         | `long bigNum = 123456789L;` | Large integer values (banking, timestamps)              |
| **`float`**   | 4 bytes (32-bit)       | `0.0f`        | ~6-7 decimal places   | `float f = 3.14f;`          | Graphics, game development                              |
| **`double`**  | 8 bytes (64-bit)       | `0.0d`        | ~15-16 decimal places | `double d = 3.1415926535;`  | Scientific calculations, finance                        |
| **`char`**    | 2 bytes (16-bit)       | `'\u0000'`    | Unicode 0 to 65,535   | `char ch = 'A';`            | Storing characters (letters, symbols)                   |
| **`boolean`** | 1 bit (depends on JVM) | `false`       | `true / false`        | `boolean flag = true;`      | Conditional checks (flags, switches)                    |

---

## **📌 Key Differences Between Primitive Data Types**

| Feature        | `int`          | `long`              | `float`            | `double`                | `char`           | `boolean`           |
| -------------- | -------------- | ------------------- | ------------------ | ----------------------- | ---------------- | ------------------- |
| Stores         | Whole numbers  | Large whole numbers | Decimal numbers    | High-precision decimals | Single character | True/False          |
| Default Value  | `0`            | `0L`                | `0.0f`             | `0.0d`                  | `'\u0000'`       | `false`             |
| Size           | 4 bytes        | 8 bytes             | 4 bytes            | 8 bytes                 | 2 bytes          | 1 bit               |
| Suffix Needed? | ❌             | ✅ (`L`)            | ✅ (`f`)           | ✅ (`d`)                | ❌               | ❌                  |
| Example        | `int x = 100;` | `long x = 100000L;` | `float x = 3.14f;` | `double x = 3.1415;`    | `char x = 'A';`  | `boolean x = true;` |

---

## **📌 Non-Primitive Data Types**

| Data Type     | Description                             | Example                  | Use Case                          |
| ------------- | --------------------------------------- | ------------------------ | --------------------------------- |
| **String**    | Sequence of characters                  | `String name = "Java";`  | Storing and manipulating text     |
| **Array**     | Collection of elements of the same type | `int[] arr = {1, 2, 3};` | Storing multiple values           |
| **Class**     | Blueprint for objects                   | `class Car {}`           | Object-oriented programming       |
| **Interface** | Collection of abstract methods          | `interface Animal {}`    | Achieving abstraction             |
| **Objects**   | Instances of a class                    | `Car myCar = new Car();` | Real-world representation of data |

---

## **📌 Choosing the Right Data Type**

| Need to Store                            | Best Choice |
| ---------------------------------------- | ----------- |
| Small whole numbers (0-127)              | `byte`      |
| Medium whole numbers (-32,768 to 32,767) | `short`     |
| Default whole numbers                    | `int`       |
| Large whole numbers (beyond `int` limit) | `long`      |
| Decimal numbers (less precision)         | `float`     |
| Decimal numbers (high precision)         | `double`    |
| A single letter or symbol                | `char`      |
| True/False values                        | `boolean`   |
| Multiple characters (words, sentences)   | `String`    |
| A collection of elements                 | `Array`     |
| Custom objects with properties & methods | `Class`     |

---

## **📌 Example: Using Different Data Types in Java**

```java
public class DataTypesExample {
    public static void main(String[] args) {
        byte smallNum = 100;
        int age = 25;
        long population = 8000000000L;  // Needs 'L'
        float pi = 3.14f;  // Needs 'f'
        double precisePi = 3.141592653589793;
        char letter = 'A';
        boolean isJavaFun = true;
        String message = "Hello, Java!";

        System.out.println("Byte: " + smallNum);
        System.out.println("Int: " + age);
        System.out.println("Long: " + population);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + precisePi);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + message);
    }
}
```

---

## **📌 Summary**

| Type      | Default Value | When to Use?                         |
| --------- | ------------- | ------------------------------------ |
| `byte`    | `0`           | Very small numbers, memory-efficient |
| `short`   | `0`           | Slightly larger numbers              |
| `int`     | `0`           | Default for whole numbers            |
| `long`    | `0L`          | Very large whole numbers             |
| `float`   | `0.0f`        | Less precise decimals, graphics      |
| `double`  | `0.0d`        | High-precision calculations          |
| `char`    | `'\u0000'`    | Single character storage             |
| `boolean` | `false`       | True/False conditions                |
| `String`  | `null`        | Text storage and manipulation        |

---

### **📢 Final Notes**

✅ **Use `int` for most whole numbers** unless you need large values (`long`).  
✅ **Use `double` for most decimal calculations** unless memory is a concern (`float`).  
✅ **Use `boolean` for conditional checks** (e.g., `isAvailable`).  
✅ **Use `char` only for single characters** (use `String` for words).  
✅ **Use `String` for text** (e.g., names, messages).

---
