public class FlyableDemo {

    public static void fly (Flyable flyable) {
        flyable.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Duck duck = new Duck();

        fly(bird);
        fly(duck);
    }
}

