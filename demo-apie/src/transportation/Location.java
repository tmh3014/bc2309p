package transportation;

public class Location {
    
    private int x; // 1 -> 10

    public Location() {
        this.x = 1;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isArrivedDestination() {
        return x >= 100;
    }

    public static void main(String[] args) {
        // one Bus & one Taxi
        // while loop, isArrivedDestination, exit loop, print bus or taxi win?

        Bus bus = new Bus(20);
        Taxi taxi = new Taxi(20);
        // taxi.accelerate();
        while (!bus.isArrivedDestination()
            && !taxi.isArrivedDestination()) {
                bus.move();
                if (bus.move().isArrivedDestination()) {
                    // bus.printWinner("Bus");
                    // System.out.println("Bus is winner!");
                    Movable.staticPrintWinner("Bus");
                    break;
                }
                taxi.move();
                if (taxi.move().isArrivedDestination()) {
                    // taxi.printWinner("Taxi");
                    // System.out.println("Taxi is winner!");
                    Movable.staticPrintWinner("Taxi");
                    break;
                }
                
            } 

            // who is winner?


        
        } 
    } 
    

