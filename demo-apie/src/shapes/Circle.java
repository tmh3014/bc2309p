package shapes;

import enums.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape{

    private double radius;

    // constructor
    public Circle(double radius, enums.Color color) {
        super(color);
        this.radius = radius;
    }

    // getter, setter
    public double getRadius() {
        return this.radius;
    }

    public void serRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    @Override
    public double area(RoundingMode mode, int dp) {
    // BigDecimal -> valueOf()
    BigDecimal bRadius = BigDecimal.valueOf(this.radius);
    BigDecimal bPi = BigDecimal.valueOf(Math.PI);
    return bRadius.multiply(bRadius).multiply(bPi).setScale(dp, mode)
        .doubleValue();
    }

    //equals(), hashCode, toString
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (!(obj instanceof Circle))
        return false;
        Circle circle = (Circle) obj;
        return Objects.equals(circle.getRadius(), this.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.radius);
    }

    @Override
    public String toString() {
        return "Circle(radius=" + this.radius + ")";
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5, Color.BLACK);
        // long result = Math.round(circle.area() * 100);
        // double d1 = result / 100.0;
        // System.out.println(d1);

        System.out.println("circle area=" + circle.area(RoundingMode.HALF_UP, 2)); // 38.48451000647496

        Shape shape = new Circle(4.0, Color.WHITE);
        System.out.println(shape.getClass());
        System.out.println(shape.area(RoundingMode.FLOOR, 2)); // 4 * 4 * 3.14159..
    }
    

}
