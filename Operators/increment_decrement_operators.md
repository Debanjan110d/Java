### **Types of Increment and Decrement in Java**

Java provides **two types** of increment (`++`) and decrement (`--`) operators:

1. **Pre-Increment (`++x`) and Pre-Decrement (`--x`)**
   -  The value is **increased/decreased first**, then used in the expression.
2. **Post-Increment (`x++`) and Post-Decrement (`x--`)**
   -  The current value is used **first**, then incremented or decremented.

---

### **Increment (`++`) and Decrement (`--`) Table**

| **Operator**           | **Description**                        | **Example Before Execution** | **Example After Execution** |
| ---------------------- | -------------------------------------- | ---------------------------- | --------------------------- |
| `++x` (Pre-Increment)  | Increments first, then uses the value. | `x = 5; y = ++x;`            | `x = 6, y = 6`              |
| `x++` (Post-Increment) | Uses the value first, then increments. | `x = 5; y = x++;`            | `x = 6, y = 5`              |
| `--x` (Pre-Decrement)  | Decrements first, then uses the value. | `x = 5; y = --x;`            | `x = 4, y = 4`              |
| `x--` (Post-Decrement) | Uses the value first, then decrements. | `x = 5; y = x--;`            | `x = 4, y = 5`              |

---

### **Example Code:**

```java
public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int x = 5, y;

        // Pre-Increment
        y = ++x;
        System.out.println("Pre-Increment: x = " + x + ", y = " + y); // x=6, y=6

        // Reset x
        x = 5;

        // Post-Increment
        y = x++;
        System.out.println("Post-Increment: x = " + x + ", y = " + y); // x=6, y=5

        // Pre-Decrement
        x = 5;
        y = --x;
        System.out.println("Pre-Decrement: x = " + x + ", y = " + y); // x=4, y=4

        // Post-Decrement
        x = 5;
        y = x--;
        System.out.println("Post-Decrement: x = " + x + ", y = " + y); // x=4, y=5
    }
}
```

---

### **Key Differences:**

-  **Pre-Increment (`++x`) & Pre-Decrement (`--x`)**  
   → **Changes value first**, then assigns it.
-  **Post-Increment (`x++`) & Post-Decrement (`x--`)**  
   → **Assigns value first**, then changes it.

---
