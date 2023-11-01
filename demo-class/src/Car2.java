public class Car2 {
    
    String make;
    
    String model;

    String year;

    private char[] getMake;

    // Empty Constructor of Car 沒有的話java會自己默認有
    // After "new Car()", the 3 instan variables do exist inside the object
    public Car2() {

    }

    // Constructor signature can't be duplicated
    public Car2(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car2(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2(); // object is created in heap
        c1 = new Car2(); // this is another new Car

        // c1 is object reference (with memory address) -> found
        // Use the method inside the object to set value, then "abc"

        c1.setMake("abc");
        c1.setModel("xyz");
        c1.setYear("2020");

System.out.println(c1.getMake());

        Car2 c2 = new Car2();
        System.out.println(c2.getMake()); // null, because bever define a value to c2.setMake

        Car2 c3 = new Car2("cba", "ijk", "2023");
        System.out.println(c3.getMake()); // cba

        Car2  c4 = new Car2("aabbcc", "ddeeff");
        System.out.println(c4.getMake() + " " + c4.getModel());

        String str = "hello"; // str is an object reference in stack
        // "hello" is an String object in heap

        

    }



}
