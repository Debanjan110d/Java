In Java, there are **four types of loops**:

1. **for loop**
2. **while loop**
3. **do-while loop**
4. **for-each loop (enhanced for loop)**

---

## 1. **for loop**

The `for` loop is used when the number of iterations is known beforehand. It consists of three parts:

-  **Initialization:** Executes once at the beginning of the loop.
-  **Condition:** Evaluated before each iteration. The loop runs while the condition is `true`.
-  **Update:** Executed after each iteration.

### Syntax:

```java
for(initialization; condition; update) {
    // Code to be executed
}
```

### Example:

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

**Output:**

```
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
```

---

## 2. **while loop**

The `while` loop is used when the number of iterations is **not known** beforehand. It checks the condition before executing the loop body.

### Syntax:

```java
while(condition) {
    // Code to be executed
}
```

### Example:

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }
}
```

**Output:**

```
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
```

---

## 3. **do-while loop**

The `do-while` loop is similar to the `while` loop, but it ensures that the loop body runs **at least once**, even if the condition is false.

### Syntax:

```java
do {
    // Code to be executed
} while(condition);
```

### Example:

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}
```

**Output:**

```
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
```

✅ **Difference between `while` and `do-while` loops:**

-  `while` checks the condition **before** executing the loop body.
-  `do-while` executes the loop body **at least once** before checking the condition.

---

## 4. **for-each loop (Enhanced for loop)**

This loop is used to iterate over arrays and collections like `ArrayList`. It simplifies iteration by eliminating the need for an index variable.

### Syntax:

```java
for(dataType variable : collection) {
    // Code to be executed
}
```

### Example:

```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```

**Output:**

```
10
20
30
40
50
```

✅ **Advantages of `for-each` loop:**

-  No need to manage the index manually.
-  Avoids errors like `ArrayIndexOutOfBoundsException`.
-  Useful for iterating over arrays and collections.

---

## 🔥 **Key Differences Between Loops**

| Loop Type       | Condition Check              | Best Used For                        |
| --------------- | ---------------------------- | ------------------------------------ |
| `for` loop      | Before iteration             | When number of iterations is known   |
| `while` loop    | Before iteration             | When number of iterations is unknown |
| `do-while` loop | After first iteration        | Ensuring at least one execution      |
| `for-each` loop | N/A (Iterates over elements) | Arrays and collections               |
