Got it! You want a list of resulting data types when performing arithmetic operations in Java. Here’s a complete reference:

---

### **Resulting Data Types in Java Arithmetic Operations**

| **Operation**        | **Resulting Data Type** |
| -------------------- | ----------------------- |
| `byte + byte`        | `int`                   |
| `short + short`      | `int`                   |
| `int + int`          | `int`                   |
| `long + long`        | `long`                  |
| `float + float`      | `float`                 |
| `double + double`    | `double`                |
| `int + long`         | `long`                  |
| `int + float`        | `float`                 |
| `int + double`       | `double`                |
| `long + float`       | `float`                 |
| `long + double`      | `double`                |
| `float + double`     | `double`                |
| `char + char`        | `int`                   |
| `char + int`         | `int`                   |
| `char + float`       | `float`                 |
| `char + double`      | `double`                |
| `boolean + anything` | **Not Allowed**         |

---

### **Explanation of Rules:**

1. **Small integer types (`byte`, `short`, `char`) are promoted to `int`** before performing arithmetic operations.
2. **Mixed type operations result in the "higher" type.**
   -  `int` + `long` → `long`
   -  `int` + `float` → `float`
   -  `float` + `double` → `double`
3. **`boolean` cannot be used in arithmetic operations.**
4. **Widening conversions** happen automatically, but **narrowing conversions** need explicit casting.
