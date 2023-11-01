public class Inventory {
    // attribute, instance variable
    // primitives, wrapper class, String
    Stock[] stocks;

    static String location = "TST"; //static 公家share用            
    
    // Constructor signature 1 (with Stock parameter) 
    // no constructor -> there is one default constructor for you -> empty constructor
    public Inventory (Stock stock) {
        this.stocks = new Stock[100];
        this.stocks[0] = stock;
    //    this.location = location;
    }

    // public void setLocation(String location) {
    //    this.location = location;
    // }
    // Constructor signature 2 (no parameter)
    public Inventory() { 
        this.stocks = new Stock[100];
    }

    // method: return no of stock in the stock array
    public int size() {
        int count = 0;
        for (int i = 0; i < this.stocks.length; i++) {
            if (this.stocks[i] != null) {
                count++;
            }
        }
        return count;
        }


    public void add(Stock stock) {
        for (int i = 0; i < this.stocks.length; i++) {
            if (stocks[i] == null) {
                stocks[i] = stock;
                break;
            }
        }
    }

    public Stock[] getStocks() {
        return this.stocks;
    }

    public static void main(String[] args) {
        // new a Stock with price
        Stock stock = new Stock(99.9d); //call method from Stock.java
        // new an Inventory
        Inventory inventory = new Inventory();
        // how to set stock into an Inventory
        inventory.add(stock);
        inventory.add(stock);
        System.out.println(inventory.size());
        // how to print the price of the stock inside the inventory object
        // chain method
        // System.out.println(inventory.getStock().getPrice()); // 99.9
        for (int i = 0; i < inventory.getStocks().length; i++) {
            Stock s = inventory.getStocks()[i];
            if (s != null) {
        System.out.println("Stock " + i + ", price=" + inventory.getStocks()[i].getPrice());
        }


    }

    System.out.println(Inventory.location); // TST
    }

}
