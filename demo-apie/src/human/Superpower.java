package human;

public interface Superpower {

    void fly();

    default void precognition() {
        System.out.println("I got precognition power");
    }
    
}
