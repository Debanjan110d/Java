### **Method Overloading in Java**

Method overloading is a feature in Java that allows multiple methods in the same class to have the same name but different parameter lists (different number, types, or order of parameters). It enhances code readability and reusability.

---

### **Key Points About Method Overloading:**

1. **Same method name, different parameter list** (number, type, or sequence of parameters).
2. **Return type does NOT matter** for overloading.
3. **Methods can have different access modifiers** (e.g., `public`, `private`, etc.).
4. **Constructors can also be overloaded**.

---

### **Example of Method Overloading:**

```java
class MathOperations {
    // Method with one parameter
    int add(int a) {
        return a + 10;
    }

    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with different parameter types
    double add(double a, double b) {
        return a + b;
    }

    // Method with different order of parameters
    double add(int a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(5));        // Calls method with one int parameter
        System.out.println(obj.add(5, 10));    // Calls method with two int parameters
        System.out.println(obj.add(5.5, 2.2)); // Calls method with two double parameters
        System.out.println(obj.add(5, 2.5));   // Calls method with int and double
    }
}
```

---

### **Output:**

```
15
15
7.7
7.5
```

---

### **Rules of Method Overloading**

✅ Methods **must differ** in the **number, type, or order** of parameters.  
❌ **Same method signature with a different return type is NOT overloading**.

```java
// ❌ This will cause a compilation error
int add(int a, int b) { return a + b; }
double add(int a, int b) { return a + b; } // Error: duplicate method
```

---

### **Why Use Method Overloading?**

-  Improves **code readability**.
-  Reduces **redundancy**.
-  Supports **polymorphism**, making it easier to use the same method for different data types.

---
