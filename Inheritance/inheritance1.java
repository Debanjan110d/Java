
class Base {
    int x;

    // Base(int x){
    // this.x=x;
    // }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }

}

class Derived extends Base {
    public int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

    public void printMe() {
        System.out.println("I am a derived constructor");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
        b.printMe();

        Derived d = new Derived();
        d.setX(10);
        d.sety(20);
        System.out.println(d.getX());
        System.out.println(d.gety());
        d.printMe();
    }
}
