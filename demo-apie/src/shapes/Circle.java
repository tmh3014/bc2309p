package shapes;

import enums.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape{

    private double radius;

    // Encapsulation
    public static Circle of(double radius, Color color) { // Over-loading
        return new Circle(radius, color);
    }

    public static Circle of(double radius) {
        return new Circle(radius, Color.BLACK);
    }

    public static Circle ofBlue(double radius) {
        return new Circle(radius, Color.BLUE);
    }


    // constructor
    private Circle(double radius, enums.Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void setColor(Color color) {
        // this.color = color;
        super.setColor(color);
        // this.radius += 1.0; // bug because double + double
        this.radius = BigDecimal.valueOf(this.radius).add(BigDecimal.ONE).doubleValue();
    }

    // getter, setter
    public BigDecimal getRadius() {
        return BigDecimal.valueOf(this.radius);
    }

    public void setRadius(double radius) {
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

        Shape shape = new Circle(4, Color.WHITE);
        System.out.println(shape.getClass());
        System.out.println(shape.area(RoundingMode.FLOOR, 2)); // 4 * 4 * 3.14159..

        Circle circle2 = Circle.ofBlue(5);
        Circle circle3 = Circle.of(Color.WHITE);
        Circle circle4 = Circle.of(3.9);
        Circle circle5 = Circle.of(3.9, Color.BLACK);

        System.out.println(circle.getRadius().floatValue());

        // valueOf() -> static method
        String str = String.valueOf(1); // "1"
        String str2 = String.valueOf('1'); // "1"
        String str3 = String.valueOf(true); // true
    }
    

}
