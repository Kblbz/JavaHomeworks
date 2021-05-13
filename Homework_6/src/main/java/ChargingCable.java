public class ChargingCable {
    String cableTypeToPLug;
    String cableTypeToPhone;
    ChargingPlug chargingPlug;


    public void connectToPlug(ChargingPlug chargingPlug) {
        this.chargingPlug = chargingPlug;
        System.out.println("Cable is connected to plug");
    }
}

