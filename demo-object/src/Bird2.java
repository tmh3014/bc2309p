public class Bird2 { // implicitly 
    
    private String name;

    private final String color = "Yellow"; //final之後，可以getter，不能setter

    public String getColor() {
        return this.color;
    }

    // public void setColor(String color) {
    //     this.color = color;
    // }


    @Override
    public String toString() {
        return "Bird2(name=" + this.name + ")";
    }
    // Final method cannot be Overriden
    public final void fly() {
        System.out.println("this is final fly() method.");
    }

    public static void main(String[] args) {
        Bird2 bird2 = new Bird2();
        System.out.println(bird2.toString()); // Bird(name=null)

        // if not @Override toString -> Bird@7344699f -> Object reference
        Object object = new Object();
        object = "123";
        System.out.println(object.getClass()); // class java.lang.String
        object = 123;
        System.out.println(object.getClass()); // class java.lang.Integer
        object = 0.0;
        System.out.println(object.getClass()); // class java.lang.Double
        object = new Bird2();
        System.out.println(object.getClass()); // class Bird
        // object = 100; Integer.class
        
        
        if (object instanceof Bird) { // true
        // downcase from Object.class to Bird.class
        Bird2 b = (Bird2) object;
        b.fly();

        
        }

    }
}
