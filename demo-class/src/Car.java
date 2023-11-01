public class Car {
    
    char transmission; // M or A

    String type; // Bus, mini-bus, taxi, private car

    int noOfSeats; // 7-seater, 5-seater, 2-seater

    int cylinderCapacity;

    public char[] getMake;

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    public int getNoOfSeats() {
      return this.noOfSeats;  
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
    public int getcylinderCapacity() {
        return this.cylinderCapacity;
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setType("Private car");
        car1.setNoOfSeats(5);
        car1.setCylinderCapacity(1500);
        System.out.println(car1.getType());
        System.out.println(car1.getNoOfSeats());
        System.out.println(car1.getcylinderCapacity());
        if (car1.cylinderCapacity == 0) {
            System.out.println("This is an electric car");
        } 
            System.out.println("This is a petrolium car.");
        
            
    }
    public void setYear(String string) {
    }
    public void setMake(String string) {
    }
    public void setModel(String string) {
    }
    public char[] getMake() {
        return null;
    }
}
