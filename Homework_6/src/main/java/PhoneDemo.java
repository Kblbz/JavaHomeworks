public class PhoneDemo {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        ChargingCable chargingCable = new ChargingCable();
        ChargingPlug chargingPlug = new ChargingPlug();

        smartPhone.connectCableToPlug(chargingCable);
        smartPhone.connectChargingSet(chargingCable, chargingPlug);
        smartPhone.connectPlugTOSocket();
        smartPhone.charge();
    }
}
