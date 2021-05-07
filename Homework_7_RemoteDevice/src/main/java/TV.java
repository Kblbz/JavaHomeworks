//Write a class "TV" which extends the class TVDevice. Implements all the methods.

public class TV extends TVDevice {
    private int volumeLevel;
    private int channelNumber;

    @Override
    public void powerOn() {
        System.out.println("TV is turned on");
        this.isOn = true;
    }

    @Override
    public void powerOff() {
        System.out.println("TV is turned off");
        this.isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        this.channelNumber = (channel);
        System.out.println("Channel " + channel + " is set");
    }

    @Override
    public void currentChannel() {
        System.out.println("Current channel number is " + channelNumber);
    }

    @Override
    public void upVolume() {
        System.out.println("Increasing the volume level");
        this.volumeLevel +=1;
        System.out.println("Current volume is " + volumeLevel);
    }

    @Override
    public void downVolume() {
        System.out.println("Decreasing the volume level");
        this.volumeLevel -=1;
        System.out.println("Current volume is " + volumeLevel);
    }

    @Override
    public void mute() {
        System.out.println("Decreasing the volume level");
        this.volumeLevel =0;
        System.out.println("Device is muted and volumeLevel is " + volumeLevel);
    }
}
