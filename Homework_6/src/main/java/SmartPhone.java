/**
 * 1) Write a simple java program to demonstrate composition of classes.
 * Tips:
 *  a) Create several classes A, B, C;
 *  b) Add functionality of classes B and C to the class A without using inheritance.
 *  c) Create a test class and demonstrate how we can use functionality of classes B and C via created object of the class A;
 */

public class SmartPhone {
    String chargingInterfaceType;
    public boolean isCharging;
    ChargingCable chargingCable;
    ChargingPlug chargingPlug;

    public void connectChargingSet(ChargingCable chargingCable, ChargingPlug chargingPlug) {
        this.chargingCable = chargingCable;
        this.chargingPlug = chargingPlug;
        System.out.println("Charging set is connected to phone");
    }

    public void charge() {
        System.out.println("Phone is charging");
        this.isCharging = true;
    }

    public void connectCableToPlug(ChargingCable chargingCable) {
        chargingCable.connectToPlug(chargingPlug);
    }

    public void connectPlugTOSocket() {
        chargingPlug.connectToSocket();
    }
}