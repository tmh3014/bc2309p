package animal;

public class Dog2 extends Mammal{

    private String name;

    public Dog2() {
        // super(); 本來就會call，所以不用寫出來都得
    }

    // constructor不能繼承，但會被called
    public Dog2(String name, double weight, double height) {
        super(weight, height);
        this.name = name;
    }
    
    // 3. class has to implement all abstract methods
    // public abstract void sound() {

    @Override
    public void sound() {
        System.out.println("barking...");
    }

    
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        System.out.println(dog2.getHeight()); // 0.0
    }

    }

