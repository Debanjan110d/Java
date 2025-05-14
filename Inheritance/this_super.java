/**
 * The class EkBaseClass has an integer field a, a constructor to initialize a,
 * a method getA to
 * retrieve the value of a, and a method retirnone that returns 1.
 */

class EkBaseClass {
    int a;

    public int getA() {
        return a;
    }

    // The `EkBaseClass(int v)` constructor in the `EkBaseClass` class is
    // initializing the integer field
    // `a` with the value passed as an argument `v`. Inside the constructor, `this.a
    // = v;` assigns the
    // value of `v` to the `a` field of the current object (instance of
    // `EkBaseClass`). This allows the
    // object to be initialized with a specific value for the `a` field when it is
    // created.
    EkBaseClass(int v) {
        this.a = v;
    }

    public int retirnone() {
        return 1;
    }
}

class EkDerivedClass extends EkBaseClass {

    public EkDerivedClass(int a) {
        // this - current object
        // super - parent object
        super(a); // calls EkBaseClass constructor with argument a
        System.out.println("Derived class constructor called");
    }

    /**
     * The above function in Java overrides a method from the superclass and
     * increments the returned value
     * by 1.
     * 
     * @return The method `retirnone()` is being overridden in the current class,
     *         and it returns the result
     *         of calling the superclass's `retirnone()` method and adding 1 to it.
     */
    public int retirnone() {
        return super.retirnone() + 1;
    }
}

public class this_super {

    // The `main` method in the `this_super` class is the entry point of the Java
    // program. Here's what the
    // code inside `main` is doing:
    public static void main(String[] args) {
        EkDerivedClass x = new EkDerivedClass(5);
        System.out.println(x.getA());
        System.out.println(x.retirnone());

    }

}
