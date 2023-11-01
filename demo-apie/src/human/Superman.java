package human;

public class Superman extends Human implements Superpower, Life{

    private String name;

    public Superman(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public void fly() {
        System.out.println("I am a Superman, and flying...");
    }  

    @Override
    public void eat() {
        System.out.println("I eat Burger.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep 8 hours every night.");
    }
    
    @Override
    public void run() {
        System.out.println("I am running");
    }

    @Override
    public void drink() {
        System.out.println("Taste good.");
    }

    public static void main(String[] args) {
        // Polymorphism
        Superman s = new Superman("Tommy");
        // s is an object reference
        // this object reference is pointing to an Superman Object.

        Human h = new Superman("Mary");
        // Compile time check
        // h.getName();  // No getName from h, as h is object reference declared by Human
        h.run(); // I am running ... (during runtime, the object performs behaviour)
        h.drink();
        s.run();
        Life l = new Superman("Jane");
        l.eat();
    }
}
