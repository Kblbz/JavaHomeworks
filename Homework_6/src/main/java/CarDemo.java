public class CarDemo {
    public static void main(String[] args) {
        ChameleonCar cham = new ChameleonCar();
        cham.getCurrentVelocity();
        cham.move(20, 15);
        cham.getCurrentVelocity();
        cham.getCurrentDirection();

    }
}
