// Main class to demonstrate OOP terminologies
public class Main {

    public static void main(String[] args) {
        // Object instantiation
        Dog myDog = new Dog("Buddy", 3);
        myDog.bark();
        myDog.showDetails();

        Cat myCat = new Cat("Whiskers", 2);
        myCat.meow();
        myCat.showDetails();

        // Demonstrating Polymorphism
        Animal myAnimal1 = new Dog("Charlie", 4);
        Animal myAnimal2 = new Cat("Luna", 1);

        myAnimal1.makeSound(); // Outputs: Bark
        myAnimal2.makeSound(); // Outputs: Meow

        // Demonstrating Inheritance
        myAnimal1.showDetails(); // Outputs: Dog details
        myAnimal2.showDetails(); // Outputs: Cat details
    }
}

// Abstraction: Animal is an abstract class
abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound(); // Abstract method

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheritance: Dog is a subclass of Animal
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    void bark() {
        System.out.println("Bark");
    }

    // Implementing the abstract method
    void makeSound(){
        bark();
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Type:Dog");
    }
}

// Inheritance: Cat is a subclass of Animal
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void meow() {
        System.out.println("Meow");
    }

    //Implementing the abstract class
    void makeSound(){
        meow();
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Type:Cat");
    }
}