In Java, **`next`** and **`nextLine`** are methods of the `Scanner` class, but they behave differently when reading input.

### 🔹 `next()`

-  Reads a **single token** (word) from input.
-  It **ignores spaces** and stops reading at a whitespace (space, tab, or newline).
-  If there are multiple words, it only captures the first one.

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();  // Only captures the first word
        System.out.println("Hello, " + name);
    }
}
```

**Input:** `John Doe`  
**Output:** `Hello, John` (Only captures "John", ignores "Doe")

---

### 🔹 `nextLine()`

-  Reads the **entire line** including spaces until it encounters a **newline (`\n`)**.
-  Used when you need to capture full sentences or multi-word input.

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();  // Captures entire line
        System.out.println("Hello, " + fullName);
    }
}
```

**Input:** `John Doe`  
**Output:** `Hello, John Doe` (Captures the full input)

---

### ❗ Important Issue: `nextLine()` After `next()`

If you use `nextLine()` **after `next()`, `nextInt()`, `nextDouble()`, etc.**, the `nextLine()` **might not work properly** because it reads the **leftover newline character** from the previous input.

Fix:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = scanner.nextInt();
scanner.nextLine();  // Consume the leftover newline

System.out.print("Enter your name: ");
String name = scanner.nextLine();  // Now it works properly

System.out.println("Hello " + name + ", age " + age);
```
