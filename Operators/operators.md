### **Operators Precedence and Associativity in Programming**

When writing expressions in programming, multiple operators can appear in a single statement. To determine how these operators are evaluated, **operator precedence** and **associativity** come into play.

---

## **1. Operator Precedence**

Operator precedence determines the order in which operators are evaluated in an expression. Operators with **higher precedence** are evaluated first before operators with **lower precedence**.

### **Example:**

```python
result = 10 + 5 * 2
print(result)  # Output: 20
```

### **Explanation:**

-  `*` (Multiplication) has higher precedence than `+` (Addition).
-  So, `5 * 2` is evaluated first, resulting in `10 + 10`, which gives `20`.

---

## **2. Operator Associativity**

When two operators have the **same precedence**, the **associativity** rule determines the direction in which they are evaluated.

### **Types of Associativity:**

1. **Left to Right Associativity** (Most operators)

   -  Operators are evaluated from **left to right**.
   -  Example: `+`, `-`, `*`, `/`, `%`, `==`, `&&`, `||`
   -  **Example:**
      ```python
      result = 100 / 10 * 2
      print(result)  # Output: 20.0
      ```
      **Explanation:** Since `/` and `*` have the same precedence and are left-to-right associative, `100 / 10` is evaluated first, giving `10 * 2 = 20.0`.

2. **Right to Left Associativity** (Some operators)
   -  Operators are evaluated from **right to left**.
   -  Example: `=`, `+=`, `-=`, `*=`, `/=`, `**` (Exponentiation in Python)
   -  **Example:**
      ```python
      x = y = 10  # Right to left
      print(x, y)  # Output: 10 10
      ```
      **Explanation:** `y = 10` is evaluated first, then `x = y`.

---

## **3. Operator Precedence Table**

Here’s a table of common operators in Python, ordered from **highest** to **lowest** precedence:

| Precedence      | Operator(s)                                              | Description                       | Associativity        |
| --------------- | -------------------------------------------------------- | --------------------------------- | -------------------- | ------------- |
| **1** (Highest) | `()`                                                     | Parentheses (Grouping)            | Left to Right        |
| **2**           | `**`                                                     | Exponentiation                    | Right to Left        |
| **3**           | `+x`, `-x`, `~x`                                         | Unary Plus, Minus, Bitwise NOT    | Right to Left        |
| **4**           | `*`, `/`, `//`, `%`                                      | Multiplication, Division, Modulus | Left to Right        |
| **5**           | `+`, `-`                                                 | Addition, Subtraction             | Left to Right        |
| **6**           | `<<`, `>>`                                               | Bitwise Shift Left, Right         | Left to Right        |
| **7**           | `&`                                                      | Bitwise AND                       | Left to Right        |
| **8**           | `^`                                                      | Bitwise XOR                       | Left to Right        |
| **9**           | `                                                        | `                                 | Bitwise OR           | Left to Right |
| **10**          | `==`, `!=`, `>`, `<`, `>=`, `<=`                         | Comparison Operators              | Left to Right        |
| **11**          | `not`                                                    | Logical NOT                       | Right to Left        |
| **12**          | `and`                                                    | Logical AND                       | Left to Right        |
| **13**          | `or`                                                     | Logical OR                        | Left to Right        |
| **14** (Lowest) | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `**=`, `//=`, `&=`, ` | =`, `^=`, `>>=`, `<<=`            | Assignment Operators | Right to Left |

---

## **4. Examples and Explanations**

### **Example 1: Using Parentheses to Control Precedence**

```python
result = (10 + 5) * 2
print(result)  # Output: 30
```

-  Parentheses force `10 + 5` to be evaluated first, so `15 * 2 = 30`.

### **Example 2: Exponentiation and Negation**

```python
print(-3 ** 2)  # Output: -9
```

-  `**` has higher precedence than `-`, so `3 ** 2` is evaluated first (`9`), then `-9`.

---

## **5. Key Takeaways**

1. **Higher precedence operators** are evaluated before lower precedence ones.
2. **Associativity** decides the order when multiple operators of the same precedence exist.
3. **Parentheses** override precedence and are useful for clarity.
4. **Right-to-left operators** include assignment (`=`) and exponentiation (`**`).
5. **Logical operators (`and`, `or`, `not`)** have lower precedence than comparison operators (`==`, `<`, `>`).

---
