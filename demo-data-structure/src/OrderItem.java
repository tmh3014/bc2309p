import java.math.BigDecimal;

public class OrderItem{

    private int quantity;

    private double unitPrice;

    public OrderItem(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public double total() {
        return BigDecimal.valueOf(quantity) //
        .multiply(BigDecimal.valueOf(unitPrice)) //
        .doubleValue();
    }

    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem(3, 10);
        OrderItem orderItem2 = new OrderItem(1, 10.5);
        OrderItem orderItem3 = new OrderItem(7, 1.1);
        System.out.println(orderItem.total());
        System.out.println(orderItem2.total());
        System.out.println(orderItem3.total());
    }
}

