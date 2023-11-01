import java.math.BigDecimal;

public class Circle {
    // area
    // radius * radius * pi (3.14)
    // Math.PI

    double radius;

    String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        // BigDecimal
        BigDecimal radius = BigDecimal.valueOf(this.radius);
        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        return radius.multiply(radius).multiply(pi).doubleValue();
    } 

    public static void main(String[] args) {
        // new Circle
        Circle circle = new Circle(1.0, "RED");
        System.out.println(circle.area() + " " + circle.color);;

        Circle circle2 = new Circle();
        circle2.setRadius(3.3);
        circle2.setColor("YELLOW");
        System.out.println(circle2.area() + " " + circle2.color);

    }
}
