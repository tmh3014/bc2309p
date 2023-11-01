package animal;

public class Dog extends Animal {

    private String name;

    //add name
    public Dog (double weight, double height, String name) {
        super(weight, height);
        this.name = name;
    } 
    
    public String sound() {
        return "Wo Wo";
    }

    public String toString() {
        return "Dog(name="+ this.name + ", Animal(" + super.toString() + "))";
    }

    public static void main(String[] args) {
        Dog dog = new Dog(12.0d, 13.0d, "ABC");
        System.out.println(dog);
        System.out.println(dog.getHeight());

    }
}
