class rectangle {
    private int length, breadth;

    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

public class Q4 {
    public static void main(String[] args) {
        rectangle r = new rectangle(4, 5);
        System.out.println(r.area());
        System.out.println(r.perimeter());

    }
}
