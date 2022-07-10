package classroom;

public class Circle {
    final double PI = 3.14;
    double radius;

    //PI*R^2

    public double circleArea(double radius) {
        this.radius = PI * (radius * radius);
        return this.radius;

        // return PI * (radius * radius);
    }
}
