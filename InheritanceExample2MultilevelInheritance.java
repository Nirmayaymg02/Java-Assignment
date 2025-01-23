class Grandparent {
    void wisdom() {
        System.out.println("Grandparent shares wisdom.");
    }
}


class Parent extends Grandparent {
    void guidance() {
        System.out.println("Parent gives guidance.");
    }
}


class Child extends Parent {
    void play() {
        System.out.println("Child likes to play.");
    }
}

public class InheritanceExample2MultilevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.wisdom();  // From Grandparent
        child.guidance(); // From Parent
        child.play();
    }
}
