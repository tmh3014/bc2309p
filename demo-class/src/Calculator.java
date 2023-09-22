public class Calculator {
    
    int x;

    int y;

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
