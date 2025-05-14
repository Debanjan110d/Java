## Summary

In Java, the `this` keyword refers to the current object instance and is most commonly used to distinguish between instance variables and parameters or to chain constructors. ([Oracle Docs][1]) The `super` keyword, by contrast, refers to the parent (super) class of the current class, enabling you to invoke superclass constructors, access hidden fields, or call overridden methods. ([Oracle Docs][2]) Understanding how and when to use these keywords is essential for clear object‑oriented design, proper constructor chaining, and method overriding in Java.

---

## Overview of `this` and `super`

### The `this` Keyword

* **Reference to Current Object**: Within any instance method or constructor, `this` points to the object on which the method was invoked. ([Oracle Docs][1])
* **Field Disambiguation**: When constructor or method parameters share names with instance fields, `this.fieldName` refers explicitly to the field, avoiding ambiguity. ([GeeksforGeeks][3])
* **Constructor Chaining**: You can call another constructor in the same class via `this(args…)`, allowing reuse of initialization logic. ([GeeksforGeeks][4])

### The `super` Keyword

* **Reference to Superclass Instance**: Inside a subclass, `super` refers to the parent class portion of the current object, letting you access superclass members that are hidden or overridden. ([Oracle Docs][2])
* **Calling Superclass Constructors**: `super()` (with or without arguments) invokes a matching constructor in the superclass and must be the very first statement in the subclass’s constructor body. ([Oracle Docs][5])
* **Invoking Overridden Methods**: Even if you override a method in the subclass, you can call the original superclass version via `super.methodName(...)`. ([Baeldung][6])

---

## Code Example Breakdown

```java
class EkBaseClass {
    int a;

    // Constructor initializes the field 'a' with the provided value
    EkBaseClass(int v) {
        this.a = v;  // 'this' disambiguates the field from the parameter v
    }

    public int getA() {
        return a;
    }

    public int retirnone() {
        return 1;
    }
}

class EkDerivedClass extends EkBaseClass {

    public EkDerivedClass(int a) {
        super(a);  // Calls EkBaseClass(int) to initialize 'a'
        System.out.println("Derived class constructor called");
    }

    @Override
    public int retirnone() {
        return super.retirnone() + 1;  
        // Calls the base class's retirnone() (which returns 1)
        // then adds 1 to it, resulting in 2
    }
}

public class this_super {
    public static void main(String[] args) {
        EkDerivedClass x = new EkDerivedClass(5);
        System.out.println(x.getA());       // Prints: 5
        System.out.println(x.retirnone());  // Prints: 2
    }
}
```

1. **`this.a = v;`** uses `this` to set the instance field `a` rather than the parameter `v`. ([GeeksforGeeks][3])
2. **`super(a);`** in `EkDerivedClass` invokes the parent constructor to initialize `a` before any other logic. ([GeeksforGeeks][7])
3. **Method Overriding with `super`**: The overridden `retirnone()` calls `super.retirnone()` to reuse the base logic, then extends it. ([GeeksforGeeks][8])

---

## How to Use `this` and `super`

1. **Distinguish Fields from Parameters**

   ```java
   public class Point {
       private int x, y;
       public Point(int x, int y) {
           this.x = x;  // clear assignment to field
           this.y = y;
       }
   }
   ```
2. **Chain Constructors in the Same Class**

   ````java
   public class Rectangle {
       private int width, height;
       public Rectangle() {
           this(1, 1);  // calls the two‑arg constructor
       }
       public Rectangle(int w, int h) {
           this.width = w;
           this.height = h;
       }
   }
   ``` :contentReference[oaicite:11]{index=11}  
   ````
3. **Invoke Superclass Constructor**

   ````java
   public class Square extends Rectangle {
       public Square(int side) {
           super(side, side);  // must be first statement
       }
   }
   ``` :contentReference[oaicite:12]{index=12}  
   ````
4. **Call Overridden Superclass Methods**

   ````java
   @Override
   public String toString() {
       return super.toString() + " (extended)";  
   }
   ``` :contentReference[oaicite:13]{index=13}  
   ````

---

## Practical Tips for Beginners

* **Order Matters**: In a subclass constructor, `super(...)` must come before any use of `this` or other code. ([Oracle Docs][5])
* **Avoid Shadowing**: While it’s legal to name parameters the same as fields, excessive use of `this` can clutter code—choose clear variable names when possible. ([GeeksforGeeks][3])
* **Limit Overuse of `super`**: Accessing hidden fields often indicates poor design; prefer protected or public getters when sharing state with subclasses. ([GeeksforGeeks][9])
* **Remember Constructor Chaining**: Use `this(...)` for simpler initializations within the same class and `super(...)` to leverage parent class setup. ([Baeldung][10])

With this understanding of `this` and `super`, you can write clearer constructors, properly override methods, and build well‑structured class hierarchies in Java.

[1]: https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html?utm_source=chatgpt.com "Using the this Keyword (The Java™ Tutorials > Learning the Java ..."
[2]: https://docs.oracle.com/javase/tutorial/java/IandI/super.html?utm_source=chatgpt.com "Using the Keyword super - Java™ Tutorials"
[3]: https://www.geeksforgeeks.org/this-reference-in-java/?utm_source=chatgpt.com "'this' reference in Java - GeeksforGeeks"
[4]: https://www.geeksforgeeks.org/difference-between-this-and-this-in-java/?utm_source=chatgpt.com "Difference Between this and this() in Java - GeeksforGeeks"
[5]: https://docs.oracle.com/en/java/javase/22/language/statements-super.html?utm_source=chatgpt.com "3 Statements Before super(…) - Oracle Help Center"
[6]: https://www.baeldung.com/java-super?utm_source=chatgpt.com "Guide to the super Java Keyword | Baeldung"
[7]: https://www.geeksforgeeks.org/using-the-super-keyword-to-call-a-base-class-constructor-in-java/?utm_source=chatgpt.com "Using the super Keyword to Call a Base Class Constructor in Java"
[8]: https://www.geeksforgeeks.org/super-keyword/?utm_source=chatgpt.com "Super Keyword in Java | GeeksforGeeks"
[9]: https://www.geeksforgeeks.org/super-and-this-keywords-in-java/?utm_source=chatgpt.com "super and this keywords in Java | GeeksforGeeks"
[10]: https://www.baeldung.com/java-statements-before-super-constructor?utm_source=chatgpt.com "Statements Before super() in Java | Baeldung"
