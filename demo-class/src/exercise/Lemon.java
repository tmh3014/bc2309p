package exercise;

import exercise2.Apple;

public class Lemon {
    
    public static void main(String[] args) {
        Apple apple = new Apple();
        // apple.name;
        // because the attribute "name" is protected in the class Apple
        // and Lemon.java and Apple.java are in different folders

        // Because Cat.java is package-private
        // Cat cat = new Cat()
    }
}
