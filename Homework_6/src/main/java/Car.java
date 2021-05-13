/**
 * 3) Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally, create
 * another class, a specific type of Car that inherits from the Car class. You should be able to hand steering, changing
 * gears, and moving(speed in other words). You will want to decide where to put the appropriate state and behaviours
 * (fields and methods).
 * As mentioned above, changing gears, increasing/decreasing speed should be included. For you specific type of vehicle you
 * will want to add something specific for that type of car.
 */

public class Car extends Vehicle {
    private char gear;

    public Car(String name, String size) {
        super(name, size);
        this.gear = 'N';
    }

    @Override
    public void steer(int direction) {
        super.steer(direction);
        System.out.println("Car is steering at " + getCurrentDirection() + "degrees.");
    }


    @Override
    public void move(int velocity, int direction) {
        super.move(velocity, direction);
        System.out.println("Car is moving at " + getCurrentVelocity() + " km/h in " +
                "direction " + getCurrentDirection() + " degrees");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Car's current velocity is " + getCurrentVelocity() + " The car has stopped");
    }

    @Override
    public int getCurrentVelocity() {
        System.out.println("Current velocity is: " + super.getCurrentVelocity());
        return super.getCurrentVelocity();
    }

   /* @Override
    public int getCurrentDirection() {
        return currentDirection;
    }*/


    public void changeGear(char gear) {
        switch (gear) {
            case 'R':
                System.out.println("Reverse gear is switched on");
                break;
            case 'N':
                System.out.println("Neutral gear is switched on");
                break;
            case '1':
                System.out.println("First gear is switched on");
                break;
            case '2':
                System.out.println("Second gear is switched on");
                break;
            case '3':
                System.out.println("Third gear is switched on");
                break;
            case '4':
                System.out.println("Fourth gear is switched on");
                break;
            case '5':
                System.out.println("Fifth gear is switched on");
                break;
            case '6':
                System.out.println("Sixth gear is switched on");
                break;
            case '7':
                System.out.println("Seventh gear is switched on");
                break;
            default:
                System.out.println("Gear is not fully switched. Switch it on completely");
                break;
        }
    }

}