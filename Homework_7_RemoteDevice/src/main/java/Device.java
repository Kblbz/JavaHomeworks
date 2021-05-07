/**
 * The "Device" interface should have methods powerOn(), powerOff(), setChannel(int channel),
 *  and currentChannel();
 */

public interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void currentChannel();
}
