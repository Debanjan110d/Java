
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

    class Derived extends Base {
        public void printMe() {
            System.out.println("I am a derived constructor");
        }
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Base b = new Base();
        b.printMe();
    }
}
