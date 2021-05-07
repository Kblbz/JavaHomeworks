/**
 * 3) Create two interfaces Volume and State:
 * interface Volume {
 *     void changeVolume(double value);
 * }
 *
 * interface State {
 *    void on();
 *    void off();
 * }
 *
 * Create a new class "MyDevice" which implements both interfaces. Provide your implementations of methods.
 */


public class MyDevice implements Volume, State{

    @Override
    public void off() {
        System.out.println("This device is off");
    }

    @Override
    public void on() {
        System.out.println("This device is on");
    }

    @Override
    public void changeVolume(double value) {
        System.out.println("Changing volume to " + value);
    }
}