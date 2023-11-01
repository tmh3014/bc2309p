package animal;

// abstract class can extend abstract class
public abstract class Mammal extends Animal2{

    // attribute

    public Mammal(double weight, double height) {
        super(weight, height);
    }

    public Mammal() {
        
    }

    public abstract void sound();

    

    
}
