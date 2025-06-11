// Activity: Create a class Animal with method makeSound(). Inherit Dog, Cat, and Cow classes and override the method to produce their respective sounds. Use these classes in the main program.


// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Derived classes
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woooof! Woooooooof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meoooooow! Meooooooooow!");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Mooooooooow! Moooooooooow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        // Calling overridden methods
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
