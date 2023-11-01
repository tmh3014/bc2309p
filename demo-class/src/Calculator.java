public class Calculator {
    
    private int x;

    private int y;

    private int z;

    public int bmi() {
        return this.x + this.y + this.z;
    }

    public int substract() { 
        // Calculator c = new Calculator; 
        // c.setX(100);
        // c.setY(90);
        // call c.substract() -> 10
        // Calculator c2 = new Calculator;
        // c2.setX(12);
        // c2.setY(10);
        // call c2.substract() -> 2
        return this.x - this.y;
    }

    // For static method, usually we have parameter(s)
    public static int substract(int x, int y) { // Calculator.substract(10, 3);
        return x - y;
    }

    public void setX(int x) {
        this.x = x;

    public void setY(int y) {
            this.y = y;
        }
    }

    public int add() {
        return this.x + this.y;
    }

    public static int add(int x, int y) {
        return x + y;
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setX(100);
        calculator.setY(300);
        System.out.println(calculator.add()); // 400

    }
}
