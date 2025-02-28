### **Methods in Java**

A **method** in Java is a block of code that performs a specific task and can be executed when called. Methods help in **code reusability, modularity, and readability**.

## **Types of Methods in Java**

### **1. Predefined Methods (Built-in Methods)**

Java provides several predefined methods in built-in classes like `Math`, `String`, `Arrays`, etc.

#### **Example:**

```java
public class PredefinedMethods {
    public static void main(String[] args) {
        int maxNumber = Math.max(10, 20);  // Returns the maximum of two numbers
        System.out.println("Maximum Number: " + maxNumber);
    }
}
```

---

### **2. User-defined Methods**

These are custom methods created by the programmer to perform specific tasks.

#### **Syntax of a Method**

```java
returnType methodName(parameters) {
    // Method body
    return value;  // (if returnType is not void)
}
```

#### **Example:**

```java
public class UserDefinedMethod {
    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }
}
```

---

## **Method Components**

1. **Method Name** - Identifies the method (e.g., `add`, `display`).
2. **Return Type** - Defines the type of value returned (`int`, `String`, `void`, etc.).
3. **Parameters (Arguments)** - Input values passed to the method.
4. **Method Body** - Contains the logic to execute.
5. **Return Statement** - Returns a value (except for `void` methods).

---

## **Types of User-defined Methods**

### **1. Methods without Parameters & Return Type**

These methods perform a task but do not take input parameters or return values.

#### **Example:**

```java
public class Greeting {
    static void sayHello() {
        System.out.println("Hello, Welcome to Java!");
    }

    public static void main(String[] args) {
        sayHello();  // Calling the method
    }
}
```

---

### **2. Methods with Parameters but No Return Type**

These methods accept arguments but do not return values.

#### **Example:**

```java
public class ParameterizedMethod {
    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        greet("Debanjan");
    }
}
```

---

### **3. Methods with Parameters and Return Type**

These methods accept arguments and return values.

#### **Example:**

```java
public class SquareCalculator {
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square: " + result);
    }
}
```

---

### **4. Methods Without Parameters But With a Return Type**

These methods do not take input but return a value.

#### **Example:**

```java
public class RandomNumber {
    static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        System.out.println("Random Number: " + getRandomNumber());
    }
}
```

---

## **Method Overloading (Same Method Name, Different Parameters)**

Java allows defining multiple methods with the **same name** but with **different parameters** (number or type).

#### **Example:**

```java
public class MethodOverloading {
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 10));      // Calls int version
        System.out.println(multiply(5.5, 2.5));  // Calls double version
    }
}
```

---

## **Static vs Non-Static Methods**

### **1. Static Methods**

-  Declared with the `static` keyword.
-  Can be called without creating an object.
-  Example: `main()` is a static method.

#### **Example:**

```java
public class StaticMethodExample {
    static void displayMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        displayMessage();  // No object needed
    }
}
```

---

### **2. Non-Static Methods**

-  Need an **object** to be called.
-  Cannot be accessed directly in `static` methods like `main()`.

#### **Example:**

```java
public class NonStaticMethodExample {
    void showMessage() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        NonStaticMethodExample obj = new NonStaticMethodExample();
        obj.showMessage();  // Object required to call the method
    }
}
```

---

## **Recursion (Method Calling Itself)**

Recursion is when a method calls itself to solve a problem.

#### **Example (Factorial Calculation):**

```java
public class RecursionExample {
    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
```

---

## **Conclusion**

Methods are essential in Java for organizing code efficiently. Understanding **method types, overloading, static vs non-static methods, and recursion** helps in writing modular and maintainable Java programs.
