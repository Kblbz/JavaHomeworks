public class RemoteControllerDemo {
    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        TV tv = new TV();
        controller.connectDevice(tv);
        controller.powerOn();
        controller.setChannel(10);
        controller.upVolume();
        controller.upVolume();
        controller.currentChannel();
        controller.mute();
        controller.upVolume();
        controller.powerOff();
        controller.disconnectDevice();
        controller.upVolume();
    }
}
