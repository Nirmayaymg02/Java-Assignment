class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}


public class InheritanceExample1SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark();
    }
}
