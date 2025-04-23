class square {
    void area(int a) {
        System.out.println("The area of the square is: " + a * a);
    }

    void primenter(int a) {
        System.out.println("The perimeter of the square is: " + 4 * a);
    }
}

public class Q3 {
    public static void main(String[] args) {
        square s = new square();
        s.area(5);
        s.primenter(5);
    }
}
