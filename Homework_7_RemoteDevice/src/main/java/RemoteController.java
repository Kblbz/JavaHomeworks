//Write a class RemoteController to control your TV.

public class RemoteController implements Device, Volume {
    private TVDevice tvDevice;

    public void connectDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
        System.out.println("Device is connected");
    }

    public void disconnectDevice() {
        this.tvDevice = null;
        System.out.println("Device is disconnected");
    }

    @Override
    public void upVolume() {
        this.tvDevice.upVolume();
    }

    @Override
    public void downVolume() {
        this.tvDevice.downVolume();
    }

    @Override
    public void mute() {
        this.tvDevice.mute();
    }

    @Override
    public void powerOn() {
        this.tvDevice.powerOn();
    }

    @Override
    public void powerOff() {
        this.tvDevice.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        this.tvDevice.setChannel(channel);
    }

    @Override
    public void currentChannel() {
        this.tvDevice.currentChannel();
    }
}
