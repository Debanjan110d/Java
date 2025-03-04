### **1. `if-else` Statement in Java**

The `if-else` statement is used for decision-making based on conditions.

#### **Syntax:**

```java
if (condition) {
    // Executes if condition is true
} else {
    // Executes if condition is false
}
```

#### **Example:**

```java
public class IfElseExample {
    public static void main(String[] args) {
        int num = 10;

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
```

### **2. `switch-case` Statement in Java**

The `switch` statement is used when we have multiple options to choose from. It is a cleaner alternative to multiple `if-else` statements.

#### **Syntax:**

```java
switch (expression) {
    case value1:
        // Code block for value1
        break;
    case value2:
        // Code block for value2
        break;
    default:
        // Code block if no case matches
}
```

#### **Example:**

```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend!");
        }
    }
}
```

### **Differences Between `if-else` and `switch`**

| Feature        | `if-else`                         | `switch-case`                                                            |
| -------------- | --------------------------------- | ------------------------------------------------------------------------ |
| Condition Type | Works with boolean conditions     | Works with `int`, `char`, `String`, and `enum` (not boolean expressions) |
| Performance    | Slower for multiple conditions    | Faster for multiple conditions (uses lookup tables)                      |
| Readability    | Complex with many `else if` cases | More readable for multiple fixed values                                  |


