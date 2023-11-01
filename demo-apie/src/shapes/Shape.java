package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import enums.Color;

public abstract class Shape {

    private Color color;

    public static Shape[] shapes;

    static{
        shapes = new Shape[10];
    }

    public static void add(Shape shape) {
        // add shape into shapes
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null)
                shapes[i] = shape;
                return;
        }
    }

    public Shape(Color color) {
        this.color = color;
    }

    abstract double area(RoundingMode mode, int dp);
        
    public Color getColor() {
        return this.color;
    }

    public static double totalArea(Shape[] shapes) {
        BigDecimal total = new BigDecimal(0.0);
        for (int i = 0; i < shapes.length; i++) {
        if (shapes[i] != null) {
            // shapes[i].area -> Polymorphism
            total = total
                .add(BigDecimal.valueOf(shapes[i].area(RoundingMode.FLOOR, 2)));
        }
        }
        return total.doubleValue(); // 178.53
    }

    public static void main(String[] args) {
        // new 2 Circle and 1 Square, and put them into the Shape[]
        Circle c1 = new Circle(3, Color.BLUE);
        Circle c2 = new Circle(4, Color.BLACK);
        Square s1 = new Square(3, Color.BLACK);
        Shape.add(c1);
        Shape.add(c2);
        Shape.add(s1);
        System.out.println(Shape.totalArea(shapes)); // 
    }
}
