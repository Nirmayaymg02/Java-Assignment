interface Vehicles {
    void start();
}
interface Features {
    void displayFeature();
}
class Car implements Vehicles, Features {
    public void start() {
        System.out.println("Car starts with a button.");
    }
    public void displayFeature() {
        System.out.println("Car has air a music system.");
    }
}
public class InheritanceExample4InterfaceExample2 {
    public static void main(String[] args) {
        Vehicles car = new Car();
        car.start();
        Car myCar = new Car();
        myCar.displayFeature();

    }
}
