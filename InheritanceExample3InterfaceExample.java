interface Animals {
    void sound(); // Abstract method
}


class DogA implements Animals {
    public void sound() {
        System.out.println("Dog barks.");
    }
}


class Cat implements Animals {
    public void sound() {
        System.out.println("Cat meows.");
    }
}
public class InheritanceExample3InterfaceExample {
    public static void main(String[] args) {
        Animals dog = new DogA();
        Animals cat = new Cat();


        dog.sound();
        cat.sound();

    }
}
