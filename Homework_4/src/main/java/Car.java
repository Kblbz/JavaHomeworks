public class Car {
    //car has engine
    Engine engine;
    Wheels wheels;

    public Car(Engine engine1, Wheels wheels1) {
        this.engine = engine1;
        this.wheels = wheels1;
    }

    public static void carIsRunning () {
        System.out.println("Car is running");
    }

}