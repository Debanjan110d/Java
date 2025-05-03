class cylinder {
    private double radius, height;

    cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getarea() {
        return Math.PI * radius * radius;
    }

    public double getvolume() {
        return Math.PI * radius * radius * height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

public class Q1 {
    public static void main(String[] args) {
        cylinder c = new cylinder(5, 2);
        // c.setRadius(0.5);
        // c.setHeight(2);
        System.out.println("Volume of cylinder: " + c.getvolume());
        System.out.println("Area of cylinder: " + c.getarea());

    }
}
