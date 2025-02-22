### `continue` and `break` in Java: Explanation and Examples

In Java, `continue` and `break` are control flow statements that help manage loops effectively.

---

## 🔹 `break` Statement

The `break` statement is used to **terminate** a loop or a switch statement immediately when a condition is met.

### ✅ Example 1: `break` in a loop

```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;  // Exits the loop when i equals 5
            }
            System.out.println(i);
        }
        System.out.println("Loop exited.");
    }
}
```

### 🔹 Output:

```
1
2
3
4
Breaking the loop at i = 5
Loop exited.
```

### 🔹 Explanation:

-  The loop runs from `1` to `10`.
-  When `i == 5`, the `break` statement executes, terminating the loop immediately.

---

## ✅ Example 2: `break` in a `while` loop

```java
public class BreakWhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Loop exited.");
    }
}
```

### 🔹 Output:

```
1
2
3
4
Breaking the loop at i = 5
Loop exited.
```

---

## ✅ Example 3: `break` in a `switch` case

```java
public class BreakSwitchExample {
    public static void main(String[] args) {
        int number = 3;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;  // Exits switch
            default:
                System.out.println("Invalid number");
        }
    }
}
```

### 🔹 Output:

```
Three
```

### 🔹 Explanation:

-  When `number = 3`, the corresponding case executes.
-  `break` prevents fall-through to the next case.

---

## 🔹 `continue` Statement

The `continue` statement is used to **skip** the current iteration and move to the next iteration of the loop.

### ✅ Example 4: `continue` in a loop

```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping number: " + i);
                continue;  // Skips the rest of the loop body for i == 5
            }
            System.out.println(i);
        }
        System.out.println("Loop finished.");
    }
}
```

### 🔹 Output:

```
1
2
3
4
Skipping number: 5
6
7
8
9
10
Loop finished.
```

### 🔹 Explanation:

-  The loop runs from `1` to `10`.
-  When `i == 5`, the `continue` statement **skips** the rest of the loop body and moves to the next iteration.

---

## ✅ Example 5: `continue` in a `while` loop

```java
public class ContinueWhileExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue;
            }
            System.out.println("Odd number: " + i);
        }
    }
}
```

### 🔹 Output:

```
Odd number: 1
Skipping even number: 2
Odd number: 3
Skipping even number: 4
Odd number: 5
Skipping even number: 6
Odd number: 7
Skipping even number: 8
Odd number: 9
Skipping even number: 10
```

### 🔹 Explanation:

-  When `i` is even, the `continue` statement skips the print statement for odd numbers and moves to the next iteration.

---

## 🔹 `break` vs `continue` Summary

| Feature          | `break`                                      | `continue`                         |
| ---------------- | -------------------------------------------- | ---------------------------------- |
| Effect           | Terminates the loop completely               | Skips the current iteration        |
| Where to use     | Loops (`for`, `while`, `do-while`), `switch` | Loops (`for`, `while`, `do-while`) |
| Example use case | Exit a loop early when a condition is met    | Skip specific values in a loop     |

---

### ✅ Example 6: `break` and `continue` together

```java
public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue; // Skip even numbers
            }
            if (i == 9) {
                System.out.println("Breaking the loop at i = " + i);
                break;  // Exit loop when i == 9
            }
            System.out.println("Odd number: " + i);
        }
        System.out.println("Loop finished.");
    }
}
```

### 🔹 Output:

```
Odd number: 1
Skipping even number: 2
Odd number: 3
Skipping even number: 4
Odd number: 5
Skipping even number: 6
Odd number: 7
Skipping even number: 8
Breaking the loop at i = 9
Loop finished.
```

### 🔹 Explanation:

-  The `continue` statement skips even numbers.
-  The `break` statement terminates the loop when `i == 9`.

---

## 🔥 Conclusion

-  Use **`break`** when you need to **stop** a loop early.
-  Use **`continue`** when you need to **skip** an iteration but keep looping.

In summary, **`break`** is used to exit a loop when a condition is met, while **`continue`** is used to skip an iteration without exiting the loop.

---
