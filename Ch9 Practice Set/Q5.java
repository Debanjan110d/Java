
class circle {
    double radius;

    circle(double radius) {
        this.radius = radius;// Needed in using getter
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Q5 {
    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.println("Area of circle: " + c.area());

    }
}
