# Recursion in Java (With Examples and Detailed Explanation)

Recursion is a technique in programming where a method calls itself to solve smaller instances of the problem until it reaches a base case. It is commonly used for problems that can be broken down into smaller, similar subproblems, such as factorial computation, Fibonacci sequence generation, and tree traversal.

---

## **Understanding Recursion**

A recursive method consists of:

1. **Base Case**: The condition that stops the recursion.
2. **Recursive Case**: The method calls itself to solve a smaller version of the problem.

---

## **Example 1: Factorial Using Recursion**

Factorial of a number \( n \) is defined as:
\[
n! = n \times (n-1) \times (n-2) \times ... \times 1
\]
or recursively:
\[
n! = n \times (n-1)!
\]
with the base case:
\[
0! = 1
\]

### **Code Implementation**

```java
class Factorial {
    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0) {  // Base case
            return 1;
        }
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
```

### **Output**

```
Factorial of 5 is: 120
```

---

## **Example 2: Fibonacci Series Using Recursion**

The Fibonacci series is defined as:
\[
F(n) = F(n-1) + F(n-2)
\]
with base cases:
\[
F(0) = 0, F(1) = 1
\]

### **Code Implementation**

```java
class Fibonacci {
    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) return 0; // Base case
        if (n == 1) return 1; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
```

### **Output**

```
Fibonacci number at position 7 is: 13
```

⚠️ **Drawback**: The above implementation has exponential time complexity (\(O(2^n)\)). We can optimize it using **Memoization (Dynamic Programming)**.

---

## **Example 3: Sum of Digits Using Recursion**

Given a number, find the sum of its digits using recursion.

### **Code Implementation**

```java
class SumOfDigits {
    // Recursive method to find sum of digits
    static int sumDigits(int n) {
        if (n == 0) return 0; // Base case
        return (n % 10) + sumDigits(n / 10); // Recursive call
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of digits of " + num + " is: " + sumDigits(num));
    }
}
```

### **Output**

```
Sum of digits of 1234 is: 10
```

---

## **Example 4: Reverse a String Using Recursion**

### **Code Implementation**

```java
class ReverseString {
    // Recursive method to reverse a string
    static String reverse(String str) {
        if (str.isEmpty()) return str; // Base case
        return reverse(str.substring(1)) + str.charAt(0); // Recursive call
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed string: " + reverse(str));
    }
}
```

### **Output**

```
Reversed string: olleh
```

---

## **Example 5: Tower of Hanoi Problem**

The **Tower of Hanoi** is a classic recursive problem where you move disks from one peg to another following these rules:

1. You can only move one disk at a time.
2. A larger disk cannot be placed on a smaller disk.
3. You can use an auxiliary peg.

### **Code Implementation**

```java
class TowerOfHanoi {
    static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'C', 'B');
    }
}
```

### **Output**

```
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C
```

---

## **Advantages of Recursion**

✅ **Simplifies code**: Recursion can make code more readable for problems like tree traversal and backtracking.  
✅ **Natural fit for divide-and-conquer**: Problems like merge sort and quicksort are efficiently implemented using recursion.

---

## **Disadvantages of Recursion**

❌ **Performance overhead**: Recursion involves function call overhead, which can lead to **stack overflow** if the recursion depth is too large.  
❌ **Memory usage**: Recursive calls use the **call stack**, consuming more memory compared to iterative approaches.

---

## **Tail Recursion (Optimization)**

A **tail-recursive function** is one where the recursive call is the last operation performed before returning a result. Some compilers optimize tail-recursive functions to avoid excessive stack usage.

### **Example: Factorial Using Tail Recursion**

```java
class TailRecursiveFactorial {
    static int factorial(int n, int result) {
        if (n == 0) return result; // Base case
        return factorial(n - 1, n * result); // Tail recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num, 1));
    }
}
```

### **Why is it better?**

The function does not need to keep track of previous states, reducing memory usage.

---

## **Conclusion**

Recursion is a powerful concept in Java, useful for problems that can be broken down into smaller subproblems. However, it should be used cautiously, as excessive recursion can lead to performance and memory issues. When possible, **tail recursion** or **iterative approaches** should be considered for optimization.
