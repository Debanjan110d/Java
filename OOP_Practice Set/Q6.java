class Circle {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        System.out.println("Area of the circle: " + 3.14 * radius * radius);

        return 3.14 * radius * radius;
    }

    public double circumference() {
        return 2 * 3.14 * radius;
    }

}

public class Q6 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        c.area();
        System.out.println("Circumference of the circle: " + c.circumference());
    }
}
