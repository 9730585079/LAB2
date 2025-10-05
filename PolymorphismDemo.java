// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Superclass reference holding Dog object
        Animal a;

        a = new Dog();  // runtime binding
        a.sound();      // Calls Dog's sound()

        a = new Cat();  // runtime binding
        a.sound();      // Calls Cat's sound()
    }
}
