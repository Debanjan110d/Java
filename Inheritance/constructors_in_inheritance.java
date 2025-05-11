class Base {
    public int x;

    Base() {
        System.out.println("I am a constructor");
    }

    Base(int a) {
        System.out.println("I am a overloaded  constructor : " + a);
        x = a;
    }

    public int getX() {
        return x;
    }

    public int setX(int x) {
        this.x = x;
        return x;
    }
}

class Derived extends Base {
    public int y;

    Derived() {
        super();
        System.out.println("I am a derived constructor");
    }

    Derived(int x, int y) {
        super(x);
        this.y = y;
        System.out.println("I am a derived overloaded constructor with parameters : " + x + ", " + y);
    }

    public int getY() {
        return y;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }
}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        Derived d = new Derived(10, 20);
    }
}
